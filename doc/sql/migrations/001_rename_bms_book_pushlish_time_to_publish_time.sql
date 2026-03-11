-- 拼写修正：bms_book 表字段 pushlish_time -> publish_time
-- 执行前请备份；执行后需重新编译项目以使 MBG 模型与 Mapper 生效（若使用生成的代码则需重新生成）

ALTER TABLE public.bms_book RENAME COLUMN pushlish_time TO publish_time;

COMMENT ON COLUMN public.bms_book.publish_time IS '出版日期';
