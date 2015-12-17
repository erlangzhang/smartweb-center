package com.iweb.smartweb.commons.exception;

import lombok.Getter;


public class NeverStopBizException extends RuntimeException {

    @Getter
    private String code;

    public NeverStopBizException(String code) {
        this.code = code;
    }

    public NeverStopBizException(String code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public NeverStopBizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public NeverStopBizException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }
}
