package com.iweb.smartweb.commons.exception;

import lombok.Getter;

/**
 * User: JamesTang
 * Date: 14-4-2
 * Time: 下午2:19
 */
public class BizException extends RuntimeException {
    @Getter
    private String code;

    public BizException(String code) {
        this.code = code;
    }

    public BizException(String code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }

}