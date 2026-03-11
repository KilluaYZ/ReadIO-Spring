from locust import HttpUser, task, between, tag
from faker import Faker
import random
import string
import time
import os


faker = Faker("zh_CN")


def random_title(max_words: int = 6) -> str:
    return faker.sentence(nb_words=max_words).replace("。", "")


def random_description(max_chars: int = 120) -> str:
    return faker.text(max_nb_chars=max_chars).replace("\n", " ")


def random_code(prefix: str, length: int = 8) -> str:
    suffix = "".join(random.choices(string.ascii_uppercase + string.digits, k=length))
    return f"{prefix}{suffix}"


def fake_author_payload() -> dict:
    """
    按字段语义模拟 BmsAuthor：
    - name: 作者姓名
    - bio: 作者简介
    - country: 国家/地区
    """
    return {
        "name": faker.name(),
        "bio": random_description(160),
        "country": faker.country(),
    }


def fake_publisher_payload() -> dict:
    """
    按字段语义模拟 BmsPublisher：
    - name: 出版社名称
    - description: 简要介绍
    - contactPhone/email: 联系方式
    """
    return {
        "name": faker.company(),
        "description": random_description(160),
        "contactPhone": faker.phone_number(),
        "contactEmail": faker.email(),
    }


def fake_book_payload(author_id: int | None = None, publisher_id: int | None = None) -> dict:
    """
    按字段语义模拟 BmsBook：
    - title: 书名
    - subtitle: 副标题
    - description: 简介
    - isbn: 图书 ISBN
    - authorId/publisherId: 关联作者/出版社（如果有）
    """
    payload = {
        "title": random_title(),
        "subtitle": random_title(8),
        "description": random_description(200),
        "isbn": faker.isbn13(),
        "language": "zh-CN",
        "publishYear": random.randint(1990, 2025),
    }
    if author_id is not None:
        payload["authorId"] = author_id
    if publisher_id is not None:
        payload["publisherId"] = publisher_id
    return payload


def fake_member_payload() -> dict:
    """
    按字段语义模拟 UmsMember：
    - username/nickname: 用户名和昵称
    - phone/email: 联系方式
    """
    username = faker.user_name()
    return {
        "username": username,
        "nickname": faker.name(),
        "password": "Test123456!",
        "phone": faker.phone_number(),
        "email": faker.email(),
        "icon": faker.image_url(),
    }


def fake_post_payload(member_id: int | None = None) -> dict:
    """
    按字段语义模拟 CmsPost：
    - title: 帖子标题
    - content: 主体内容摘要
    - memberId: 作者用户
    """
    payload = {
        "title": random_title(8),
        "summary": random_description(200),
        "coverImage": faker.image_url(),
    }
    if member_id is not None:
        payload["memberId"] = member_id
    return payload


def fake_comment_payload(member_id: int, select_id: int | None = None,
                         book_id: int | None = None, post_id: int | None = None) -> dict:
    """
    按字段语义模拟 CmsComment：
    - type: 0 帖子评论；2 书籍评论；3 选中段落评论
    - content: 评论正文
    - 其他 ID 按类型传入
    """
    if select_id is not None:
        c_type = 3
    elif book_id is not None:
        c_type = 2
    else:
        c_type = 0

    payload: dict = {
        "type": c_type,
        "memberId": member_id,
        "content": random_description(120),
    }
    if post_id is not None:
        payload["postId"] = post_id
    if book_id is not None:
        payload["bookId"] = book_id
    if select_id is not None:
        payload["selectId"] = select_id
    return payload


def fake_order_payload(member_id: int | None = None) -> dict:
    """
    按字段语义模拟 OmsOrder：
    - memberId: 下单用户
    - orderSn: 订单号
    - receiverName/Phone/Address: 收货信息
    """
    order_sn = f"{time.strftime('%Y%m%d%H%M%S')}{random.randint(1000, 9999)}"
    payload = {
        "orderSn": order_sn,
        "totalAmount": float(random.randint(1000, 10000)) / 100.0,
        "freightAmount": 0.0,
        "receiverName": faker.name(),
        "receiverPhone": faker.phone_number(),
        "receiverProvince": faker.province(),
        "receiverCity": faker.city_name(),
        "receiverRegion": faker.district(),
        "receiverDetailAddress": faker.address(),
        "note": random_description(60),
    }
    if member_id is not None:
        payload["memberId"] = member_id
    return payload


class ReadioAdminUser(HttpUser):
    """
    使用 Locust 压测 readio-admin 各类接口，并通过 Faker 生成语义合理的 Mock 数据。

    启动示例：
        locust -f test/MockPressTest.py ReadioAdminUser --host=http://localhost:8080

    可选环境变量：
        READIO_ADMIN_AUTH_TOKEN   后台接口 Bearer Token（如果有鉴权）
    """

    wait_time = between(0.1, 1.5)

    def on_start(self) -> None:
        # 可选：从环境变量中读取鉴权 Token
        self.auth_token = os.environ.get("READIO_ADMIN_AUTH_TOKEN")

        # 简单预热：访问几个只读接口
        self.client.get("/author/listAll", name="author.listAll")
        self.client.get("/book/list", params={"pageNum": 1, "pageSize": 5}, name="book.list[GET]")
        self.client.get("/member/list", params={"pageNum": 1, "pageSize": 5}, name="member.list[GET]")

    # -------- 作者 & 出版社 & 书籍相关 --------

    @tag("author", "write")
    @task(2)
    def create_author_and_publisher_and_book(self) -> None:
        headers = self._headers()

        # 创建作者
        author_resp = self.client.post(
            "/author/create",
            json=fake_author_payload(),
            headers=headers,
            name="author.create[POST]",
        )
        author_id = None
        if author_resp.ok:
            try:
                author_id = author_resp.json().get("data")
            except Exception:
                pass

        # 创建出版社
        publisher_resp = self.client.post(
            "/publisher/create",
            json=fake_publisher_payload(),
            headers=headers,
            name="publisher.create[POST]",
        )
        publisher_id = None
        if publisher_resp.ok:
            try:
                publisher_id = publisher_resp.json().get("data")
            except Exception:
                pass

        # 创建书籍，尽量挂上作者和出版社
        self.client.post(
            "/book/create",
            json=fake_book_payload(author_id=author_id, publisher_id=publisher_id),
            headers=headers,
            name="book.create[POST]",
        )

    @tag("book", "read")
    @task(3)
    def list_books_and_detail(self) -> None:
        # 分页查询书籍
        page = random.randint(1, 5)
        list_resp = self.client.get(
            "/book/list",
            params={"pageNum": page, "pageSize": 10},
            name="book.list[GET]",
        )

        # 随机取一个 bookId 再查详情（如果有数据）
        if list_resp.ok:
            try:
                data = list_resp.json().get("data", {})
                book_list = data.get("list") or data.get("records") or []
                if book_list:
                    book = random.choice(book_list)
                    book_id = book.get("id")
                    if book_id is not None:
                        self.client.get(f"/book/{book_id}", name="book.detail[GET]")
            except Exception:
                # 返回结构异常时直接忽略
                pass

    # -------- 会员 & 帖子 & 评论相关 --------

    @tag("member", "write")
    @task(2)
    def create_member_and_post(self) -> None:
        headers = self._headers()

        # 创建会员
        member_resp = self.client.post(
            "/member/create",
            json=fake_member_payload(),
            headers=headers,
            name="member.create[POST]",
        )
        member_id = None
        if member_resp.ok:
            try:
                member_id = member_resp.json().get("data")
            except Exception:
                pass

        # 以该会员身份发一个帖子
        self.client.post(
            "/post/create",
            json=fake_post_payload(member_id=member_id),
            headers=headers,
            name="post.create[POST]",
        )

    @tag("comment", "write")
    @task(2)
    def create_comment_for_random_post(self) -> None:
        headers = self._headers()

        # 先查一个会员和帖子
        member_id = self._pick_any_member_id()
        if member_id is None:
            return

        post_id = self._pick_any_post_id()
        if post_id is None:
            return

        payload = fake_comment_payload(member_id=member_id, post_id=post_id)
        self.client.post(
            "/comment/create",
            json=payload,
            headers=headers,
            name="comment.create[POST]",
        )

    # -------- 订单 & 营销相关 --------

    @tag("order", "write")
    @task(1)
    def create_order_for_member(self) -> None:
        headers = self._headers()
        member_id = self._pick_any_member_id()
        payload = fake_order_payload(member_id=member_id)
        self.client.post(
            "/order/create",
            json=payload,
            headers=headers,
            name="order.create[POST]",
        )

    @tag("order", "read")
    @task(1)
    def list_orders(self) -> None:
        page = random.randint(1, 5)
        self.client.get(
            "/order/list",
            params={"pageNum": page, "pageSize": 10},
            name="order.list[GET]",
        )

    # -------- 通用只读压力接口 --------

    @tag("basic-read")
    @task(3)
    def basic_read_endpoints(self) -> None:
        """
        对多个简单 GET 接口做轻量高并发压测。
        """
        self.client.get("/author/listAll", name="author.listAll")
        self.client.get("/publisher/listAll", name="publisher.listAll")
        self.client.get("/member/listAll", name="member.listAll")
        self.client.get("/oneWord/listAll", name="oneWord.listAll")
        self.client.get("/comment/list", params={"pageNum": 1, "pageSize": 10}, name="comment.list[GET]")

    # -------- 工具方法 --------

    def _headers(self) -> dict:
        headers: dict = {"Content-Type": "application/json;charset=UTF-8"}
        if getattr(self, "auth_token", None):
            headers["Authorization"] = f"Bearer {self.auth_token}"
        return headers

    def _pick_any_member_id(self) -> int | None:
        """
        尝试从 /member/list 接口里拿一个已有的 memberId。
        """
        try:
            resp = self.client.get(
                "/member/list",
                params={"pageNum": 1, "pageSize": 10},
                name="member.list.forId[GET]",
            )
            if not resp.ok:
                return None
            data = resp.json().get("data", {})
            members = data.get("list") or data.get("records") or []
            if not members:
                return None
            return random.choice(members).get("id")
        except Exception:
            return None

    def _pick_any_post_id(self) -> int | None:
        """
        尝试从 /post/list 接口里拿一个已有的 postId。
        """
        try:
            resp = self.client.get(
                "/post/list",
                params={"pageNum": 1, "pageSize": 10},
                name="post.list.forId[GET]",
            )
            if not resp.ok:
                return None
            data = resp.json().get("data", {})
            posts = data.get("list") or data.get("records") or []
            if not posts:
                return None
            return random.choice(posts).get("id")
        except Exception:
            return None

