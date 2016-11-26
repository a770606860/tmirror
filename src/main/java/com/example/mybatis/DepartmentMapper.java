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
    Department selectDepartmentById(@Param("id") int id);
    List<Department> selectDepartmentListBySchoolId(@Param("schoolId") int schoolId);
    List<Department> selectDepartmentListBySchoolName(String schoolName);
    Department selectDepartmentBySchoolIdAndDepartmentName(@Param("schoolId") int schoolId, @Param("departmentName") String departmentName);
    Department selectDepartmentBySchoolNameAndDepartmentName(@Param("schoolName") String schoolName, @Param("departmentName") String departmentName);

    int insertOne(Department department);
}
