package com.example.mybatis;

import com.example.domain.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 77060 on 2016/11/23.
 */
@Mapper
public interface DepartmentMapper {
    // 测试通过
    Department selectById(@Param("id") int id);
    List<Department> selectManyBySchoolId(@Param("schoolId") int schoolId);
    List<Department> selectManyBySchoolName(String schoolName);
    Department selectBySchoolIdAndDepartmentName(@Param("schoolId") int schoolId, @Param("departmentName") String departmentName);
    Department selectBySchoolNameAndDepartmentName(@Param("schoolName") String schoolName, @Param("departmentName") String departmentName);

    int insertOne(Department department);
    int insertMany(@Param("list") List<Department> departmentList);
}
