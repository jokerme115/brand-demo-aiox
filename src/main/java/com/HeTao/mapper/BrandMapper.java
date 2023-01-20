package com.HeTao.mapper;

import com.HeTao.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandMapper {

    /**
     * 查询所有
     * @return 返回Brand的集合
     */
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select * from tb_brand where id = #{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    /**
     * 修改
     * @param brand
     */
    @Update("update tb_brand set brand_name = #{brandName},company_name = #{companyName},ordered = #{ordered},description = #{description},status = #{status} where id = #{id}")
    void update(Brand brand);

    /**
     * 通过数组里面的id删除
     * @param ids
     */
    void deleteById(int[] ids);

    /**
     * 分页查询
     * @param begin 开始
     * @param size 数量
     * @return  List<Brand>
     */
    @Select("Select * From tb_brand limit #{begin}, #{size};")
    @ResultMap("brandResultMap")
    List<Brand> selectByPage(@Param("begin") int begin,@Param("size") int size);

    /**
     * 查询所有记录数
     * @return 返回记录数
     */
    @Select("select count(*) from tb_brand;")
    int selectTotalCount();


    List<Brand> selectByPageAndCondition(@Param("begin") int begin,@Param("size") int size, @Param("brand")Brand brand);

    /**
     * 查询所有记录数
     * @return 返回记录数
     */
    int selectTotalCountAndCondition(Brand brand);
}
