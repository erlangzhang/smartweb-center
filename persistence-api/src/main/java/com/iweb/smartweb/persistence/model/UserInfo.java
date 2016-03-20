package com.iweb.smartweb.persistence.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 类注释
 * <p/>
 * <ul>
 * <li>方法列表</li>
 * </ul>
 *
 * @author zhanglingsi
 * @version 1.0.0 createTime: 15/12/17 15:24
 * @see
 * @since 1.0
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -8793417814202684435L;

    private String userId;   //唯一标示
    private String userName; //登陆用户名(通常是手机号或者邮箱地址)
    private String userFullName; //真实姓名
    private String userPassword; //密码
    private Boolean userSex;     //性别
    private Date userBirthDate;  //出生日期
    private String userAge;      //年龄(计算得出)
    private String userMail;     //邮箱地址
    private String userPhone;    //手机号码
    private Integer userStatus;  //用户状态(1:注册未激活,2:注册已激活,3:密码过期,锁定冻结状态,0:逻辑删除状态)
    private Date userRegTime;    //注册时间
    private Timestamp lastUpdateTime; //最后修改时间

    private UserDetailInfo userDetailInfo;

}
