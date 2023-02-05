package com.HeTao.service;

import com.HeTao.pojo.User;
import com.HeTao.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSessionFactory;

public interface UserService {
    /**
     * 登录功能,通过用户名密码登录
     * @param user 封装用户名和密码
     * @return 返回对象如果对象存在
     */
    User select(User user);
}
