package com.iweb.smartweb.commons.exception;

import com.iweb.smartweb.commons.constants.RespCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 */
@ToString
public class DaoException extends RuntimeException{

    private final RespCode code;
    @Getter
    @Setter
    private  String resCode;
    @Getter
    @Setter
    private  String resDescription;

    public DaoException(RespCode code) {
        this.code = code;
        this.resCode = code.getResCode();
        this.resDescription =code.getResDescription();
    }


    public DaoException(String resCode, String resDescription) {
        this.code = RespCode.REFUND_FAIL;
        this.resCode = resCode;
        this.resDescription = resDescription;
    }

    public DaoException(String code){
        this.code = RespCode.from(code);
    }

    public RespCode getCode() {
        return code;
    }

}
