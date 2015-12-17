package com.iweb.smartweb.commons.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class ProcessException extends RuntimeException {
    @Getter
    @Setter
    private  String code;
    @Getter
    @Setter
    private  String desc;

    public ProcessException() {
    }

    public ProcessException(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}