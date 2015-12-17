package com.iweb.smartweb.commons.exception;

import com.iweb.smartweb.commons.constants.RespCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
public class ValidateException extends RuntimeException {

    private RespCode code = RespCode.REFUND_FAIL;

    private  String resCode;

    private  String resDescription;

    public ValidateException(RespCode code) {
        this.code = code;
        this.resCode = code.getResCode();
        this.resDescription =code.getResDescription();
    }


    public ValidateException(String resCode, String resDescription) {
        this.code = RespCode.REFUND_FAIL;
        this.resCode = resCode;
        this.resDescription = resDescription;
    }

    public ValidateException(String code){
        this.code = RespCode.from(code);
    }

    public RespCode getCode() {
        return code;
    }

}
