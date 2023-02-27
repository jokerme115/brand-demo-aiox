package com.HeTao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 替换HttpServlet,根据最后一段路径来进行方法分发
 * 反射的知识！！！！
 */

public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求路径
        String requestURI = req.getRequestURI();
        //获取最后一段路径方法名

        int index = requestURI.lastIndexOf('/');
        String methodName = requestURI.substring(index+1); //包含'/'前闭后开

        //执行方法
        //获取BrandServlet 字节码对象class
        Class<? extends BaseServlet> aClass = this.getClass();
        //获取方法method对象
        try {
            Method method = aClass.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, req, resp);

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
