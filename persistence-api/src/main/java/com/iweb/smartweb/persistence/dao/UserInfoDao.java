package com.iweb.smartweb.persistence.dao;

import com.iweb.smartweb.commons.utils.Response;
import com.iweb.smartweb.persistence.model.UserDetailInfo;
import com.iweb.smartweb.persistence.model.UserInfo;

/**
 * 类注释
 * <p/>
 * <ul>
 * <li>方法列表</li>
 * </ul>
 *
 * @author zhanglingsi
 * @version 1.0.0 createTime: 16/3/10 16:08
 * @see
 * @since 1.0
 */
public interface UserInfoDao extends GenericDao<UserInfo, String> {

    /**
     * 创建用户
     *
     * @param userInfo 用户验证信息表(T_USER_DETAIL_INFO)
     * @return 入库成功，失败
     */
    Response<String> create(UserInfo userInfo, String tracelogid);

}
