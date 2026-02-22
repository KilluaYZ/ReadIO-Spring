package com.pool.readio.common.log;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import cn.hutool.json.JSONUtil;
import io.swagger.v3.oas.annotations.Operation;
import net.logstash.logback.marker.Markers;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pool.readio.common.domain.WebLog;

/**
 * 统一 Web 请求日志处理切面。
 * <p>
 * 对匹配的 Controller 方法进行环绕增强，在请求前后记录 URL、方法、参数、耗时、
 * 描述等信息，并输出为结构化日志（便于 Logstash 等采集与检索）。
 * </p>
 * <p>
 * 切点范围：
 * <ul>
 *   <li>{@code com.pool.readio.controller} 包下所有 public 方法</li>
 *   <li>{@code com.pool.readio.*.controller} 包下所有 public 方法（任意子模块的 controller）</li>
 * </ul>
 * 若方法上标注了 Swagger/OpenAPI 的 {@link Operation}，则使用其 {@code summary} 作为操作描述。
 * </p>
 *
 * @see WebLog 日志数据封装
 * @see Operation 操作描述来源（summary）
 */
@Aspect
@Component
@Order(1)
public class WebLogAspect {

    /** 本类日志记录器 */
    private static final Logger LOGGER = LoggerFactory.getLogger(WebLogAspect.class);

    /**
     * Web 日志切点：匹配 Controller 层所有 public 方法。
     * <ul>
     *   <li>com.pool.readio.controller.*.*(..) — 主模块 controller</li>
     *   <li>com.pool.readio.*.controller.*.*(..) — 各子模块 controller</li>
     * </ul>
     */
    @Pointcut("execution(public * com.pool.readio.controller.*.*(..))||execution(public * com.pool.readio.*.controller.*.*(..))")
    public void webLog() {}

    /**
     * 在匹配方法执行前执行（当前为空实现，预留扩展点）。
     *
     * @param joinPoint 连接点，可获取目标方法、参数等
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {}

    /**
     * 在匹配方法正常返回后执行（当前为空实现，预留扩展点）。
     *
     * @param ret 方法返回值
     */
    @AfterReturning(value = "webLog()", returning = "ret")
    public void doAfterReturning(Object ret) throws Throwable {}

    /**
     * 环绕通知：在目标方法执行前后记录请求信息并输出 Web 日志。
     * <p>
     * 流程：记录开始时间 → 执行目标方法 → 从请求与方法上收集 URL、Method、参数、
     * 耗时、Operation 描述等 → 封装为 {@link WebLog} 并输出为 JSON 结构化日志。
     * 使用 {@link Markers#appendEntries} 便于 Logstash 解析为独立字段。
     * </p>
     *
     * @param joinPoint 可执行的连接点，用于调用 {@link ProceedingJoinPoint#proceed()}
     * @return 目标方法的返回值，原样返回
     * @throws Throwable 目标方法或本切面抛出的异常
     */
    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        WebLog webLog = new WebLog();

        // 执行目标 Controller 方法
        Object result = joinPoint.proceed();

        // 通过反射获取当前执行的方法，用于读取 @Operation 和参数注解
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        // 若方法上有 Swagger/OpenAPI 的 @Operation，用其 summary 作为操作描述
        if (method.isAnnotationPresent(Operation.class)) {
            Operation log = method.getAnnotation(Operation.class);
            webLog.setDescription(log.summary());
        }

        long endTime = System.currentTimeMillis();
        String urlStr = request.getRequestURL().toString();

        // 根路径：去掉 URI 后的 base（如 http://host:port）
        webLog.setBasePath(StrUtil.removeSuffix(urlStr, URLUtil.url(urlStr).getPath()));
        // 注意：getRemoteUser() 为认证用户名，若需记录客户端 IP 可改为 request.getRemoteAddr()
        webLog.setIp(request.getRemoteUser());
        webLog.setMethod(request.getMethod());
        webLog.setParameter(getParameter(method, joinPoint.getArgs()));
        webLog.setResult(result);
        webLog.setSpendTime((int) (endTime - startTime));
        webLog.setStartTime(startTime);
        webLog.setUri(request.getRequestURI());
        webLog.setUrl(request.getRequestURL().toString());

        // 构建 Logstash 可解析的结构化字段，便于日志系统检索
        Map<String, Object> logMap = new HashMap<>();
        logMap.put("url", webLog.getUrl());
        logMap.put("method", webLog.getMethod());
        logMap.put("parameter", webLog.getParameter());
        logMap.put("spendTime", webLog.getSpendTime());
        logMap.put("description", webLog.getDescription());
        LOGGER.info(Markers.appendEntries(logMap), JSONUtil.parse(webLog).toString());

        return result;
    }

    /**
     * 根据方法参数上的注解（{@link RequestBody} / {@link RequestParam}）提取请求参数，用于日志记录。
     * <p>
     * 规则：
     * <ul>
     *   <li>{@link RequestBody}：直接将该参数值加入列表（通常为请求体对象）</li>
     *   <li>{@link RequestParam}：以 key-value 形式加入，key 优先取 value()，否则取参数名</li>
     * </ul>
     * 返回规则：无参数返回 null；单参数返回该参数；多参数返回参数列表。
     * </p>
     *
     * @param method 当前执行的 Controller 方法
     * @param args   方法实参，与 method.getParameters() 一一对应
     * @return 提取出的参数（null / 单个对象 / List），用于写入 WebLog.parameter
     */
    private Object getParameter(Method method, Object[] args) {
        List<Object> argList = new ArrayList<>();
        Parameter[] parameters = method.getParameters();

        for (int i = 0; i < parameters.length; i++) {
            RequestBody requestBody = parameters[i].getAnnotation(RequestBody.class);
            if (requestBody != null) {
                argList.add(args[i]);
            }
            RequestParam requestParam = parameters[i].getAnnotation(RequestParam.class);
            if (requestParam != null) {
                Map<String, Object> map = new HashMap<>();
                String key = parameters[i].getName();
                if (StringUtils.hasText(requestParam.value())) {
                    key = requestParam.value();
                }
                map.put(key, args[i]);
                argList.add(map);
            }
        }

        if (argList.isEmpty()) {
            return null;
        } else if (argList.size() == 1) {
            return argList.getFirst();
        }
        return argList;
    }
}
