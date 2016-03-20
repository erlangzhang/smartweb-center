package com.iweb.smartweb.persistence.service;

import com.iweb.smartweb.commons.utils.Response;
import com.iweb.smartweb.persistence.model.UserInfo;

/**
 * 类注释
 * <p/>
 * <ul>
 * <li>方法列表</li>
 * </ul>
 *
 * @author zhanglingsi
 * @version 1.0.0 createTime: 16/3/11 11:28
 * @see
 * @since 1.0
 */
public interface UserInfoService {

    /**
     * 1.创建用户,
     */
    Response<String> create(UserInfo userInfo, String tracelogid);

}
