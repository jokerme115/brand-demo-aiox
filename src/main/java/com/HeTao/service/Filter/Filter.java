package com.HeTao.service.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/*")
public class Filter implements javax.servlet.Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest servlet = (HttpServletRequest) servletRequest;

        //把登录和注册的资源放行
        String[] loginResource = {"/User/register", "/css/", "/images/", "index.html", "/User/login", "/User/checkCode", "/js/"};

        String requestURL = servlet.getRequestURL().toString();

        for (String e : loginResource)
            if (requestURL.contains(e)) {
                //找到了 放行
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
        //拦截未登录
        HttpSession session = servlet.getSession();
        Object user = session.getAttribute("user");
        if (user == null)
        {
            //未登录
            servletRequest.setAttribute("login_msg", "请登录！");
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest, servletResponse);
        }else {
            //找到了 放行
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
