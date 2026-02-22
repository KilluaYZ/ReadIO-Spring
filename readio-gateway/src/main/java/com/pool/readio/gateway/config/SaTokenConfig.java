package com.pool.readio.gateway.config;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import cn.dev33.satoken.reactor.context.SaReactorSyncHolder;
import cn.dev33.satoken.reactor.filter.SaReactorFilter;
import cn.dev33.satoken.router.SaHttpMethod;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.server.ServerWebExchange;

import java.util.*;

import com.pool.readio.common.api.CommonResult;
import com.pool.readio.common.constant.AuthConstant;
import com.pool.readio.gateway.util.StpMemberUtil;

/**
 * Sa-Token相关配置
 */
@Configuration
public class SaTokenConfig {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 注册Sa-Token全局过滤器
     * @param ignoreUrlsConfig
     * @return
     */
    public SaReactorFilter getSaReactorFilter(IgnoreUrlsConfig ignoreUrlsConfig) {
        return new SaReactorFilter()
                // 拦截地址
                .addInclude("/**")
                // 配置白名单路径
                .setExcludeList(ignoreUrlsConfig.getUrls())
                // 鉴权方法：每次访问进入
                .setAuth(obj -> {
                    // 对于Options预检请求直接放行
                    SaRouter.match(SaHttpMethod.OPTIONS).stop();
                    // 登陆认证：前台会员认证
                    SaRouter.match("/readio-portal/**", r -> StpMemberUtil.checkLogin()).stop();
                    // 登陆认证：管理后台用户认证
                    SaRouter.match("/readio-admin/**", r -> StpUtil.checkLogin());
                    // 权限认证：管理后台用户权限校验
                    // 获取Redis中缓存的各个接口路径所需权限规则
                    Map<Object, Object> pathResourceMap = redisTemplate.opsForHash().entries(AuthConstant.PATH_RESOURCE_MAP);
                    // 获取到访问当前接口所需权限（一个路径对应多个资源时，拥有任意一个资源都可以访问该路径）
                    List<String> needPermissionList = new ArrayList<>();
                    // 获取当前请求路径
                    String requestPath = SaHolder.getRequest().getRequestPath();
                    // 创建路径匹配器
                    PathMatcher pathMatcher = new AntPathMatcher();
                    Set<Map.Entry<Object, Object>> entrySet = pathResourceMap.entrySet();
                    for (Map.Entry<Object, Object> entry : entrySet) {
                        String pattern = (String) entry.getKey();
                        if (pathMatcher.match(pattern, requestPath)) {
                            needPermissionList.add((String) entry.getValue());
                        }
                    }
                    // 接口需要权限时鉴权
                    if(CollUtil.isNotEmpty(needPermissionList)) {
                        SaRouter.match(requestPath,
                                r -> StpUtil.checkPermissionOr(Convert.toStrArray(needPermissionList)));
                    }
                })
                // setAuth方法异常处理
                .setError(this::handleException);
    }

    /**
     * 自定义异常处理
     * @param e
     * @return
     */
    private CommonResult handleException(Throwable e) {
        // 设置错误返回格式为Json
        ServerWebExchange exchange = SaReactorSyncHolder.getExchange();
        HttpHeaders headers = exchange.getRequest().getHeaders();
        headers.set("Content-Type", "application/json;charset=UTF-8");
        headers.set("Access-Control-Allow-Origin", "*");
        headers.set("Cache-Control", "no-cache");
        CommonResult result = null;
        if (e instanceof NotLoginException) {
            result = CommonResult.unauthorized(null);
        } else if (e instanceof NotPermissionException) {
            result = CommonResult.forbidden(null);
        } else {
            result = CommonResult.failed(e.getMessage());
        }
        return result;
    }
}
