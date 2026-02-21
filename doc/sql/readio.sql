-- DROP SCHEMA public;

CREATE SCHEMA public AUTHORIZATION pg_database_owner;

COMMENT ON SCHEMA public IS 'standard public schema';

-- DROP SEQUENCE public.bms_author_id_seq;

CREATE SEQUENCE public.bms_author_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_category_id_seq;

CREATE SEQUENCE public.bms_book_category_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_content_block_id_seq;

CREATE SEQUENCE public.bms_book_content_block_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_content_block_order_seq;

CREATE SEQUENCE public.bms_book_content_block_order_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_footnote_id_seq;

CREATE SEQUENCE public.bms_book_footnote_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_id_seq;

CREATE SEQUENCE public.bms_book_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_list_book_relation_id_seq;

CREATE SEQUENCE public.bms_book_list_book_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_list_id_seq;

CREATE SEQUENCE public.bms_book_list_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_list_member_relation_id_seq;

CREATE SEQUENCE public.bms_book_list_member_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_read_progress_id_seq;

CREATE SEQUENCE public.bms_book_read_progress_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_select_content_id_seq;

CREATE SEQUENCE public.bms_book_select_content_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_select_content_item_id_seq;

CREATE SEQUENCE public.bms_book_select_content_item_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_shelf_book_relation_id_seq;

CREATE SEQUENCE public.bms_book_shelf_book_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_book_shelf_id_seq;

CREATE SEQUENCE public.bms_book_shelf_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_one_word_id_seq;

CREATE SEQUENCE public.bms_one_word_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.bms_publisher_id_seq;

CREATE SEQUENCE public.bms_publisher_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_comment_id_seq;

CREATE SEQUENCE public.cms_comment_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_member_book_list_relation_id_seq;

CREATE SEQUENCE public.cms_member_book_list_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_member_book_relation_id_seq;

CREATE SEQUENCE public.cms_member_book_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_member_comment_relation_id_seq;

CREATE SEQUENCE public.cms_member_comment_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_member_one_word_relation_id_seq;

CREATE SEQUENCE public.cms_member_one_word_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_member_post_relation_id_seq;

CREATE SEQUENCE public.cms_member_post_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_post_content_block_id_seq;

CREATE SEQUENCE public.cms_post_content_block_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_post_content_block_order_seq;

CREATE SEQUENCE public.cms_post_content_block_order_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_post_id_seq;

CREATE SEQUENCE public.cms_post_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_post_tag_id_seq;

CREATE SEQUENCE public.cms_post_tag_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.cms_post_tag_relation_id_seq;

CREATE SEQUENCE public.cms_post_tag_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_admin_id_seq;

CREATE SEQUENCE public.ums_admin_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_admin_login_log_id_seq;

CREATE SEQUENCE public.ums_admin_login_log_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_admin_permission_relation_id_seq;

CREATE SEQUENCE public.ums_admin_permission_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_admin_role_relation_id_seq;

CREATE SEQUENCE public.ums_admin_role_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_book_category_relation_id_seq;

CREATE SEQUENCE public.ums_member_book_category_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_follow_relation_id_seq;

CREATE SEQUENCE public.ums_member_follow_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_id_seq;

CREATE SEQUENCE public.ums_member_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_level_id_seq;

CREATE SEQUENCE public.ums_member_level_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_login_log_id_seq;

CREATE SEQUENCE public.ums_member_login_log_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_member_tag_relation_id_seq;

CREATE SEQUENCE public.ums_member_member_tag_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_rule_setting_id_seq;

CREATE SEQUENCE public.ums_member_rule_setting_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_statistics_info_id_seq;

CREATE SEQUENCE public.ums_member_statistics_info_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_tag_id_seq;

CREATE SEQUENCE public.ums_member_tag_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_member_task_id_seq;

CREATE SEQUENCE public.ums_member_task_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_menu_id_seq;

CREATE SEQUENCE public.ums_menu_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_permission_id_seq;

CREATE SEQUENCE public.ums_permission_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_resource_category_id_seq;

CREATE SEQUENCE public.ums_resource_category_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_resource_id_seq;

CREATE SEQUENCE public.ums_resource_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_role_id_seq;

CREATE SEQUENCE public.ums_role_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_role_menu_relation_id_seq;

CREATE SEQUENCE public.ums_role_menu_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_role_permission_relation_id_seq;

CREATE SEQUENCE public.ums_role_permission_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- DROP SEQUENCE public.ums_role_resource_relation_id_seq;

CREATE SEQUENCE public.ums_role_resource_relation_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;-- public.bms_author definition

-- Drop table

-- DROP TABLE public.bms_author;

CREATE TABLE public.bms_author (
                                   id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                   "name" text NOT NULL, -- 作者名称
                                   description text NULL, -- 作者简介
                                   create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                   icon text NULL, -- 作者照片
                                   CONSTRAINT bms_author_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.bms_author IS '作者';

-- Column comments

COMMENT ON COLUMN public.bms_author."name" IS '作者名称';
COMMENT ON COLUMN public.bms_author.description IS '作者简介';
COMMENT ON COLUMN public.bms_author.create_time IS '创建时间';
COMMENT ON COLUMN public.bms_author.icon IS '作者照片';


-- public.bms_book_category definition

-- Drop table

-- DROP TABLE public.bms_book_category;

CREATE TABLE public.bms_book_category (
                                          id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                          "name" text NOT NULL, -- 类型名称
                                          "key" text NOT NULL, -- 代表字母
                                          CONSTRAINT bms_book_category_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.bms_book_category IS '书籍类型';

-- Column comments

COMMENT ON COLUMN public.bms_book_category."name" IS '类型名称';
COMMENT ON COLUMN public.bms_book_category."key" IS '代表字母';


-- public.bms_book_list definition

-- Drop table

-- DROP TABLE public.bms_book_list;

CREATE TABLE public.bms_book_list (
                                      id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                      "name" text NOT NULL, -- 书单名称
                                      hidden bool DEFAULT true NOT NULL, -- 是否隐藏书单
                                      description text NULL, -- 书单简介
                                      CONSTRAINT bms_book_list_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.bms_book_list IS '书单';

-- Column comments

COMMENT ON COLUMN public.bms_book_list."name" IS '书单名称';
COMMENT ON COLUMN public.bms_book_list.hidden IS '是否隐藏书单';
COMMENT ON COLUMN public.bms_book_list.description IS '书单简介';


-- public.bms_book_select_content definition

-- Drop table

-- DROP TABLE public.bms_book_select_content;

CREATE TABLE public.bms_book_select_content (
                                                id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                member_id int4 NOT NULL,
                                                "type" int4 NOT NULL, -- 选中类型：0->标注；1->评论
                                                mark_type int4 NULL, -- 标注类型：0->荧光笔；1->下划实线；2->下划虚线；3->下划双实线；4->下划圆点；5->下划三角
                                                mark_color text NULL, -- 标记颜色
                                                create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                CONSTRAINT bms_book_select_content_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.bms_book_select_content IS '选中的段落';

-- Column comments

COMMENT ON COLUMN public.bms_book_select_content."type" IS '选中类型：0->标注；1->评论';
COMMENT ON COLUMN public.bms_book_select_content.mark_type IS '标注类型：0->荧光笔；1->下划实线；2->下划虚线；3->下划双实线；4->下划圆点；5->下划三角';
COMMENT ON COLUMN public.bms_book_select_content.mark_color IS '标记颜色';
COMMENT ON COLUMN public.bms_book_select_content.create_time IS '创建时间';


-- public.bms_publisher definition

-- Drop table

-- DROP TABLE public.bms_publisher;

CREATE TABLE public.bms_publisher (
                                      id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                      "name" text NOT NULL, -- 出版社名称
                                      description text NULL, -- 出版社简介
                                      CONSTRAINT bms_publisher_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.bms_publisher IS '出版社';

-- Column comments

COMMENT ON COLUMN public.bms_publisher."name" IS '出版社名称';
COMMENT ON COLUMN public.bms_publisher.description IS '出版社简介';


-- public.cms_post_tag definition

-- Drop table

-- DROP TABLE public.cms_post_tag;

CREATE TABLE public.cms_post_tag (
                                     id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                     "name" text NOT NULL, -- 帖子标签名称
                                     create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                     CONSTRAINT cms_post_tag_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.cms_post_tag IS '帖子标签';

-- Column comments

COMMENT ON COLUMN public.cms_post_tag."name" IS '帖子标签名称';
COMMENT ON COLUMN public.cms_post_tag.create_time IS '创建时间';


-- public.ums_admin definition

-- Drop table

-- DROP TABLE public.ums_admin;

CREATE TABLE public.ums_admin (
                                  id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                  member_level_id int4 NOT NULL, -- 用户等级
                                  username text NOT NULL, -- 用户名¶
                                  nickname text NULL,
                                  "password" text NOT NULL, -- 密码
                                  phone text NULL, -- 手机
                                  email text NOT NULL, -- 邮箱
                                  status bool DEFAULT true NOT NULL, -- 用户状态，True表示启用，False表示禁用
                                  create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 注册时间
                                  login_time date NULL, -- 最后登录时间
                                  icon text NULL, -- 用户头像
                                  note text NULL, -- 备注信息
                                  CONSTRAINT ums_admin_email_key UNIQUE (email),
                                  CONSTRAINT ums_admin_phone_key UNIQUE (phone),
                                  CONSTRAINT ums_admin_pkey PRIMARY KEY (id),
                                  CONSTRAINT ums_admin_username_key UNIQUE (username)
);
COMMENT ON TABLE public.ums_admin IS '管理用户';

-- Column comments

COMMENT ON COLUMN public.ums_admin.member_level_id IS '用户等级';
COMMENT ON COLUMN public.ums_admin.username IS '用户名
';
COMMENT ON COLUMN public.ums_admin."password" IS '密码';
COMMENT ON COLUMN public.ums_admin.phone IS '手机';
COMMENT ON COLUMN public.ums_admin.email IS '邮箱';
COMMENT ON COLUMN public.ums_admin.status IS '用户状态，True表示启用，False表示禁用';
COMMENT ON COLUMN public.ums_admin.create_time IS '注册时间';
COMMENT ON COLUMN public.ums_admin.login_time IS '最后登录时间';
COMMENT ON COLUMN public.ums_admin.icon IS '用户头像';
COMMENT ON COLUMN public.ums_admin.note IS '备注信息';


-- public.ums_member_level definition

-- Drop table

-- DROP TABLE public.ums_member_level;

CREATE TABLE public.ums_member_level (
                                         id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                         "name" text NOT NULL, -- 等级名称
                                         growth_point int4 DEFAULT 0 NOT NULL, -- 该级别所需成长点数
                                         default_status bool DEFAULT false NOT NULL, -- 是否为默认等级：0->不是；1->是
                                         comment_growth_point int4 DEFAULT 0 NOT NULL, -- 每次评论获取的成长值
                                         priviledge_sign_in bool DEFAULT false NOT NULL, -- 是否有签到特权
                                         priviledge_comment bool DEFAULT false NOT NULL, -- 是否有评论获奖励特权
                                         priviledge_promotion bool DEFAULT false NOT NULL, -- 是否有专享活动特权
                                         priviledge_member_price bool DEFAULT false NOT NULL, -- 是否有会员价格特权
                                         priviledge_birthday bool DEFAULT false NOT NULL, -- 是否有生日特权
                                         note text NULL, -- 备注
                                         CONSTRAINT ums_member_level_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.ums_member_level IS '会员等级表';

-- Column comments

COMMENT ON COLUMN public.ums_member_level."name" IS '等级名称';
COMMENT ON COLUMN public.ums_member_level.growth_point IS '该级别所需成长点数';
COMMENT ON COLUMN public.ums_member_level.default_status IS '是否为默认等级：0->不是；1->是';
COMMENT ON COLUMN public.ums_member_level.comment_growth_point IS '每次评论获取的成长值';
COMMENT ON COLUMN public.ums_member_level.priviledge_sign_in IS '是否有签到特权';
COMMENT ON COLUMN public.ums_member_level.priviledge_comment IS '是否有评论获奖励特权';
COMMENT ON COLUMN public.ums_member_level.priviledge_promotion IS '是否有专享活动特权';
COMMENT ON COLUMN public.ums_member_level.priviledge_member_price IS '是否有会员价格特权';
COMMENT ON COLUMN public.ums_member_level.priviledge_birthday IS '是否有生日特权';
COMMENT ON COLUMN public.ums_member_level.note IS '备注';


-- public.ums_member_rule_setting definition

-- Drop table

-- DROP TABLE public.ums_member_rule_setting;

CREATE TABLE public.ums_member_rule_setting (
                                                id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                continue_sign_day int4 DEFAULT 0 NOT NULL, -- 连续签到天数
                                                continue_sign_point int4 DEFAULT 0 NOT NULL, -- 连续签到赠送数量
                                                consume_per_point int4 DEFAULT 0 NOT NULL, -- 每消费多少元获取1个点
                                                low_order_amount int4 DEFAULT 0 NOT NULL, -- 最低获取点数的订单金额
                                                max_point_per_order int4 DEFAULT 0 NOT NULL, -- 每笔订单最高获取点数
                                                "type" int4 NULL, -- 类型：0->积分规则；1->成长值规则
                                                CONSTRAINT ums_member_rule_setting_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.ums_member_rule_setting IS '会员积分成长规则表';

-- Column comments

COMMENT ON COLUMN public.ums_member_rule_setting.continue_sign_day IS '连续签到天数';
COMMENT ON COLUMN public.ums_member_rule_setting.continue_sign_point IS '连续签到赠送数量';
COMMENT ON COLUMN public.ums_member_rule_setting.consume_per_point IS '每消费多少元获取1个点';
COMMENT ON COLUMN public.ums_member_rule_setting.low_order_amount IS '最低获取点数的订单金额';
COMMENT ON COLUMN public.ums_member_rule_setting.max_point_per_order IS '每笔订单最高获取点数';
COMMENT ON COLUMN public.ums_member_rule_setting."type" IS '类型：0->积分规则；1->成长值规则';


-- public.ums_member_tag definition

-- Drop table

-- DROP TABLE public.ums_member_tag;

CREATE TABLE public.ums_member_tag (
                                       id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                       "name" text NOT NULL, -- 标签名称
                                       finish_book_number int4 DEFAULT 0 NOT NULL, -- 已经完成阅读的数量
                                       start_book_number int4 DEFAULT 0 NOT NULL, -- 开始阅读的书籍数量
                                       CONSTRAINT ums_member_tag_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.ums_member_tag IS '用户标签表';

-- Column comments

COMMENT ON COLUMN public.ums_member_tag."name" IS '标签名称';
COMMENT ON COLUMN public.ums_member_tag.finish_book_number IS '已经完成阅读的数量';
COMMENT ON COLUMN public.ums_member_tag.start_book_number IS '开始阅读的书籍数量';


-- public.ums_member_task definition

-- Drop table

-- DROP TABLE public.ums_member_task;

CREATE TABLE public.ums_member_task (
                                        id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                        "name" text NOT NULL, -- 任务名称
                                        growth int4 DEFAULT 0 NOT NULL, -- 赠送成长值
                                        intergration int4 DEFAULT 0 NOT NULL, -- 赠送积分
                                        "type" int4 NULL, -- 任务类型：0->新手任务；1->日常任务
                                        CONSTRAINT ums_member_task_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.ums_member_task IS '会员任务表';

-- Column comments

COMMENT ON COLUMN public.ums_member_task."name" IS '任务名称';
COMMENT ON COLUMN public.ums_member_task.growth IS '赠送成长值';
COMMENT ON COLUMN public.ums_member_task.intergration IS '赠送积分';
COMMENT ON COLUMN public.ums_member_task."type" IS '任务类型：0->新手任务；1->日常任务';


-- public.ums_menu definition

-- Drop table

-- DROP TABLE public.ums_menu;

CREATE TABLE public.ums_menu (
                                 id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                 parent_id int4 NULL, -- 父级ID
                                 create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                 title text NOT NULL, -- 菜单名称
                                 "level" int4 DEFAULT 0 NOT NULL, -- 菜单级数
                                 sort int4 DEFAULT 0 NOT NULL, -- 菜单排序
                                 "name" text NULL, -- 菜单前端名称
                                 icon text NULL, -- 菜单图标
                                 hidden bool DEFAULT false NOT NULL, -- 菜单前端隐藏
                                 CONSTRAINT ums_menu_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.ums_menu IS '后台菜单表';

-- Column comments

COMMENT ON COLUMN public.ums_menu.parent_id IS '父级ID';
COMMENT ON COLUMN public.ums_menu.create_time IS '创建时间';
COMMENT ON COLUMN public.ums_menu.title IS '菜单名称';
COMMENT ON COLUMN public.ums_menu."level" IS '菜单级数';
COMMENT ON COLUMN public.ums_menu.sort IS '菜单排序';
COMMENT ON COLUMN public.ums_menu."name" IS '菜单前端名称';
COMMENT ON COLUMN public.ums_menu.icon IS '菜单图标';
COMMENT ON COLUMN public.ums_menu.hidden IS '菜单前端隐藏';


-- public.ums_permission definition

-- Drop table

-- DROP TABLE public.ums_permission;

CREATE TABLE public.ums_permission (
                                       id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                       parent_id int4 NULL, -- 父级权限ID
                                       "name" text NOT NULL, -- 权限名称
                                       value text NOT NULL, -- 权限值
                                       icon text NULL, -- 权限图标
                                       "type" int4 NOT NULL, -- 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
                                       uri text NULL, -- 前端资源路径
                                       status bool DEFAULT true NOT NULL, -- 启用状态；0->禁用；1->启用
                                       create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                       sort int4 DEFAULT 0 NOT NULL, -- 权限排序
                                       CONSTRAINT ums_permission_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.ums_permission IS '后台用户权限表';

-- Column comments

COMMENT ON COLUMN public.ums_permission.parent_id IS '父级权限ID';
COMMENT ON COLUMN public.ums_permission."name" IS '权限名称';
COMMENT ON COLUMN public.ums_permission.value IS '权限值';
COMMENT ON COLUMN public.ums_permission.icon IS '权限图标';
COMMENT ON COLUMN public.ums_permission."type" IS '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）';
COMMENT ON COLUMN public.ums_permission.uri IS '前端资源路径';
COMMENT ON COLUMN public.ums_permission.status IS '启用状态；0->禁用；1->启用';
COMMENT ON COLUMN public.ums_permission.create_time IS '创建时间';
COMMENT ON COLUMN public.ums_permission.sort IS '权限排序';


-- public.ums_resource_category definition

-- Drop table

-- DROP TABLE public.ums_resource_category;

CREATE TABLE public.ums_resource_category (
                                              id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                              create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                              "name" text NOT NULL, -- 分类名称
                                              sort int4 DEFAULT 0 NOT NULL, -- 分类排序
                                              CONSTRAINT ums_resource_category_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.ums_resource_category IS '资源分类表';

-- Column comments

COMMENT ON COLUMN public.ums_resource_category.create_time IS '创建时间';
COMMENT ON COLUMN public.ums_resource_category."name" IS '分类名称';
COMMENT ON COLUMN public.ums_resource_category.sort IS '分类排序';


-- public.ums_role definition

-- Drop table

-- DROP TABLE public.ums_role;

CREATE TABLE public.ums_role (
                                 id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                 "name" text NOT NULL, -- 角色名称
                                 description text NULL, -- 角色描述
                                 admin_count int4 DEFAULT 0 NOT NULL, -- 后台用户数量
                                 create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                 status bool DEFAULT true NOT NULL, -- 启用状态，True启用，False未启用
                                 sort int4 DEFAULT 0 NOT NULL,
                                 CONSTRAINT ums_role_pkey PRIMARY KEY (id)
);
COMMENT ON TABLE public.ums_role IS '后台用户角色表';

-- Column comments

COMMENT ON COLUMN public.ums_role."name" IS '角色名称';
COMMENT ON COLUMN public.ums_role.description IS '角色描述';
COMMENT ON COLUMN public.ums_role.admin_count IS '后台用户数量';
COMMENT ON COLUMN public.ums_role.create_time IS '创建时间';
COMMENT ON COLUMN public.ums_role.status IS '启用状态，True启用，False未启用';


-- public.bms_book definition

-- Drop table

-- DROP TABLE public.bms_book;

CREATE TABLE public.bms_book (
                                 id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                 book_category_id int4 NOT NULL, -- 书籍类型ID
                                 author_id int4 NOT NULL, -- 作者ID
                                 publisher_id int4 NULL,
                                 "name" text NOT NULL, -- 书籍名称
                                 icon text NULL, -- 书籍封面
                                 create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                 pushlish_time date NULL, -- 出版日期
                                 isbn text NULL, -- 书籍ISBN码
                                 word_count int4 DEFAULT 0 NOT NULL, -- 书籍字数
                                 description text NULL, -- 书籍简介
                                 "language" text NULL, -- 语言
                                 CONSTRAINT bms_book_pkey PRIMARY KEY (id),
                                 CONSTRAINT bms_book_author_id_fkey FOREIGN KEY (author_id) REFERENCES public.bms_author(id),
                                 CONSTRAINT bms_book_book_category_id_fkey FOREIGN KEY (book_category_id) REFERENCES public.bms_book_category(id),
                                 CONSTRAINT bms_book_publisher_id_fkey FOREIGN KEY (publisher_id) REFERENCES public.bms_publisher(id)
);
COMMENT ON TABLE public.bms_book IS '书籍';

-- Column comments

COMMENT ON COLUMN public.bms_book.book_category_id IS '书籍类型ID';
COMMENT ON COLUMN public.bms_book.author_id IS '作者ID';
COMMENT ON COLUMN public.bms_book."name" IS '书籍名称';
COMMENT ON COLUMN public.bms_book.icon IS '书籍封面';
COMMENT ON COLUMN public.bms_book.create_time IS '创建时间';
COMMENT ON COLUMN public.bms_book.pushlish_time IS '出版日期';
COMMENT ON COLUMN public.bms_book.isbn IS '书籍ISBN码';
COMMENT ON COLUMN public.bms_book.word_count IS '书籍字数';
COMMENT ON COLUMN public.bms_book.description IS '书籍简介';
COMMENT ON COLUMN public.bms_book."language" IS '语言';


-- public.bms_book_footnote definition

-- Drop table

-- DROP TABLE public.bms_book_footnote;

CREATE TABLE public.bms_book_footnote (
                                          id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                          "type" int4 NOT NULL, -- 脚注类型：0->章节末尾脚注；1->书籍末尾尾注
                                          chapter_id int4 NOT NULL,
                                          book_id int4 NOT NULL,
                                          "content" text NOT NULL, -- 脚注内容
                                          "order" int4 NOT NULL, -- 脚注顺序
                                          CONSTRAINT bms_book_footnote_order_key UNIQUE ("order"),
                                          CONSTRAINT bms_book_footnote_pkey PRIMARY KEY (id),
                                          CONSTRAINT bms_book_footnote_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id)
);
COMMENT ON TABLE public.bms_book_footnote IS '书籍脚注';

-- Column comments

COMMENT ON COLUMN public.bms_book_footnote."type" IS '脚注类型：0->章节末尾脚注；1->书籍末尾尾注';
COMMENT ON COLUMN public.bms_book_footnote."content" IS '脚注内容';
COMMENT ON COLUMN public.bms_book_footnote."order" IS '脚注顺序';


-- public.bms_book_list_book_relation definition

-- Drop table

-- DROP TABLE public.bms_book_list_book_relation;

CREATE TABLE public.bms_book_list_book_relation (
                                                    id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                    book_list_id int4 NOT NULL,
                                                    book_id int4 NOT NULL,
                                                    create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                    CONSTRAINT bms_book_list_book_relation_pkey PRIMARY KEY (id),
                                                    CONSTRAINT bms_book_list_book_relation_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id),
                                                    CONSTRAINT bms_book_list_book_relation_book_list_id_fkey FOREIGN KEY (book_list_id) REFERENCES public.bms_book_list(id)
);
COMMENT ON TABLE public.bms_book_list_book_relation IS '书单书籍关系';

-- Column comments

COMMENT ON COLUMN public.bms_book_list_book_relation.create_time IS '创建时间';


-- public.bms_one_word definition

-- Drop table

-- DROP TABLE public.bms_one_word;

CREATE TABLE public.bms_one_word (
                                     id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                     book_id int4 NOT NULL,
                                     "content" text NOT NULL,
                                     create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL,
                                     CONSTRAINT bms_one_word_pkey PRIMARY KEY (id),
                                     CONSTRAINT bms_one_word_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id)
);
COMMENT ON TABLE public.bms_one_word IS '一言';


-- public.ums_admin_login_log definition

-- Drop table

-- DROP TABLE public.ums_admin_login_log;

CREATE TABLE public.ums_admin_login_log (
                                            id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                            admin_id int4 NOT NULL,
                                            ip text NULL, -- 登陆时管理用户的ip地址
                                            address text NULL, -- 登陆时管理用户的地理位置
                                            user_agent text NULL,
                                            CONSTRAINT ums_admin_login_log_pkey PRIMARY KEY (id),
                                            CONSTRAINT ums_admin_login_log_admin_id_fkey FOREIGN KEY (admin_id) REFERENCES public.ums_admin(id)
);

-- Column comments

COMMENT ON COLUMN public.ums_admin_login_log.ip IS '登陆时管理用户的ip地址';
COMMENT ON COLUMN public.ums_admin_login_log.address IS '登陆时管理用户的地理位置';


-- public.ums_admin_permission_relation definition

-- Drop table

-- DROP TABLE public.ums_admin_permission_relation;

CREATE TABLE public.ums_admin_permission_relation (
                                                      id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                      admin_id int4 NOT NULL,
                                                      permission_id int4 NOT NULL,
                                                      "type" bool NOT NULL,
                                                      CONSTRAINT ums_admin_permission_relation_pkey PRIMARY KEY (id),
                                                      CONSTRAINT ums_admin_permission_relation_admin_id_fkey FOREIGN KEY (admin_id) REFERENCES public.ums_admin(id)
);
COMMENT ON TABLE public.ums_admin_permission_relation IS '后台用户和权限关系表(除角色中定义的权限以外的加减权限)';


-- public.ums_admin_role_relation definition

-- Drop table

-- DROP TABLE public.ums_admin_role_relation;

CREATE TABLE public.ums_admin_role_relation (
                                                id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                admin_id int4 NOT NULL,
                                                role_id int4 NOT NULL,
                                                CONSTRAINT ums_admin_role_relation_pkey PRIMARY KEY (id),
                                                CONSTRAINT ums_admin_role_relation_id_fkey FOREIGN KEY (id) REFERENCES public.ums_admin(id)
);
COMMENT ON TABLE public.ums_admin_role_relation IS '后台用户和角色关系表';


-- public.ums_member definition

-- Drop table

-- DROP TABLE public.ums_member;

CREATE TABLE public.ums_member (
                                   id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                   member_level_id int4 NOT NULL, -- 用户等级
                                   username text NOT NULL, -- 用户名¶
                                   nickname text NULL,
                                   "password" text NOT NULL, -- 密码
                                   phone text NULL, -- 手机
                                   email text NOT NULL, -- 邮箱
                                   status bool DEFAULT true NOT NULL, -- 用户状态，True表示启用，False表示禁用
                                   create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 注册时间
                                   icon text NULL, -- 用户头像
                                   gender int4 DEFAULT 0 NULL, -- 用户性别，0未知，1女，2男
                                   birthday date NULL, -- 生日
                                   city text NOT NULL, -- 用户所在城市
                                   personalized_signature text NULL, -- 用户个性签名
                                   integration int4 DEFAULT 0 NOT NULL, -- 用户积分
                                   growth int4 DEFAULT 0 NOT NULL, -- 用户成长值
                                   source_type bool NULL, -- 用户来源
                                   luckey_count int4 DEFAULT 0 NOT NULL, -- 剩余抽奖次数
                                   history_integration int4 DEFAULT 0 NOT NULL, -- 历史积分数量
                                   CONSTRAINT ums_member_email_key UNIQUE (email),
                                   CONSTRAINT ums_member_phone_key UNIQUE (phone),
                                   CONSTRAINT ums_member_pkey PRIMARY KEY (id),
                                   CONSTRAINT ums_member_username_key UNIQUE (username),
                                   CONSTRAINT ums_member_member_level_id_fkey FOREIGN KEY (member_level_id) REFERENCES public.ums_member_level(id)
);
COMMENT ON TABLE public.ums_member IS '会员表';

-- Column comments

COMMENT ON COLUMN public.ums_member.member_level_id IS '用户等级';
COMMENT ON COLUMN public.ums_member.username IS '用户名
';
COMMENT ON COLUMN public.ums_member."password" IS '密码';
COMMENT ON COLUMN public.ums_member.phone IS '手机';
COMMENT ON COLUMN public.ums_member.email IS '邮箱';
COMMENT ON COLUMN public.ums_member.status IS '用户状态，True表示启用，False表示禁用';
COMMENT ON COLUMN public.ums_member.create_time IS '注册时间';
COMMENT ON COLUMN public.ums_member.icon IS '用户头像';
COMMENT ON COLUMN public.ums_member.gender IS '用户性别，0未知，1女，2男';
COMMENT ON COLUMN public.ums_member.birthday IS '生日';
COMMENT ON COLUMN public.ums_member.city IS '用户所在城市';
COMMENT ON COLUMN public.ums_member.personalized_signature IS '用户个性签名';
COMMENT ON COLUMN public.ums_member.integration IS '用户积分';
COMMENT ON COLUMN public.ums_member.growth IS '用户成长值';
COMMENT ON COLUMN public.ums_member.source_type IS '用户来源';
COMMENT ON COLUMN public.ums_member.luckey_count IS '剩余抽奖次数';
COMMENT ON COLUMN public.ums_member.history_integration IS '历史积分数量';


-- public.ums_member_book_category_relation definition

-- Drop table

-- DROP TABLE public.ums_member_book_category_relation;

CREATE TABLE public.ums_member_book_category_relation (
                                                          id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                          member_id int4 NOT NULL,
                                                          book_category_id int4 NOT NULL,
                                                          CONSTRAINT ums_member_book_category_relation_pkey PRIMARY KEY (id),
                                                          CONSTRAINT ums_member_book_category_relation_book_category_id_fkey FOREIGN KEY (book_category_id) REFERENCES public.bms_book_category(id),
                                                          CONSTRAINT ums_member_book_category_relation_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.ums_member_book_category_relation IS '会员与书籍分类关系表（用户喜欢的书籍分类）';


-- public.ums_member_follow_relation definition

-- Drop table

-- DROP TABLE public.ums_member_follow_relation;

CREATE TABLE public.ums_member_follow_relation (
                                                   id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                   follower_id int4 NOT NULL,
                                                   flowee_id int4 NOT NULL,
                                                   create_time date NOT NULL, -- 创建时间
                                                   CONSTRAINT ums_member_follow_relation_pkey PRIMARY KEY (id),
                                                   CONSTRAINT ums_member_follow_relation_flowee_id_fkey FOREIGN KEY (flowee_id) REFERENCES public.ums_member(id),
                                                   CONSTRAINT ums_member_follow_relation_follower_id_fkey FOREIGN KEY (follower_id) REFERENCES public.ums_member(id)
);

-- Column comments

COMMENT ON COLUMN public.ums_member_follow_relation.create_time IS '创建时间';


-- public.ums_member_login_log definition

-- Drop table

-- DROP TABLE public.ums_member_login_log;

CREATE TABLE public.ums_member_login_log (
                                             id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                             member_id int4 NOT NULL,
                                             create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                             ip text NULL, -- 登陆时的ip地址
                                             login_type int4 NULL, -- 登录类型：0->PC；1->android;2->ios;3->小程序
                                             province text NULL, -- 登陆时所在省份
                                             city text NULL, -- 登陆时所在的城市
                                             CONSTRAINT ums_member_login_log_pkey PRIMARY KEY (id),
                                             CONSTRAINT ums_member_login_log_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.ums_member_login_log IS '会员登录记录';

-- Column comments

COMMENT ON COLUMN public.ums_member_login_log.create_time IS '创建时间';
COMMENT ON COLUMN public.ums_member_login_log.ip IS '登陆时的ip地址';
COMMENT ON COLUMN public.ums_member_login_log.login_type IS '登录类型：0->PC；1->android;2->ios;3->小程序';
COMMENT ON COLUMN public.ums_member_login_log.province IS '登陆时所在省份';
COMMENT ON COLUMN public.ums_member_login_log.city IS '登陆时所在的城市';


-- public.ums_member_member_tag_relation definition

-- Drop table

-- DROP TABLE public.ums_member_member_tag_relation;

CREATE TABLE public.ums_member_member_tag_relation (
                                                       id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                       member_id int4 NOT NULL,
                                                       tag_id int4 NOT NULL,
                                                       CONSTRAINT ums_member_member_tag_relation_pkey PRIMARY KEY (id),
                                                       CONSTRAINT ums_member_member_tag_relation_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id),
                                                       CONSTRAINT ums_member_member_tag_relation_tag_id_fkey FOREIGN KEY (tag_id) REFERENCES public.ums_member_tag(id)
);
COMMENT ON TABLE public.ums_member_member_tag_relation IS '用户和标签关系表';


-- public.ums_member_statistics_info definition

-- Drop table

-- DROP TABLE public.ums_member_statistics_info;

CREATE TABLE public.ums_member_statistics_info (
                                                   id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                   member_id int4 NOT NULL,
                                                   consume_amount int4 DEFAULT 0 NOT NULL, -- 累计消费金额
                                                   order_count int4 DEFAULT 0 NOT NULL, -- 订单数量
                                                   coupon_count int4 DEFAULT 0 NOT NULL, -- 优惠券数量
                                                   comment_count int4 DEFAULT 0 NOT NULL, -- 评价数
                                                   login_count int4 DEFAULT 0 NOT NULL, -- 登录次数
                                                   attend_count int4 DEFAULT 0 NOT NULL, -- 关注数量
                                                   fans_count int4 DEFAULT 0 NOT NULL, -- 粉丝数量
                                                   collect_book_num int4 DEFAULT 0 NOT NULL, -- 收藏的书籍数量
                                                   collect_topic_count int4 DEFAULT 0 NOT NULL, -- 收藏主题数量
                                                   collect_comment_count int4 DEFAULT 0 NOT NULL, -- 收藏评论数量
                                                   invite_friend_count int4 DEFAULT 0 NOT NULL, -- 邀请朋友数量
                                                   recent_order_time date NULL, -- 最后一次下订单时间
                                                   CONSTRAINT ums_member_statistics_info_pkey PRIMARY KEY (id),
                                                   CONSTRAINT ums_member_statistics_info_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.ums_member_statistics_info IS '会员统计信息';

-- Column comments

COMMENT ON COLUMN public.ums_member_statistics_info.consume_amount IS '累计消费金额';
COMMENT ON COLUMN public.ums_member_statistics_info.order_count IS '订单数量';
COMMENT ON COLUMN public.ums_member_statistics_info.coupon_count IS '优惠券数量';
COMMENT ON COLUMN public.ums_member_statistics_info.comment_count IS '评价数';
COMMENT ON COLUMN public.ums_member_statistics_info.login_count IS '登录次数';
COMMENT ON COLUMN public.ums_member_statistics_info.attend_count IS '关注数量';
COMMENT ON COLUMN public.ums_member_statistics_info.fans_count IS '粉丝数量';
COMMENT ON COLUMN public.ums_member_statistics_info.collect_book_num IS '收藏的书籍数量';
COMMENT ON COLUMN public.ums_member_statistics_info.collect_topic_count IS '收藏主题数量';
COMMENT ON COLUMN public.ums_member_statistics_info.collect_comment_count IS '收藏评论数量';
COMMENT ON COLUMN public.ums_member_statistics_info.invite_friend_count IS '邀请朋友数量';
COMMENT ON COLUMN public.ums_member_statistics_info.recent_order_time IS '最后一次下订单时间';


-- public.ums_resource definition

-- Drop table

-- DROP TABLE public.ums_resource;

CREATE TABLE public.ums_resource (
                                     id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                     create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                     "name" text NOT NULL, -- 资源名称
                                     url text NOT NULL, -- 资源URL
                                     description text NULL, -- 描述
                                     category_id int4 NOT NULL, -- 资源分类ID
                                     CONSTRAINT ums_resource_pkey PRIMARY KEY (id),
                                     CONSTRAINT ums_resource_category_id_fkey FOREIGN KEY (category_id) REFERENCES public.ums_resource_category(id)
);
COMMENT ON TABLE public.ums_resource IS '后台资源表';

-- Column comments

COMMENT ON COLUMN public.ums_resource.create_time IS '创建时间';
COMMENT ON COLUMN public.ums_resource."name" IS '资源名称';
COMMENT ON COLUMN public.ums_resource.url IS '资源URL';
COMMENT ON COLUMN public.ums_resource.description IS '描述';
COMMENT ON COLUMN public.ums_resource.category_id IS '资源分类ID';


-- public.ums_role_menu_relation definition

-- Drop table

-- DROP TABLE public.ums_role_menu_relation;

CREATE TABLE public.ums_role_menu_relation (
                                               id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                               role_id int4 NOT NULL,
                                               menu_id int4 NOT NULL,
                                               CONSTRAINT ums_role_menu_relation_pkey PRIMARY KEY (id),
                                               CONSTRAINT ums_role_menu_relation_menu_id_fkey FOREIGN KEY (menu_id) REFERENCES public.ums_menu(id),
                                               CONSTRAINT ums_role_menu_relation_role_id_fkey FOREIGN KEY (role_id) REFERENCES public.ums_role(id)
);
COMMENT ON TABLE public.ums_role_menu_relation IS '后台角色菜单关系表';


-- public.ums_role_permission_relation definition

-- Drop table

-- DROP TABLE public.ums_role_permission_relation;

CREATE TABLE public.ums_role_permission_relation (
                                                     id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                     role_id int4 NOT NULL,
                                                     permission_id int4 NOT NULL,
                                                     CONSTRAINT ums_role_permission_relation_pkey PRIMARY KEY (id),
                                                     CONSTRAINT ums_role_permission_relation_permission_id_fkey FOREIGN KEY (permission_id) REFERENCES public.ums_permission(id),
                                                     CONSTRAINT ums_role_permission_relation_role_id_fkey FOREIGN KEY (role_id) REFERENCES public.ums_role(id)
);
COMMENT ON TABLE public.ums_role_permission_relation IS '后台用户角色和权限关系表';


-- public.ums_role_resource_relation definition

-- Drop table

-- DROP TABLE public.ums_role_resource_relation;

CREATE TABLE public.ums_role_resource_relation (
                                                   id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                   role_id int4 NOT NULL,
                                                   resource_id int4 NOT NULL,
                                                   CONSTRAINT ums_role_resource_relation_pkey PRIMARY KEY (id),
                                                   CONSTRAINT ums_role_resource_relation_resource_id_fkey FOREIGN KEY (resource_id) REFERENCES public.ums_resource(id),
                                                   CONSTRAINT ums_role_resource_relation_role_id_fkey FOREIGN KEY (role_id) REFERENCES public.ums_role(id)
);
COMMENT ON TABLE public.ums_role_resource_relation IS '后台角色资源关系表';


-- public.bms_book_content_block definition

-- Drop table

-- DROP TABLE public.bms_book_content_block;

CREATE TABLE public.bms_book_content_block (
                                               id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                               chapter_id int4 NULL,
                                               footnote_id int4 NULL,
                                               book_id int4 NULL,
                                               author_id int4 NULL,
                                               "type" int4 NOT NULL, -- 内容块类型：0->文本；1->图片；2->图书超链接；3->作者超链接；4->脚注超链接；5->概念知识超链接
                                               "order" int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL, -- 内容块顺序
                                               "content" text NULL, -- 内容块内容
                                               image text NULL,
                                               newline bool DEFAULT false NOT NULL, -- 是否需要换行
                                               CONSTRAINT bms_book_content_block_order_key UNIQUE ("order"),
                                               CONSTRAINT bms_book_content_block_pkey PRIMARY KEY (id),
                                               CONSTRAINT bms_book_content_block_author_id_fkey FOREIGN KEY (author_id) REFERENCES public.bms_author(id),
                                               CONSTRAINT bms_book_content_block_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id),
                                               CONSTRAINT bms_book_content_block_footnote_id_fkey FOREIGN KEY (footnote_id) REFERENCES public.bms_book_footnote(id)
);
COMMENT ON TABLE public.bms_book_content_block IS '书籍内容块';

-- Column comments

COMMENT ON COLUMN public.bms_book_content_block."type" IS '内容块类型：0->文本；1->图片；2->图书超链接；3->作者超链接；4->脚注超链接；5->概念知识超链接';
COMMENT ON COLUMN public.bms_book_content_block."order" IS '内容块顺序';
COMMENT ON COLUMN public.bms_book_content_block."content" IS '内容块内容';
COMMENT ON COLUMN public.bms_book_content_block.newline IS '是否需要换行';


-- public.bms_book_list_member_relation definition

-- Drop table

-- DROP TABLE public.bms_book_list_member_relation;

CREATE TABLE public.bms_book_list_member_relation (
                                                      id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                      book_list_id int4 NOT NULL,
                                                      member_id int4 NOT NULL,
                                                      create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                      CONSTRAINT bms_book_list_member_relation_pkey PRIMARY KEY (id),
                                                      CONSTRAINT bms_book_list_member_relation_book_list_id_fkey FOREIGN KEY (book_list_id) REFERENCES public.bms_book_list(id),
                                                      CONSTRAINT bms_book_list_member_relation_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);

-- Column comments

COMMENT ON COLUMN public.bms_book_list_member_relation.create_time IS '创建时间';


-- public.bms_book_read_progress definition

-- Drop table

-- DROP TABLE public.bms_book_read_progress;

CREATE TABLE public.bms_book_read_progress (
                                               id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                               member_id int4 NOT NULL,
                                               book_id int4 NOT NULL,
                                               last_block_id int4 NOT NULL, -- 上一次阅读到的block位置
                                               update_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 更新时间
                                               CONSTRAINT bms_book_read_progress_pkey PRIMARY KEY (id),
                                               CONSTRAINT bms_book_read_progress_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id),
                                               CONSTRAINT bms_book_read_progress_last_block_id_fkey FOREIGN KEY (last_block_id) REFERENCES public.bms_book_content_block(id),
                                               CONSTRAINT bms_book_read_progress_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.bms_book_read_progress IS '书籍阅读进度';

-- Column comments

COMMENT ON COLUMN public.bms_book_read_progress.last_block_id IS '上一次阅读到的block位置';
COMMENT ON COLUMN public.bms_book_read_progress.update_time IS '更新时间';


-- public.bms_book_select_content_item definition

-- Drop table

-- DROP TABLE public.bms_book_select_content_item;

CREATE TABLE public.bms_book_select_content_item (
                                                     id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                     select_id int4 NOT NULL,
                                                     block_id int4 NOT NULL,
                                                     "offset" int4 DEFAULT 0 NOT NULL, -- block中被选中部分的起始点的偏移量
                                                     length int4 DEFAULT 0 NOT NULL, -- block中被选中部分的长度
                                                     CONSTRAINT bms_book_select_content_item_pkey PRIMARY KEY (id),
                                                     CONSTRAINT bms_book_select_content_item_block_id_fkey FOREIGN KEY (block_id) REFERENCES public.bms_book_content_block(id),
                                                     CONSTRAINT bms_book_select_content_item_select_id_fkey FOREIGN KEY (select_id) REFERENCES public.bms_book_select_content(id)
);
COMMENT ON TABLE public.bms_book_select_content_item IS '书籍选中段落项目';

-- Column comments

COMMENT ON COLUMN public.bms_book_select_content_item."offset" IS 'block中被选中部分的起始点的偏移量';
COMMENT ON COLUMN public.bms_book_select_content_item.length IS 'block中被选中部分的长度';


-- public.bms_book_shelf definition

-- Drop table

-- DROP TABLE public.bms_book_shelf;

CREATE TABLE public.bms_book_shelf (
                                       id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                       member_id int4 NOT NULL, -- 会员ID
                                       create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                       CONSTRAINT bms_book_shelf_pkey PRIMARY KEY (id),
                                       CONSTRAINT bms_book_shelf_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.bms_book_shelf IS '书架';

-- Column comments

COMMENT ON COLUMN public.bms_book_shelf.member_id IS '会员ID';
COMMENT ON COLUMN public.bms_book_shelf.create_time IS '创建时间';


-- public.bms_book_shelf_book_relation definition

-- Drop table

-- DROP TABLE public.bms_book_shelf_book_relation;

CREATE TABLE public.bms_book_shelf_book_relation (
                                                     id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                     book_self_id int4 NOT NULL,
                                                     book_id int4 NOT NULL,
                                                     create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                     CONSTRAINT bms_book_shelf_book_relation_pkey PRIMARY KEY (id),
                                                     CONSTRAINT bms_book_shelf_book_relation_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id),
                                                     CONSTRAINT bms_book_shelf_book_relation_book_self_id_fkey FOREIGN KEY (book_self_id) REFERENCES public.bms_book_shelf(id)
);
COMMENT ON TABLE public.bms_book_shelf_book_relation IS '书架与书籍关系';

-- Column comments

COMMENT ON COLUMN public.bms_book_shelf_book_relation.create_time IS '创建时间';


-- public.cms_member_book_list_relation definition

-- Drop table

-- DROP TABLE public.cms_member_book_list_relation;

CREATE TABLE public.cms_member_book_list_relation (
                                                      id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                      "type" int4 NOT NULL, -- 用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢
                                                      member_id int4 NOT NULL,
                                                      book_list_id int4 NOT NULL,
                                                      create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                      CONSTRAINT cms_member_book_list_relation_pkey PRIMARY KEY (id),
                                                      CONSTRAINT cms_member_book_list_relation_book_list_id_fkey FOREIGN KEY (book_list_id) REFERENCES public.bms_book_list(id),
                                                      CONSTRAINT cms_member_book_list_relation_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.cms_member_book_list_relation IS '用户与书单的关系';

-- Column comments

COMMENT ON COLUMN public.cms_member_book_list_relation."type" IS '用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢';
COMMENT ON COLUMN public.cms_member_book_list_relation.create_time IS '创建时间';


-- public.cms_member_book_relation definition

-- Drop table

-- DROP TABLE public.cms_member_book_relation;

CREATE TABLE public.cms_member_book_relation (
                                                 id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                 "type" int4 NOT NULL, -- 用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢
                                                 member_id int4 NOT NULL,
                                                 book_id int4 NOT NULL,
                                                 create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                 CONSTRAINT cms_member_book_relation_pkey PRIMARY KEY (id),
                                                 CONSTRAINT cms_member_book_relation_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id),
                                                 CONSTRAINT cms_member_book_relation_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.cms_member_book_relation IS '用户与书籍的关系';

-- Column comments

COMMENT ON COLUMN public.cms_member_book_relation."type" IS '用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢';
COMMENT ON COLUMN public.cms_member_book_relation.create_time IS '创建时间';


-- public.cms_member_one_word_relation definition

-- Drop table

-- DROP TABLE public.cms_member_one_word_relation;

CREATE TABLE public.cms_member_one_word_relation (
                                                     id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                     "type" int4 NOT NULL, -- 用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢
                                                     member_id int4 NOT NULL,
                                                     one_workd_id int4 NOT NULL,
                                                     create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                     CONSTRAINT cms_member_one_word_relation_pkey PRIMARY KEY (id),
                                                     CONSTRAINT cms_member_one_word_relation_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id),
                                                     CONSTRAINT cms_member_one_word_relation_one_workd_id_fkey FOREIGN KEY (one_workd_id) REFERENCES public.bms_one_word(id)
);
COMMENT ON TABLE public.cms_member_one_word_relation IS '用户与一言的关系';

-- Column comments

COMMENT ON COLUMN public.cms_member_one_word_relation."type" IS '用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢';
COMMENT ON COLUMN public.cms_member_one_word_relation.create_time IS '创建时间';


-- public.cms_post definition

-- Drop table

-- DROP TABLE public.cms_post;

CREATE TABLE public.cms_post (
                                 id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                 member_id int4 NOT NULL,
                                 visible int4 NOT NULL, -- 可见类型：0->公开，1->私有；2->仅朋友可见（互相关注的人）
                                 create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                 update_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 更新时间
                                 publish_time date NULL, -- 发布时间
                                 title text NOT NULL, -- 帖子标题
                                 ip text NULL, -- 发送该帖子时用户所在的ip
                                 address text NULL, -- 发送该帖子时用户所在的位置
                                 CONSTRAINT cms_post_pkey PRIMARY KEY (id),
                                 CONSTRAINT cms_post_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.cms_post IS '帖子';

-- Column comments

COMMENT ON COLUMN public.cms_post.visible IS '可见类型：0->公开，1->私有；2->仅朋友可见（互相关注的人）';
COMMENT ON COLUMN public.cms_post.create_time IS '创建时间';
COMMENT ON COLUMN public.cms_post.update_time IS '更新时间';
COMMENT ON COLUMN public.cms_post.publish_time IS '发布时间';
COMMENT ON COLUMN public.cms_post.title IS '帖子标题';
COMMENT ON COLUMN public.cms_post.ip IS '发送该帖子时用户所在的ip';
COMMENT ON COLUMN public.cms_post.address IS '发送该帖子时用户所在的位置';


-- public.cms_post_content_block definition

-- Drop table

-- DROP TABLE public.cms_post_content_block;

CREATE TABLE public.cms_post_content_block (
                                               id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                               "type" int4 NOT NULL, -- 帖子内容块类型：0 -> 文本；1->标签；2->书籍超链接；3->作者超链接；3->内容块超链接
                                               post_id int4 NOT NULL,
                                               "content" text NULL, -- 内容块内容
                                               book_id int4 NULL,
                                               author_id int4 NULL,
                                               block_id int4 NULL,
                                               "order" int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                               CONSTRAINT cms_post_content_block_order_key UNIQUE ("order"),
                                               CONSTRAINT cms_post_content_block_pkey PRIMARY KEY (id),
                                               CONSTRAINT cms_post_content_block_author_id_fkey FOREIGN KEY (author_id) REFERENCES public.bms_author(id),
                                               CONSTRAINT cms_post_content_block_block_id_fkey FOREIGN KEY (block_id) REFERENCES public.bms_book_content_block(id),
                                               CONSTRAINT cms_post_content_block_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id),
                                               CONSTRAINT cms_post_content_block_post_id_fkey FOREIGN KEY (post_id) REFERENCES public.cms_post(id)
);
COMMENT ON TABLE public.cms_post_content_block IS '帖子内容块';

-- Column comments

COMMENT ON COLUMN public.cms_post_content_block."type" IS '帖子内容块类型：0 -> 文本；1->标签；2->书籍超链接；3->作者超链接；3->内容块超链接';
COMMENT ON COLUMN public.cms_post_content_block."content" IS '内容块内容';


-- public.cms_post_tag_relation definition

-- Drop table

-- DROP TABLE public.cms_post_tag_relation;

CREATE TABLE public.cms_post_tag_relation (
                                              id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                              post_id int4 NOT NULL,
                                              tag_id int4 NOT NULL,
                                              create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                              CONSTRAINT cms_post_tag_relation_pkey PRIMARY KEY (id),
                                              CONSTRAINT cms_post_tag_relation_post_id_fkey FOREIGN KEY (post_id) REFERENCES public.cms_post(id),
                                              CONSTRAINT cms_post_tag_relation_tag_id_fkey FOREIGN KEY (tag_id) REFERENCES public.cms_post_tag(id)
);
COMMENT ON TABLE public.cms_post_tag_relation IS '帖子标签关系';

-- Column comments

COMMENT ON COLUMN public.cms_post_tag_relation.create_time IS '创建时间';


-- public.cms_comment definition

-- Drop table

-- DROP TABLE public.cms_comment;

CREATE TABLE public.cms_comment (
                                    id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                    "type" int4 NOT NULL, -- 评论类型：0->帖子评论；1->回复评论；2->书籍评论；3->选中段落评论
                                    member_id int4 NOT NULL,
                                    book_id int4 NULL,
                                    comment_id int4 NULL,
                                    post_id int4 NULL,
                                    select_id int4 NOT NULL, -- 选中段落id
                                    create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                    "content" text NOT NULL, -- 评论内容
                                    CONSTRAINT cms_comment_pkey PRIMARY KEY (id),
                                    CONSTRAINT cms_comment_book_id_fkey FOREIGN KEY (book_id) REFERENCES public.bms_book(id),
                                    CONSTRAINT cms_comment_comment_id_fkey FOREIGN KEY (comment_id) REFERENCES public.cms_comment(id),
                                    CONSTRAINT cms_comment_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id),
                                    CONSTRAINT cms_comment_post_id_fkey FOREIGN KEY (post_id) REFERENCES public.cms_post(id),
                                    CONSTRAINT cms_comment_select_id_fkey FOREIGN KEY (select_id) REFERENCES public.bms_book_select_content(id)
);
COMMENT ON TABLE public.cms_comment IS '评论';

-- Column comments

COMMENT ON COLUMN public.cms_comment."type" IS '评论类型：0->帖子评论；1->回复评论；2->书籍评论；3->选中段落评论';
COMMENT ON COLUMN public.cms_comment.select_id IS '选中段落id';
COMMENT ON COLUMN public.cms_comment.create_time IS '创建时间';
COMMENT ON COLUMN public.cms_comment."content" IS '评论内容';


-- public.cms_member_comment_relation definition

-- Drop table

-- DROP TABLE public.cms_member_comment_relation;

CREATE TABLE public.cms_member_comment_relation (
                                                    id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                    "type" int4 NOT NULL, -- 用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢
                                                    member_id int4 NOT NULL,
                                                    comment_id int4 NOT NULL,
                                                    create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                    CONSTRAINT cms_member_comment_relation_pkey PRIMARY KEY (id),
                                                    CONSTRAINT cms_member_comment_relation_comment_id_fkey FOREIGN KEY (comment_id) REFERENCES public.cms_comment(id),
                                                    CONSTRAINT cms_member_comment_relation_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id)
);
COMMENT ON TABLE public.cms_member_comment_relation IS '用户与评论的关系';

-- Column comments

COMMENT ON COLUMN public.cms_member_comment_relation."type" IS '用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢';
COMMENT ON COLUMN public.cms_member_comment_relation.create_time IS '创建时间';


-- public.cms_member_post_relation definition

-- Drop table

-- DROP TABLE public.cms_member_post_relation;

CREATE TABLE public.cms_member_post_relation (
                                                 id int4 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
                                                 "type" int4 NOT NULL, -- 用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢
                                                 member_id int4 NOT NULL,
                                                 post_id int4 NOT NULL,
                                                 create_time date DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 创建时间
                                                 CONSTRAINT cms_member_post_relation_pkey PRIMARY KEY (id),
                                                 CONSTRAINT cms_member_post_relation_member_id_fkey FOREIGN KEY (member_id) REFERENCES public.ums_member(id),
                                                 CONSTRAINT cms_member_post_relation_post_id_fkey FOREIGN KEY (post_id) REFERENCES public.cms_post(id)
);
COMMENT ON TABLE public.cms_member_post_relation IS '用户与帖子的关系';

-- Column comments

COMMENT ON COLUMN public.cms_member_post_relation."type" IS '用户与一言的关系类型：0->喜欢 ；1->收藏；2->不喜欢';
COMMENT ON COLUMN public.cms_member_post_relation.create_time IS '创建时间';