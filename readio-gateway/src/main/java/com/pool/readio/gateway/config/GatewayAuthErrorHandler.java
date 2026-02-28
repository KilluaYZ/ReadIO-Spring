package com.pool.readio.gateway.config;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import cn.hutool.json.JSONUtil;
import com.pool.readio.common.api.CommonResult;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

/**
 * Gateway 层统一处理鉴权异常，避免落入默认错误页导致 404/500 与 "Headers are not sent before onComplete()"。
 * 当 Sa-Token 抛出 NotLoginException/NotPermissionException 并传播到此处理器时，返回 401/403 与 JSON 体。
 * 使用 Hutool JSONUtil 序列化，避免 Gateway 无 ObjectMapper Bean 时启动失败。
 */
@Component
@Order(-2)
public class GatewayAuthErrorHandler implements WebExceptionHandler {

    @Override
    public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
        if (!(ex instanceof NotLoginException) && !(ex instanceof NotPermissionException)) {
            return Mono.error(ex);
        }

        ServerHttpResponse response = exchange.getResponse();
        if (response.isCommitted()) {
            return Mono.error(ex);
        }

        HttpStatus status = ex instanceof NotLoginException ? HttpStatus.UNAUTHORIZED : HttpStatus.FORBIDDEN;
        CommonResult<?> result = ex instanceof NotLoginException
                ? CommonResult.unauthorized(null)
                : CommonResult.forbidden(null);

        response.setStatusCode(status);
        response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
        response.getHeaders().set("Access-Control-Allow-Origin", "*");
        response.getHeaders().set("Cache-Control", "no-cache");

        byte[] bytes;
        try {
            bytes = JSONUtil.toJsonStr(result).getBytes(StandardCharsets.UTF_8);
        } catch (Exception e) {
            bytes = "{\"code\":401,\"message\":\"error\"}".getBytes(StandardCharsets.UTF_8);
        }
        DataBuffer buffer = response.bufferFactory().wrap(bytes);
        return response.writeWith(Mono.just(buffer));
    }
}
