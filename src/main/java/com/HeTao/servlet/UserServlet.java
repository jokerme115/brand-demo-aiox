package com.HeTao.servlet;

import com.HeTao.pojo.User;
import com.HeTao.service.UserService;
import com.HeTao.service.impl.UserServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/User/*")
public class UserServlet extends BaseServlet{
    UserServiceImpl userService = new UserServiceImpl();

    /**
     * 根据用户名和密码登录得到前端的用户名和密码进行封装
     */
    public boolean login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        /*BufferedReader reader = req.getReader();
        String readLine = reader.readLine();
        //获取数据
        User user = JSON.parseObject(readLine, User.class);*/

        User user = new User(username, password);

        //查询数据
        User select = userService.select(user);

        return select != null;
    }
}
