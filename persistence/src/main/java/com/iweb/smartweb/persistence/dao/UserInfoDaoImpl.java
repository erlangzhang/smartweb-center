package com.iweb.smartweb.persistence.dao;

import com.iweb.smartweb.commons.utils.Response;
import com.iweb.smartweb.persistence.common.GenericIbatisDao;
import com.iweb.smartweb.persistence.model.UserInfo;
import org.springframework.stereotype.Service;


/**
 * 类注释
 * <p/>
 * <ul>
 * <li>方法列表</li>
 * </ul>
 *
 * @author zhanglingsi
 * @version 1.0.0 createTime: 16/3/10 16:14
 * @see
 * @since 1.0
 */
@Service
public class UserInfoDaoImpl extends GenericIbatisDao<UserInfo, String> implements UserInfoDao {

    @Override
    public Response<String> create(UserInfo userInfo, String tracelogid) {
        super.insert(userInfo);
        return null;
    }
}
