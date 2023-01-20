package com.HeTao.service.impl;

import com.HeTao.mapper.BrandMapper;
import com.HeTao.pojo.Brand;
import com.HeTao.pojo.PageBean;
import com.HeTao.service.BrandService;
import com.HeTao.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Map;

public class BrandServiceImpl implements BrandService {
    //1.创建工厂
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Brand> SelectAll() {
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();;
        //3.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4.调用方法
        List<Brand> brands = mapper.selectAll();
        //关闭资源
        sqlSession.close();
        return brands;
    }

    @Override
    public void addBrand(Brand brand) {
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();;
        //3.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.add(brand);

        sqlSession.commit();
        sqlSession.close();

    }
    public void deleteById(int[] ids){
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();;
        //3.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.deleteById(ids);

        sqlSession.commit();
        sqlSession.close();
    }
    public PageBean<Brand> selectByPage(int currentPage, int pageSize){
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();;
        //3.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        List<Brand> brands = mapper.selectByPage((currentPage - 1) * pageSize, pageSize);

        int totalCount = mapper.selectTotalCount();

        sqlSession.close();
        return new PageBean<>(totalCount, brands);
    }

    @Override
    public PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand) {
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();;
        //3.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //查询之前处理数据
        String brandName = brand.getBrandName();
        if (brandName != null && brandName.length() > 0)
            brand.setBrandName("%"+brandName+"%");
        String company = brand.getCompanyName();
        if (company != null && company.length() > 0)
            brand.setCompanyName("%"+company+"%");

        int totalCountAndCondition = mapper.selectTotalCountAndCondition(brand);
        List<Brand> brands;

        if (totalCountAndCondition >= currentPage * pageSize)
            brands = mapper.selectByPageAndCondition((currentPage - 1) * pageSize, pageSize, brand);
        else
            brands = mapper.selectByPageAndCondition((currentPage - 1) * pageSize, totalCountAndCondition % pageSize, brand);


        sqlSession.close();
        return new PageBean<>(totalCountAndCondition, brands);
    }

    @Override
    public Brand selectById(int id) {
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();;
        //3.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectById(id);

        sqlSession.close();
        return brand;
    }

    @Override
    public void update(Brand brand) {
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();;
        //3.获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.update(brand);
        sqlSession.commit();
        sqlSession.close();

    }


}
