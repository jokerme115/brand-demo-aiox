package com.HeTao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * �滻HttpServlet,�������һ��·�������з����ַ�
 * �����֪ʶ��������
 */

public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //��ȡ����·��
        String requestURI = req.getRequestURI();
        //��ȡ���һ��·��������

        int index = requestURI.lastIndexOf('/');
        String methodName = requestURI.substring(index+1); //����'/'ǰ�պ�

        //ִ�з���
        //��ȡBrandServlet �ֽ������class
        Class<? extends BaseServlet> aClass = this.getClass();
        //��ȡ����method����
        try {
            Method method = aClass.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, req, resp);

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
