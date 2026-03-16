package com.pool.readio.mbg.mongo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义反序列化器：宽松解析 chapters[*].images，仅提取字符串 URL。
 * - 如果元素是字符串，直接加入结果；
 * - 如果元素是对象，优先取 "url" 字段的字符串值；
 * - 其他类型则使用 asText() 尝试转换为字符串。
 */
public class ChapterItemImagesDeserializer extends JsonDeserializer<List<String>> {

    @Override
    public List<String> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        List<String> result = new ArrayList<>();

        JsonNode node = p.getCodec().readTree(p);
        if (node == null || node.isNull()) {
            return result;
        }

        if (node.isArray()) {
            for (JsonNode item : node) {
                if (item == null || item.isNull()) {
                    continue;
                }

                // 直接是字符串
                if (item.isTextual()) {
                    result.add(item.asText());
                    continue;
                }

                // 对象：优先取 url 字段
                if (item.isObject()) {
                    JsonNode urlNode = item.get("url");
                    if (urlNode != null && urlNode.isTextual()) {
                        result.add(urlNode.asText());
                        continue;
                    }
                }

                // 其他类型：退化为字符串
                if (item.asToken() != JsonToken.START_OBJECT && item.asToken() != JsonToken.START_ARRAY) {
                    result.add(item.asText());
                }
            }
        }

        return result;
    }
}

