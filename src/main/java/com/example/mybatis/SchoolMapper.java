package com.example.mybatis;

import com.example.domain.Province;
import com.example.domain.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 77060 on 2016/11/21.
 */
@Mapper
public interface SchoolMapper {
    // select语句,已测试
    School selectById(@Param("id") int id);

    List<School> selectManyByProvince(@Param("province") Province province);

    School selectByName(@Param("name") String name);

    // insert语句，已测试
    // 如果违反约束将会抛出异常
    int insertOne(@Param("school")School school);

    // 在批量插入时有必须遵循的准则，详情见xml文件
     int insertMany(@Param("list")List<School> schoolList);

}
