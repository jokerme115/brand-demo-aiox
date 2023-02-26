package com.HeTao.service;

import com.HeTao.pojo.Brand;
import com.HeTao.pojo.PageBean;

import java.util.List;

public interface BrandService {
    List<Brand> SelectAll();
    void addBrand(Brand brand);
    void deleteById(int[] ids);

    /**
     * 分页查询
     * @param currentPage 当前页码
     * @param pageSize 每页数量
     * @return  PageBean<Brand>
     */
    PageBean<Brand> selectByPage(int currentPage, int pageSize);

    /**
     * 条件查询
     * @param currentPage 当前页码
     * @param pageSize 每页数量
     * @param brand 封装的brand数据
     * @return PageBean<Brand>
     */
    PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand);

    Brand selectById(int id);

    void update(Brand brand);


}
