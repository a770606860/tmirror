package com.example.service.persitence;

import com.example.domain.School;
import com.example.mybatis.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 77060 on 2016/11/21.
 */
@Service
public class SchoolServiceImp implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;

    public School selectSchoolById(int id) {
        return schoolMapper.selectById(id);
    }
}
