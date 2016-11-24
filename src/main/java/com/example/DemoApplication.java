package com.example;

import com.example.configuration.DaoConfig;
import com.example.configuration.ServiceConfig;
import com.example.domain.Department;
import com.example.domain.Province;
import com.example.domain.School;
import com.example.mybatis.DepartmentMapper;
import com.example.mybatis.SchoolMapper;
import com.example.service.persitence.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.util.List;

@SpringBootApplication
@Import({DaoConfig.class,
		ServiceConfig.class})
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private SchoolMapper schoolMapper;

	@Autowired
	DepartmentMapper departmentMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		if(schoolMapper != null)
			System.out.println("*************************");
//		School school = schoolService.selectSchoolById(1);
//		School school2 = schoolMapper.selectSchoolById(1);
//		Department department = departmentMapper.selectDepartmentById(1);
//		if(departmentMapper != null)
//		System.out.println(departmentMapper.selectDepartmentById(1).getName() + "$$$$$$$$$$$$$$$$$$$$$$$");
//		System.out.println(departmentMapper.selectDepartmentById(1).getSchoolId() + "$$$$$$$$$$$$$$$$$$$$$$$");
//		List<Department> departmentList = departmentMapper.selectDepartmentsBySchoolId(1);
//		System.out.println(departmentList.get(0).getName());
//		School school = new School();
//		school.setProvince(Province.上海).setName("zhongnan");
//		schoolMapper.insertOne(school);
//		System.out.println(school.getId()+ "::::::::::::::::::::::::::");
//		System.out.println(school.getName()+ "**********************");
//		System.out.println(school2.getDescp() + "#################################");
	}


}
