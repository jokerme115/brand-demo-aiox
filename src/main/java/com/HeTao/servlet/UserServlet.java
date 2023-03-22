package com.HeTao.servlet;

import com.HeTao.pojo.User;
import com.HeTao.service.impl.UserServiceImpl;
import com.HeTao.util.CheckCodeUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/User/*")
public class UserServlet extends BaseServlet{
    UserServiceImpl userService = new UserServiceImpl();

    /**
     * �����û����������¼�õ�ǰ�˵��û�����������з�װ
     */
    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        BufferedReader reader = req.getReader();
        String readLine = reader.readLine();
        User user = JSON.parseObject(readLine, User.class);

        //��ѯ����
        User select = userService.select(user);
        if (select != null) {
            resp.getWriter().write("success");
            System.out.println(user.isCheck());
            if (user.isCheck()){
                //����cookie
                //1.����cookie
                Cookie cookie_username = new Cookie("username", user.getUsername());
                Cookie cookie_userPassword = new Cookie("password", user.getPassword());

                //���ô��ʱ��
                cookie_username.setMaxAge(60 * 60 * 24 * 15);
                cookie_userPassword.setMaxAge(60 * 60 * 24 * 15);
                //2.����cookie
                resp.addCookie(cookie_username);
                resp.addCookie(cookie_userPassword);
            }else
            {
                Cookie[] cookies = req.getCookies();
                for (Cookie cookie :cookies)
                    if (cookie.getName().equals("username") || cookie.getName().equals("password"))
                    {
                        cookie.setMaxAge(0);
                        resp.addCookie(cookie);
                    }
            }
            //����¼�ɹ����user����洢��session��
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
        }
    }

    /**
     * ����û�
     */
    public void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String readLine = reader.readLine();
        User user = JSON.parseObject(readLine, User.class);

        HttpSession session = req.getSession();
        String checkCode = (String) session.getAttribute("checkCode");

        System.out.println(checkCode);
        System.out.println(user.getCheckCode());
        if (!checkCode.equalsIgnoreCase(user.getCheckCode()))
        {
            resp.getWriter().write("checkCode Fail");
            return;
        }

        userService.add(user);
        resp.getWriter().write("success");
    }

    public void checkCode(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(); //��Ҫ��ǰ

        //������֤��
        ServletOutputStream outputStream = resp.getOutputStream();
        String s = CheckCodeUtil.outputVerifyImage(100, 60, outputStream, 4);

        //����session��
        session.setAttribute("checkCode", s);

    }
}
