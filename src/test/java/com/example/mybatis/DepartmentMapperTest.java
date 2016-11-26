package com.example.mybatis;

import com.example.domain.Department;
import com.example.domain.Province;
import com.example.domain.School;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by 77060 on 2016/11/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class DepartmentMapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    SchoolMapper schoolMapper;

    @Test
    public void testSelectDepartmentById() throws Exception {
//        Department department = new Department();
//        department.setName("计算机科学");
//        department.setSchoolId(1);
//        departmentMapper.insertOne(department);
//        Department department1 = departmentMapper.selectDepartmentById(department.getId());
//        assertThat(department.getId()).isEqualTo(department1.getId());
    }

    @Test
    public void testSelectDepartmentListBySchoolId() throws Exception {
//        Department department = new Department();
//        department.setName("计算机科学");
//        department.setSchoolId(1);
//        departmentMapper.insertOne(department);
//        List<Department> list = departmentMapper.selectDepartmentListBySchoolId(1);
//        assertThat(list.get(0).getSchoolId()).isEqualTo(1);
    }

    @Test
    public void testSelectDepartmentListBySchoolName() throws Exception {
//        Department department = new Department();
//        department.setName("计算机科学");
//        department.setSchoolId(1);
//        School school = schoolMapper.selectSchoolById(1);
//        List<Department> list = departmentMapper.selectDepartmentListBySchoolName(school.getName());
//        assertThat(list.get(0).getSchoolId()).isEqualTo(1);
    }

    @Test
    public void testSelectDepartmentBySchoolIdAndDepartmentName() throws Exception {
        School school = new School();
        school.setProvince(Province.湖南);
        school.setName("湖南科技大学");
        schoolMapper.insertOne(school);
        Department department = new Department();
        department.setSchoolId(school.getId());
        department.setName("材料科学");
        departmentMapper.insertOne(department);
        Department department1 = departmentMapper.selectDepartmentBySchoolIdAndDepartmentName(school.getId(), department.getName());
        assertThat(department1.getName()).isEqualToIgnoringCase("材料科学");
    }

    @Test
    public void testSelectDepartmentBySchoolNameAndDepartmentName() throws Exception {
        School school = new School();
        school.setProvince(Province.湖南);
        school.setName("湖南科技大学");
        schoolMapper.insertOne(school);
        Department department = new Department();
        department.setSchoolId(school.getId());
        department.setName("材料科学");
        departmentMapper.insertOne(department);
        Department department1 = departmentMapper.selectDepartmentBySchoolNameAndDepartmentName("湖南科技大学", "材料科学");
        assertThat(department1.getSchoolId()).isEqualTo(school.getId());
    }

    @Test
    public void testInsertOne() throws Exception {
//        Department department = new Department();
//        department.setName("计算机科学");
//        department.setSchoolId(1);
//        int n = departmentMapper.insertOne(department);
//        assertThat(n).isEqualTo(1);
    }
}