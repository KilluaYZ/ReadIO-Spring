package com.pool.readio.common.exception;

import com.pool.readio.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 */
public class Asserts {
    public static void fall(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
