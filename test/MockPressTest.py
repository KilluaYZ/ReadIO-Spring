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
    - name: 作者姓名（必填）
    - description: 作者简介
    - icon: 作者头像
    """
    return {
        "name": faker.name(),
        "description": random_description(160),
        "icon": faker.image_url(),
    }


def fake_publisher_payload() -> dict:
    """
    按字段语义模拟 BmsPublisher：
    - name: 出版社名称
    - description: 简要介绍
    """
    return {
        "name": faker.company(),
        "description": random_description(160),
    }


def fake_book_payload(author_id: int | None = None, publisher_id: int | None = None) -> dict:
    """
    按字段语义模拟 BmsBook：
    - name: 书名（对应 bms_book.name，必填）
    - description: 简介
    - isbn: 图书 ISBN
    - authorId/publisherId: 关联作者/出版社（如果有）
    """
    payload = {
        "name": random_title(),
        "description": random_description(200),
        "isbn": faker.isbn13(),
        "language": "zh-CN",
        # 对应 bms_book.book_category_id，后端要求非空，这里统一用默认分类 1
        "bookCategoryId": 1,
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
    - memberLevelId: 会员等级（必填）
    - city: 城市（对应 ums_member.city，必填）
    """
    username = faker.user_name()
    return {
        "username": username,
        "nickname": faker.name(),
        "password": "Test123456!",
        "phone": faker.phone_number(),
        "email": faker.email(),
        "icon": faker.image_url(),
        # 对应 ums_member.member_level_id，后端要求非空，这里统一用默认等级 1
        "memberLevelId": 1,
        # 对应 ums_member.city，非空字段，这里给一个城市名称
        "city": faker.city_name(),
    }


def fake_post_payload(member_id: int | None = None) -> dict:
    """
    按字段语义模拟 CmsPost：
    - title: 帖子标题
    - memberId: 作者用户（对应 cms_post.member_id，必填）
    - visible: 可见类型（0->公开）
    - ip/address: 发送时的 IP 和位置
    """
    payload = {
        "title": random_title(8),
        "visible": 0,
        "ip": faker.ipv4(),
        "address": faker.address(),
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
    - memberId: 下单用户（对应 oms_order.member_id，必填）
    - memberUsername: 下单用户名（对应 oms_order.member_username，必填）
    - orderSn: 订单号（必填）
    - productId: 商品 ID（必填，这里固定为 1）
    其他金额相关字段使用简单的随机值或 0
    """
    order_sn = f"{time.strftime('%Y%m%d%H%M%S')}{random.randint(1000, 9999)}"
    amount = random.randint(10, 1000)
    payload = {
        "orderSn": order_sn,
        "memberUsername": f"member-{member_id}" if member_id is not None else "member-anonymous",
        "totalAmount": amount,
        "payAmount": amount,
        "promotionAmount": 0,
        "integrationAmount": 0,
        "couponAmount": 0,
        "payType": 0,
        "sourceType": 0,
        "status": 0,
        "integration": 0,
        "growth": 0,
        "promotionInfo": random_description(60),
        "note": random_description(60),
        "useIntegration": 0,
        # 目前表中已初始化了商品 ID=1 的会员商品
        "productId": 1,
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
        # 初始化 token 缓存
        self.auth_token: str | None = None
        self._auth_token_expire_at: float | None = None

        # 优先使用环境变量中的 Token（例如手动指定的测试 Token）
        env_token = os.environ.get("READIO_ADMIN_AUTH_TOKEN")
        if env_token:
            self.auth_token = env_token
            # 给一个很远的过期时间，视为「不会自动刷新」
            self._auth_token_expire_at = time.time() + 3600 * 24
        else:
            # 环境变量没有指定时，自动向 OAuth2 服务申请 Token
            self._ensure_auth_token()

        # 简单预热：访问几个只读接口（同样带上鉴权头）
        headers = self._headers()
        self.client.get("/author/listAll", headers=headers, name="author.listAll")
        self.client.get("/book/list", params={"pageNum": 1, "pageSize": 5}, headers=headers, name="book.list[GET]")
        self.client.get("/member/list", params={"pageNum": 1, "pageSize": 5}, headers=headers, name="member.list[GET]")

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

        # 只有在拿到有效 authorId 时才创建书籍，避免向 bms_book.author_id 插入 NULL
        if author_id is not None:
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
        headers = self._headers()
        page = random.randint(1, 5)
        list_resp = self.client.get(
            "/book/list",
            params={"pageNum": page, "pageSize": 10},
            headers=headers,
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
                        self.client.get(f"/book/{book_id}", headers=headers, name="book.detail[GET]")
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

        # 只有成功创建会员且拿到 memberId 后才创建帖子，避免 cms_post.member_id 为 NULL
        if member_id is not None:
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
        # 先通过接口创建一个会员，保证有可用的 memberId
        member_resp = self.client.post(
            "/member/create",
            json=fake_member_payload(),
            headers=headers,
            name="member.create[POST](forOrder)",
        )
        member_id: int | None = None
        if member_resp.ok:
            try:
                member_id = member_resp.json().get("data")
            except Exception:
                member_id = None
        # 如果创建失败，再尝试从已有会员中挑一个
        if member_id is None:
            member_id = self._pick_any_member_id()
        # 依然没有会员就不创建订单，避免 oms_order.member_id 为 NULL
        if member_id is None:
            return
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
        headers = self._headers()
        self.client.get(
            "/order/list",
            params={"pageNum": page, "pageSize": 10},
            headers=headers,
            name="order.list[GET]",
        )

    # -------- 通用只读压力接口 --------

    @tag("basic-read")
    @task(3)
    def basic_read_endpoints(self) -> None:
        """
        对多个简单 GET 接口做轻量高并发压测。
        """
        headers = self._headers()
        self.client.get("/author/listAll", headers=headers, name="author.listAll")
        self.client.get("/publisher/listAll", headers=headers, name="publisher.listAll")
        self.client.get("/member/listAll", headers=headers, name="member.listAll")
        self.client.get("/oneWord/listAll", headers=headers, name="oneWord.listAll")
        self.client.get("/comment/list", params={"pageNum": 1, "pageSize": 10}, headers=headers, name="comment.list[GET]")

    # -------- 工具方法 --------

    def _ensure_auth_token(self) -> None:
        """
        确保当前有可用的 Bearer Token：
        - 若无 Token 或者已过期，则向 OAuth2 服务重新申请。
        - 使用 client_credentials 模式：locust-admin-client / locust-secret。
        """
        now = time.time()
        # 如果已经有 Token 且距离过期还有一定缓冲（例如 5 秒），就直接复用
        if (
            getattr(self, "auth_token", None)
            and getattr(self, "_auth_token_expire_at", None)
            and self._auth_token_expire_at - now > 5
        ):
            return

        # 这里直接调用授权服务器的 /oauth2/token 端点
        resp = self.client.post(
            "http://127.0.0.1:9401/oauth2/token",
            data={
                "grant_type": "client_credentials",
                "scope": "admin",
            },
            auth=("locust-admin-client", "locust-secret"),
            name="auth.token[POST]",
        )

        if not resp.ok:
            # 申请失败时，不抛异常以免中断压测，只是不带鉴权头访问后续接口
            self.auth_token = None
            self._auth_token_expire_at = None
            return

        try:
            payload = resp.json()
            access_token = payload.get("access_token")
            expires_in = int(payload.get("expires_in", 300))
        except Exception:
            self.auth_token = None
            self._auth_token_expire_at = None
            return

        if not access_token:
            self.auth_token = None
            self._auth_token_expire_at = None
            return

        # 正常情况下，缓存 Token 和过期时间，并预留 5 秒的刷新缓冲
        self.auth_token = access_token
        self._auth_token_expire_at = time.time() + max(expires_in - 5, 1)

    def _headers(self) -> dict:
        # 每次发写操作前，确保 Token 是最新的
        self._ensure_auth_token()

        headers: dict = {"Content-Type": "application/json;charset=UTF-8"}
        if getattr(self, "auth_token", None):
            headers["Authorization"] = f"Bearer {self.auth_token}"
        return headers

    def _pick_any_member_id(self) -> int | None:
        """
        尝试从 /member/list 接口里拿一个已有的 memberId。
        """
        try:
            headers = self._headers()
            resp = self.client.get(
                "/member/list",
                params={"pageNum": 1, "pageSize": 10},
                headers=headers,
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
            headers = self._headers()
            resp = self.client.get(
                "/post/list",
                params={"pageNum": 1, "pageSize": 10},
                headers=headers,
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

