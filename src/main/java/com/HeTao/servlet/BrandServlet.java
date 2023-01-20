package com.HeTao.servlet;

import com.HeTao.pojo.Brand;
import com.HeTao.pojo.PageBean;
import com.HeTao.service.impl.BrandServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/brand/*")
public class BrandServlet extends BaseServlet{
    private final BrandServiceImpl brandService = new BrandServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        List<Brand> brands = brandService.SelectAll();

        //2.把数据转为JSON
        String jsonString = JSON.toJSONString(brands);
        //3.写数据,转码
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //获取Brand对象
        BufferedReader reader = req.getReader();
        String readLine = reader.readLine();
        //转为Brand
        Brand brand = JSON.parseObject(readLine, Brand.class);

        //调用service添加
        brandService.addBrand(brand);
        resp.getWriter().write("success");
    }

    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        //获取Brand对象
        BufferedReader reader = req.getReader();
        String readLine = reader.readLine();
        //转为数组
        int[] ints = JSON.parseObject(readLine, int[].class);
        brandService.deleteById(ints);
        resp.getWriter().write("success");
    }
    //分页查询
    public void selectByPage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取参数
        String _currentPage = req.getParameter("currentPage");
        String _pageSize = req.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);


        PageBean<Brand> pageBean = brandService.selectByPage(currentPage, pageSize);

        String jsonString = JSON.toJSONString(pageBean);

        //3.写数据,转码
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
    //分页条件查询
    public void selectByPageAndCondition(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取参数
        String _currentPage = req.getParameter("currentPage");
        String _pageSize = req.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);
        //获取查询条件参数
        //获取Brand对象
        BufferedReader reader = req.getReader();
        String readLine = reader.readLine();
        //转为Brand
        Brand brand = JSON.parseObject(readLine, Brand.class);

        PageBean<Brand> pageBean = brandService.selectByPageAndCondition(currentPage, pageSize, brand);

        String jsonString = JSON.toJSONString(pageBean);

        //3.写数据,转码
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
    public void selectById(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        //获取Brand对象
        BufferedReader reader = req.getReader();
        String readLine = reader.readLine();
        //转为数组
        Integer integer = JSON.parseObject(readLine, int.class);
        Brand brand = brandService.selectById(integer);

        //返回brand
        //3.写数据,转码
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(brand);
        resp.getWriter().write(jsonString);
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        //获取Brand对象
        BufferedReader reader = req.getReader();
        String readLine = reader.readLine();
        //转为Brand
        Brand brand = JSON.parseObject(readLine, Brand.class);
        brandService.update(brand);
        resp.getWriter().write("success");
    }
}
