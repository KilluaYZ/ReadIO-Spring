from __future__ import annotations

import argparse
import hashlib
import io
import json
import os
import posixpath
import sys
import zipfile
from dataclasses import asdict, dataclass, field
from concurrent.futures import ThreadPoolExecutor, as_completed
from threading import Lock
from pathlib import Path
from typing import List, Optional, Dict, Any

from bs4 import BeautifulSoup  # type: ignore
from ebooklib import epub, ITEM_IMAGE, ITEM_DOCUMENT  # type: ignore
from minio import Minio  # type: ignore

"""
解析 test/testbooks/ 目录下的多种电子书格式（chm / azw3 / mobi / epub），
抽取统一的结构：书名、作者、出版社、出版时间、章节、正文内容以及图片信息。

依赖三方库（建议写入项目的 requirements）：
  - ebooklib
  - beautifulsoup4
  - pillow            （如果后续需要把图片保存为文件，可选）
  - pychm             （如果需要直接解析 CHM，可选；当前实现对 CHM 走统一的 epub 转换流程）

当前实现策略：
  - 对于 epub：直接用 ebooklib 解析。
  - 对于 mobi / azw3 / chm：统一调用 calibre 的 `ebook-convert` 将其临时转换为 epub，
    再走同一套 epub 解析逻辑。这样可以少依赖一堆专有格式库，实现也更稳。

注意：
  - 需要本机安装 calibre（提供 `ebook-convert` 命令）。
  - 如果没有 calibre，可以把 `convert_to_epub_via_calibre` 里的逻辑替换成你已有的转换方案。
"""


@dataclass
class ImageInfo:
    """章节内图片的统一结构。"""

    id: str
    mime_type: Optional[str]
    file_name: Optional[str] = None
    url: Optional[str] = None  # 在 MinIO 中的对象路径，如 /readio/images/<sha256>.ext


@dataclass
class Chapter:
    """章节信息。"""

    index: int
    title: str
    content: str
    images: List[ImageInfo] = field(default_factory=list)


@dataclass
class Book:
    """一本书的统一结构。"""

    book_name: str
    file_path: str
    authors: List[str] = field(default_factory=list)
    publisher: Optional[str] = None
    publish_date: Optional[str] = None
    chapters: List[Chapter] = field(default_factory=list)


class MinioImageUploader:
    """
    将图片上传到 MinIO，并返回一个可访问的 URL。

    这里直接使用 docker-compose.dev.yml 中的开发环境配置：
      - endpoint: localhost:26003
      - access_key: readio
      - secret_key: readio123
      - bucket: readio
      - 路径前缀: images/
    在 JSON 中仅保存对象路径（不包含协议和主机），形如: /readio/images/<sha256>.ext
    """

    def __init__(
        self,
        endpoint: str = "localhost:26003",
        access_key: str = "readio",
        secret_key: str = "readio123",
        bucket: str = "readio",
        secure: bool = False,
        object_prefix: str = "images/",
    ) -> None:
        self.client = Minio(
            endpoint,
            access_key=access_key,
            secret_key=secret_key,
            secure=secure,
        )
        self.bucket = bucket
        self.object_prefix = object_prefix.rstrip("/") + "/"

        # 确保 bucket 存在
        if not self.client.bucket_exists(self.bucket):
            self.client.make_bucket(self.bucket)

    def upload_image(
        self,
        content: bytes,
        mime_type: Optional[str],
        original_file_name: str,
    ) -> str:
        """
        上传图片并返回可直接访问的 URL。
        使用内容的 sha256 作为文件名，避免重复存储。
        """

        # 计算内容的 sha256 摘要
        sha256 = hashlib.sha256(content).hexdigest()

        # 根据原始文件名提取扩展名（保持原有后缀，便于预览）
        ext = os.path.splitext(original_file_name)[1] or ""
        object_name = f"{self.object_prefix}{sha256}{ext}"

        data = io.BytesIO(content)
        self.client.put_object(
            self.bucket,
            object_name,
            data,
            length=len(content),
            content_type=mime_type or "application/octet-stream",
        )

        # 仅返回对象路径（不含协议和主机），方便上层按环境拼接完整 URL
        return f"/{self.bucket}/{object_name}"


# MOBI/Palm 格式：calibre 在解析时读取偏移 76–78 字节，文件至少需 78 字节
_MIN_MOBI_HEADER_BYTES = 78
# Palm Database 在偏移 60 处的 4 字节类型：TEXt(PalmDOC) / BOOK(MobiPocket) / MOBI(KF8)
_MOBI_MAGIC_BYTES = (b"TEXt", b"BOOK", b"MOBI")


def _check_mobi_azw3_validity(path: Path) -> Optional[str]:
    """
    在转换前检查 mobi/azw3 是否看起来有效（大小与魔数）。
    若无效则返回简短原因字符串，有效则返回 None。
    """
    try:
        size = path.stat().st_size
    except OSError:
        return "无法读取文件大小"
    if size < _MIN_MOBI_HEADER_BYTES:
        return f"文件过短（{size} 字节），无法解析 MOBI 头（至少需 {_MIN_MOBI_HEADER_BYTES} 字节），可能已损坏或非标准格式"
    try:
        with path.open("rb") as f:
            f.seek(60)
            magic = f.read(4)
    except OSError:
        return "无法读取文件头"
    if magic not in _MOBI_MAGIC_BYTES:
        return "无法识别的 MOBI/azw3 魔数，可能非标准格式或已损坏"
    return None


def _friendly_calibre_error(err_message: str) -> str:
    """
    根据 ebook-convert 的 stderr 内容，返回更友好的简短提示。
    """
    if "SplitError" in err_message or "Could not find reasonable point at which to split" in err_message:
        return "EPUB 转换时无法拆分过大章节（单章 HTML 过大且无合适断点），建议用 Calibre 客户端单独转换或跳过"
    if "struct.error" in err_message or "unpack requires a buffer" in err_message:
        return "MOBI 文件头解析失败，可能已损坏或为非标准 MOBI 格式"
    if "MobiReader" in err_message or "mobi6" in err_message:
        return "MOBI 格式解析失败，可能已损坏或为非标准/加密文件"
    # 其他 calibre 错误只保留第一行或截断过长信息
    lines = err_message.strip().split("\n")
    for line in lines:
        line = line.strip()
        if line and not line.startswith("File ") and "Traceback" not in line:
            if len(line) > 200:
                return line[:200] + "…"
            return line
    return "Calibre 转换失败，请检查文件是否损坏或格式是否支持"


def _run_cmd(cmd: List[str]) -> None:
    """简单封装 subprocess，避免在顶部导入太多库。"""

    import subprocess

    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
    if result.returncode != 0:
        raise RuntimeError(
            f"命令执行失败: {' '.join(cmd)}\nstdout:\n{result.stdout}\nstderr:\n{result.stderr}"
        )


def convert_to_epub_via_calibre(src_path: Path, tmp_dir: Path) -> Path:
    """
    使用 calibre 的 `ebook-convert` 将任意格式（chm/azw3/mobi/epub/...）
    统一转换为 epub，返回转换后的 epub 路径。
    """

    tmp_dir.mkdir(parents=True, exist_ok=True)
    out_path = tmp_dir / (src_path.stem + ".epub")

    if out_path.exists():
        return out_path

    cmd = ["ebook-convert", str(src_path), str(out_path)]
    _run_cmd(cmd)
    if not out_path.exists():
        raise RuntimeError(f"ebook-convert 执行后未找到输出文件: {out_path}")
    return out_path


def _try_fix_epub_opf_namespace(epub_path: Path) -> Optional[Path]:
    """
    部分 EPUB 存在 OPS/fb.opf 中 namespace 写错（例如把 xmlns 写成 mlns），
    会导致 ebooklib 在读取 metadata 时出现 `'NoneType' object has no attribute 'nsmap'`。
    这里做一次非常保守的修复：简单把 .opf 文件里的 'mlns:' / 'mlns=' 替换成 'xmlns:' / 'xmlns='，
    生成一个新的 .fixed.epub 文件返回路径；如果失败则返回 None。
    """

    try:
        fixed_path = epub_path.with_suffix(".fixed.epub")
        with zipfile.ZipFile(epub_path, "r") as zin, zipfile.ZipFile(
            fixed_path, "w", compression=zipfile.ZIP_DEFLATED
        ) as zout:
            for item in zin.infolist():
                data = zin.read(item.filename)
                if item.filename.lower().endswith(".opf"):
                    try:
                        text = data.decode("utf-8", errors="ignore")
                        text = text.replace("mlns:", "xmlns:").replace("mlns=", "xmlns=")
                        data = text.encode("utf-8")
                    except Exception:
                        # 解码失败就原样写回
                        pass
                zout.writestr(item, data)
        return fixed_path
    except Exception:
        return None


def _parse_epub_with_ebooklib(
    epub_path: Path,
    original_file_path: Path,
    uploader: Optional[MinioImageUploader],
) -> Book:
    """
    首选的解析路径：使用 ebooklib 读取 EPUB。
    调用方应在外层捕获 AttributeError/KeyError 等错误并决定是否走兜底解析。
    """

    book_obj = epub.read_epub(str(epub_path))

    # 元数据获取
    def _get_first(meta_key: str) -> Optional[str]:
        vals = book_obj.get_metadata("DC", meta_key)
        if not vals:
            return None
        # ebooklib 返回 [(value, attrs), ...]
        val = vals[0][0]
        return str(val) if val is not None else None

    book_name = _get_first("title") or original_file_path.stem
    authors_raw = book_obj.get_metadata("DC", "creator")
    authors = [a[0] for a in authors_raw if a and a[0]] if authors_raw else []

    publisher = _get_first("publisher")
    publish_date = _get_first("date")

    # 收集所有图片（全书范围），并上传到 MinIO，保存可访问 URL
    image_items: Dict[str, ImageInfo] = {}
    for item in book_obj.get_items():
        if item.get_type() == ITEM_IMAGE:
            content = item.get_content()
            url: Optional[str] = None
            if uploader is not None:
                try:
                    url = uploader.upload_image(
                        content=content,
                        mime_type=item.media_type,
                        original_file_name=item.get_name(),
                    )
                except Exception as upload_err:
                    # 上传失败时不中断整体解析，只是图片 URL 为空并打印警告
                    print(
                        f"图片上传失败，已跳过: {item.get_name()}，原因: {upload_err}",
                        file=sys.stderr,
                    )
            image_items[item.get_name()] = ImageInfo(
                id=item.get_id(),
                mime_type=item.media_type,
                file_name=item.get_name(),
                url=url,
            )

    # 解析章节：按照 spine 顺序，把每个文档的 HTML 解析为文本，并尝试用 <h1>/<h2>/<h3> 分段
    chapters: List[Chapter] = []
    chapter_index = 0

    for item in book_obj.get_items():
        if item.get_type() != ITEM_DOCUMENT:
            continue

        html = item.get_content()
        soup = BeautifulSoup(html, "html.parser")

        # 用标题标签做章节分割点
        current_title = None
        current_parts: List[str] = []
        current_images: List[ImageInfo] = []

        def flush_chapter():
            nonlocal chapter_index, current_title, current_parts, current_images
            if not current_parts and not current_title:
                return
            text = "\n".join(current_parts).strip()
            if not text and not current_images:
                current_title = None
                current_parts = []
                current_images = []
                return
            chapters.append(
                Chapter(
                    index=chapter_index,
                    title=current_title or f"Chapter {chapter_index + 1}",
                    content=text,
                    images=current_images,
                )
            )
            chapter_index += 1
            current_title = None
            current_parts = []
            current_images = []

        for elem in soup.body.descendants if soup.body else []:
            if getattr(elem, "name", None) in {"h1", "h2", "h3"}:
                # 新章节开始
                flush_chapter()
                current_title = elem.get_text(strip=True)
            elif getattr(elem, "name", None) == "img":
                src = elem.get("src")
                if not src:
                    continue
                # 有些 src 是相对路径（如 "Images/cover.jpg"），用它去全局 image_items 里找
                image = image_items.get(src)
                if image:
                    current_images.append(image)
            elif getattr(elem, "name", None) is None:
                # 文本节点
                text = str(elem).strip()
                if text:
                    current_parts.append(text)

        # 最后一个章节
        flush_chapter()

    return Book(
        book_name=book_name,
        file_path=str(original_file_path),
        authors=authors,
        publisher=publisher,
        publish_date=publish_date,
        chapters=chapters,
    )


def _parse_epub_zip_fallback(
    epub_path: Path,
    original_file_path: Path,
    uploader: Optional[MinioImageUploader],
) -> Book:
    """
    兜底解析：不依赖 ebooklib，而是直接把 EPUB 当 zip 解包，
    粗略提取章节（所有 .xhtml/.html/.htm）和图片。

    - 章节顺序：按文件名排序。
    - 标题：优先取文档内第一个 <h1>/<h2>/<h3>，否则使用文件名。
    - 元数据：书名用文件名，作者/出版社/出版时间留空。
    """

    chapters: List[Chapter] = []
    chapter_index = 0

    with zipfile.ZipFile(epub_path, "r") as zf:
        names = zf.namelist()
        html_files = [
            name
            for name in names
            if name.lower().endswith((".xhtml", ".html", ".htm"))
        ]

        def read_file(name: str) -> Optional[str]:
            try:
                data = zf.read(name)
                return data.decode("utf-8", errors="ignore")
            except Exception:
                return None

        def load_image(src: str, base_name: str) -> Optional[ImageInfo]:
            # 解析相对路径：以 HTML 文件所在目录为基准
            base_dir = posixpath.dirname(base_name)
            joined = posixpath.normpath(posixpath.join(base_dir, src))
            if joined not in names:
                # 有些书里 img 的 src 可能就是资源根路径
                if src in names:
                    joined_path = src
                else:
                    return None
            else:
                joined_path = joined

            try:
                content = zf.read(joined_path)
            except Exception:
                return None

            mime_type: Optional[str] = None
            lower = joined_path.lower()
            if lower.endswith(".jpg") or lower.endswith(".jpeg"):
                mime_type = "image/jpeg"
            elif lower.endswith(".png"):
                mime_type = "image/png"
            elif lower.endswith(".gif"):
                mime_type = "image/gif"
            elif lower.endswith(".webp"):
                mime_type = "image/webp"

            url: Optional[str] = None
            if uploader is not None:
                try:
                    url = uploader.upload_image(
                        content=content,
                        mime_type=mime_type,
                        original_file_name=posixpath.basename(joined_path),
                    )
                except Exception as upload_err:
                    print(
                        f"图片上传失败（fallback），已跳过: {joined_path}，原因: {upload_err}",
                        file=sys.stderr,
                    )

            return ImageInfo(
                id=joined_path,
                mime_type=mime_type,
                file_name=joined_path,
                url=url,
            )

        for html_name in sorted(html_files):
            text = read_file(html_name)
            if not text:
                continue

            soup = BeautifulSoup(text, "html.parser")

            current_title = None
            current_parts: List[str] = []
            current_images: List[ImageInfo] = []

            def flush_chapter():
                nonlocal chapter_index, current_title, current_parts, current_images
                if not current_parts and not current_images:
                    return
                content_text = "\n".join(current_parts).strip()
                title = (
                    current_title
                    or Path(original_file_path).stem
                    or Path(html_name).stem
                )
                chapters.append(
                    Chapter(
                        index=chapter_index,
                        title=title,
                        content=content_text,
                        images=current_images,
                    )
                )
                chapter_index += 1
                current_title = None
                current_parts = []
                current_images = []

            # 提取标题（文档级别）
            for tag_name in ("h1", "h2", "h3"):
                tag = soup.find(tag_name)
                if tag and tag.get_text(strip=True):
                    current_title = tag.get_text(strip=True)
                    break

            # 提取文本与图片
            for elem in soup.descendants:
                if getattr(elem, "name", None) == "img":
                    src = elem.get("src")
                    if not src:
                        continue
                    img = load_image(src, html_name)
                    if img:
                        current_images.append(img)
                elif getattr(elem, "name", None) is None:
                    t = str(elem).strip()
                    if t:
                        current_parts.append(t)

            flush_chapter()

    return Book(
        book_name=Path(original_file_path).stem,
        file_path=str(original_file_path),
        authors=[],
        publisher=None,
        publish_date=None,
        chapters=chapters,
    )


def parse_epub(
    epub_path: Path,
    original_file_path: Path,
    uploader: Optional[MinioImageUploader] = None,
) -> Book:
    """
    EPUB 解析总入口：
    1. 优先尝试 ebooklib。
    2. 如果遇到已知的元数据问题（nsmap / DC namespace KeyError），则退回到 zip 兜底解析。
    """

    # 首先尝试 ebooklib
    try:
        return _parse_epub_with_ebooklib(epub_path, original_file_path, uploader)
    except AttributeError as e:
        # `'NoneType' object has no attribute 'nsmap'` 之类问题，尝试修复 .opf 再试一次
        if "nsmap" not in str(e):
            # 其他 AttributeError 直接抛出
            raise
        fixed = _try_fix_epub_opf_namespace(epub_path)
        if fixed:
            try:
                return _parse_epub_with_ebooklib(fixed, original_file_path, uploader)
            except Exception:
                # 修复后依然失败，则走兜底解析
                pass
        # 无法修复或修复后仍失败，继续走兜底
    except KeyError as e:
        # ebooklib 解析某些 EPUB 时可能会抛出 KeyError('http://purl.org/dc/elements/1.1/')
        # 说明 DC namespace 声明异常，直接走兜底解析
        if "http://purl.org/dc/elements/1.1/" not in str(e):
            raise

    # 走到这里说明 ebooklib 失败，使用 zip 兜底解析
    print(
        f"提示: {epub_path} 使用 ebooklib 解析失败，改用 zip 兜底解析。",
        file=sys.stderr,
    )
    return _parse_epub_zip_fallback(epub_path, original_file_path, uploader)


def parse_book_file(
    path: Path,
    tmp_dir: Optional[Path] = None,
    uploader: Optional[MinioImageUploader] = None,
) -> Book:
    """
    总入口：根据扩展名选择解析策略。
    - epub：直接解析。
    - 其他（chm / azw3 / mobi 等）：先通过 calibre 转为 epub 再解析。
    """

    ext = path.suffix.lower()

    # 对于原生 EPUB，直接使用 zip 兜底解析逻辑，避免各种元数据兼容性问题，
    # 也不再生成 *.fixed.epub 这类中间文件。
    if ext == ".epub":
        return _parse_epub_zip_fallback(path, original_file_path=path, uploader=uploader)

    # mobi/azw3 转换前预检查：文件大小与魔数，跳过明显无效文件
    if ext in (".mobi", ".azw3"):
        reason = _check_mobi_azw3_validity(path)
        if reason is not None:
            raise ValueError(reason)

    # 其他格式（chm/azw3/mobi 等）仍然通过 calibre 转成 epub 再解析
    tmp_dir = tmp_dir or path.parent / ".tmp_epub"
    try:
        epub_path = convert_to_epub_via_calibre(path, tmp_dir)
        return parse_epub(epub_path, original_file_path=path, uploader=uploader)
    except RuntimeError as e:
        raise ValueError(_friendly_calibre_error(str(e))) from e


def _collect_book_paths(directory: Path, exts: List[str], recursive: bool = True) -> List[Path]:
    """
    在目录下收集待解析的电子书文件路径。
    - recursive: True 时递归所有子目录，False 时仅当前层。
    - 跳过 *.fixed.epub 等中间文件。
    """
    paths: List[Path] = []
    entries = directory.rglob("*") if recursive else directory.iterdir()
    for entry in entries:
        if not entry.is_file():
            continue
        if entry.name.endswith(".fixed.epub"):
            continue
        if entry.suffix.lower() not in exts:
            continue
        paths.append(entry)
    return sorted(paths)


def parse_directory(
    directory: Path,
    tmp_dir: Optional[Path] = None,
    exts: Optional[List[str]] = None,
    uploader: Optional[MinioImageUploader] = None,
    jobs: int = 1,
    recursive: bool = True,
) -> List[Book]:
    """
    扫描目录下的电子书文件，并批量解析。
    - exts: 限制解析的扩展名列表；默认解析 chm/azw3/mobi/epub。
    - recursive: True 时递归子目录查找书籍，False 时仅扫描当前层。
    """

    if exts is None:
        exts = [".chm", ".azw3", ".mobi", ".epub"]

    paths = _collect_book_paths(directory, exts, recursive=recursive)

    books: List[Book] = []
    total = len(paths)
    if total == 0:
        return books

    # 简单的进度计数
    counter = 0
    counter_lock = Lock()

    def _on_book_done(path: Path) -> None:
        nonlocal counter
        with counter_lock:
            counter += 1
            print(f"[进度] 已完成 {counter}/{total}: {path.name}", file=sys.stderr)

    # 串行模式
    if jobs <= 1 or len(paths) <= 1:
        for path in paths:
            try:
                book = parse_book_file(path, tmp_dir=tmp_dir, uploader=uploader)
                books.append(book)
                _on_book_done(path)
            except Exception as e:
                print(f"解析失败，已跳过文件: {path}，原因: {e}", file=sys.stderr)
        return books

    # 并行模式（多线程）
    max_workers = max(1, jobs)
    with ThreadPoolExecutor(max_workers=max_workers) as executor:
        future_to_path = {
            executor.submit(parse_book_file, path, tmp_dir, uploader): path
            for path in paths
        }
        for future in as_completed(future_to_path):
            path = future_to_path[future]
            try:
                book = future.result()
                books.append(book)
                _on_book_done(path)
            except Exception as e:
                print(f"解析失败，已跳过文件: {path}，原因: {e}", file=sys.stderr)

    return books


def books_to_json_serializable(books: List[Book]) -> List[Dict[str, Any]]:
    """将 Book 列表转换为适合 json.dump 的结构。"""

    def _default(o: Any):
        if isinstance(o, (Book, Chapter, ImageInfo)):
            return asdict(o)
        raise TypeError(f"无法序列化的类型: {type(o)}")

    # 用 _default 转一下，再从 JSON 字符串拉回 Python 对象，确保都是基本类型
    json_str = json.dumps(books, default=_default, ensure_ascii=False)
    return json.loads(json_str)


def main() -> None:
    parser = argparse.ArgumentParser(
        description="解析 chm/azw3/mobi/epub，抽取统一的图书结构（包含章节与图片）。"
    )
    parser.add_argument(
        "input",
        help="输入文件或目录路径（例如 test/testbooks/）",
    )
    parser.add_argument(
        "-o",
        "--output",
        help="输出 JSON 文件路径；不指定则打印到 stdout",
    )
    parser.add_argument(
        "--tmp-dir",
        help="转换中间文件存放目录（默认：和输入同目录下的 .tmp_epub）",
    )
    parser.add_argument(
        "--jobs",
        type=int,
        default=1,
        help="并行处理任务数（默认为 1，即串行；仅在输入为目录时生效）",
    )
    parser.add_argument(
        "--no-recursive",
        action="store_true",
        dest="no_recursive",
        help="不递归子目录，仅扫描输入目录当前层（默认会递归查找所有子目录中的书籍）",
    )

    args = parser.parse_args()

    input_path = Path(args.input).expanduser().resolve()
    if not input_path.exists():
        raise SystemExit(f"输入路径不存在: {input_path}")

    tmp_dir = Path(args.tmp_dir).expanduser().resolve() if args.tmp_dir else None

    # 初始化 MinIO 上传器（使用开发环境默认配置）
    uploader: Optional[MinioImageUploader] = None
    try:
        uploader = MinioImageUploader()
    except Exception as e:
        # MinIO 不可用时给出警告，但仍然继续解析文本内容
        print(f"警告: 无法初始化 MinIO 客户端，图片将不会上传。原因: {e}", file=sys.stderr)

    is_dir_input = input_path.is_dir()

    # 目录模式 + 指定 --output：一边解析一边落盘，避免在内存里累计所有 Book
    if is_dir_input and args.output:
        out_dir = Path(args.output).expanduser().resolve()
        out_dir.mkdir(parents=True, exist_ok=True)

        # 收集需要处理的文件列表（递归子目录，与 parse_directory 规则一致）
        exts = [".chm", ".azw3", ".mobi", ".epub"]
        recursive = not args.no_recursive
        paths = _collect_book_paths(input_path, exts, recursive=recursive)

        total = len(paths)
        if total == 0:
            print(f"没有在目录 {input_path} 中找到可解析的电子书文件。")
            return

        counter = 0
        counter_lock = Lock()

        def _on_book_done(path: Path) -> None:
            nonlocal counter
            with counter_lock:
                counter += 1
                print(f"[进度] 已完成 {counter}/{total}: {path.name}", file=sys.stderr)

        def _json_output_path(path: Path) -> Path:
            return out_dir / f"{path.stem}.json"

        def _process_and_write(path: Path) -> None:
            book = parse_book_file(path, tmp_dir=tmp_dir, uploader=uploader)
            book_data = books_to_json_serializable([book])[0]
            stem = Path(book.file_path).stem
            book_json_path = out_dir / f"{stem}.json"
            with book_json_path.open("w", encoding="utf-8") as f:
                json.dump(book_data, f, ensure_ascii=False, indent=2)

        jobs = max(1, args.jobs)

        # 串行模式
        if jobs <= 1 or len(paths) <= 1:
            for path in paths:
                if _json_output_path(path).exists():
                    print(f"[跳过] 已存在: {path.name} -> {_json_output_path(path).name}", file=sys.stderr)
                    _on_book_done(path)
                    continue
                try:
                    _process_and_write(path)
                    _on_book_done(path)
                except Exception as e:
                    print(f"解析失败，已跳过文件: {path}，原因: {e}", file=sys.stderr)
            print(f"已为 {counter} 本书生成 JSON 文件，目录: {out_dir}")
            return

        # 并行模式：已存在 JSON 的先跳过，只对尚未生成的书做转换
        paths_to_process: List[Path] = []
        for path in paths:
            if _json_output_path(path).exists():
                print(f"[跳过] 已存在: {path.name} -> {_json_output_path(path).name}", file=sys.stderr)
                _on_book_done(path)
            else:
                paths_to_process.append(path)

        with ThreadPoolExecutor(max_workers=jobs) as executor:
            future_to_path = {
                executor.submit(_process_and_write, path): path for path in paths_to_process
            }
            for future in as_completed(future_to_path):
                path = future_to_path[future]
                try:
                    future.result()
                    _on_book_done(path)
                except Exception as e:
                    print(f"解析失败，已跳过文件: {path}，原因: {e}", file=sys.stderr)

        print(f"已为 {counter} 本书生成 JSON 文件，目录: {out_dir}")
        return

    # 其他情况：保持原有行为（可能会在内存中收集 books，但通常规模较小）
    if is_dir_input:
        books = parse_directory(
            input_path,
            tmp_dir=tmp_dir,
            uploader=uploader,
            jobs=max(1, args.jobs),
            recursive=not args.no_recursive,
        )
    else:
        books = [parse_book_file(input_path, tmp_dir=tmp_dir, uploader=uploader)]

    # 其他情况保持原有行为：
    # - 输入是单个文件 + 指定 --output: 写一个 JSON 文件
    # - 输入是单个文件 + 未指定 --output: 打印到 stdout
    # - 输入是目录 + 未指定 --output: 打印所有书组成的列表到 stdout
    data = books_to_json_serializable(books)

    if args.output:
        out_path = Path(args.output).expanduser().resolve()
        out_path.parent.mkdir(parents=True, exist_ok=True)
        with out_path.open("w", encoding="utf-8") as f:
            json.dump(data, f, ensure_ascii=False, indent=2)
        print(f"已写入: {out_path}")
    else:
        print(json.dumps(data, ensure_ascii=False, indent=2))


if __name__ == "__main__":
    main()

