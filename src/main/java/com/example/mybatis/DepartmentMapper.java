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
    public Department selectDepartmentById(@Param("id") int id);
    public List<Department> selectDepartmentsBySchoolId(@Param("schoolId") int schoolId);
}
