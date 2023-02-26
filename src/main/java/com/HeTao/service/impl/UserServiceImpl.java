package com.HeTao.service.impl;

import com.HeTao.mapper.UserMapper;
import com.HeTao.pojo.User;
import com.HeTao.service.UserService;
import com.HeTao.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserServiceImpl implements UserService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public User select(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.select(user.getUsername(), user.getPassword());

        sqlSession.close();
        return user1;
    }

    @Override
    public void add(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        mapper.add(user);

        sqlSession.commit();
        sqlSession.close();
    }


}
