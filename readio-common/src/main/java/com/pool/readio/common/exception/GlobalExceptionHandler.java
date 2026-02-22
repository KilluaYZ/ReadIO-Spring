package com.pool.readio.common.exception;

import com.pool.readio.common.api.CommonResult;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理器。
 * <p>
 * 使用 Spring 的 {@link ControllerAdvice} 对所有 Controller 抛出的指定类型异常进行统一捕获，
 * 并转换为统一的 {@link CommonResult} 格式返回给前端，避免未处理异常导致 500 或堆栈信息泄露。
 * </p>
 * <p>
 * 当前处理的异常类型包括：
 * <ul>
 *   <li>{@link ApiException}：业务异常，可携带错误码或自定义消息</li>
 *   <li>{@link MethodArgumentNotValidException}：请求体（如 JSON）参数校验失败（@RequestBody + @Valid）</li>
 *   <li>{@link BindException}：表单/查询参数绑定与校验失败（如 @ModelAttribute、表单提交）</li>
 * </ul>
 * </p>
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理业务异常 {@link ApiException}。
     * <p>
     * 当业务层通过 {@link Asserts} 或直接抛出 ApiException 时，会进入此方法。
     * 若异常带有错误码则按错误码返回，否则使用异常消息。
     * </p>
     *
     * @param e 捕获到的 ApiException
     * @return 失败结果的 CommonResult，包含错误码/消息，无 data
     */
    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public CommonResult<?> handler(ApiException e) {
        if (e.getErrorCode() != null) {
            return CommonResult.failed(e.getErrorCode());
        }
        return CommonResult.failed(e.getMessage());
    }

    /**
     * 处理请求体验证异常 {@link MethodArgumentNotValidException}。
     * <p>
     * 在 Controller 方法参数上使用 @RequestBody + @Valid（或 @Validated）时，
     * 若校验不通过（如 JSR-303 注解：@NotNull、@Size 等），Spring 会抛出此异常。
     * 通常对应 JSON 请求体的字段校验。
     * </p>
     *
     * @param e 捕获到的 MethodArgumentNotValidException，内部包含 BindingResult
     * @return 参数校验失败的 CommonResult（validateFailed），消息为：字段名 + 默认错误信息
     */
    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CommonResult<?> handlerValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField() + fieldError.getDefaultMessage();
            }
        }
        return CommonResult.validateFailed(message);
    }

    /**
     * 处理参数绑定与校验异常 {@link BindException}。
     * <p>
     * 当使用 @ModelAttribute、表单提交、或非 @RequestBody 的参数绑定且配有校验注解时，
     * 若绑定或校验失败，Spring 会抛出 BindException。
     * 与 MethodArgumentNotValidException 的区别在于触发的参数类型（非请求体）。
     * </p>
     *
     * @param e 捕获到的 BindException，内部包含 BindingResult
     * @return 参数校验失败的 CommonResult（validateFailed），消息为：字段名 + 默认错误信息
     */
    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public CommonResult<?> handleValidException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField() + fieldError.getDefaultMessage();
            }
        }
        return CommonResult.validateFailed(message);
    }
}
