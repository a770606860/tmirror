package com.example.mybatis;
import com.example.domain.Province;
import com.example.domain.School;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by 77060 on 2016/11/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class SchoolMapperTest {

    @Autowired
    SchoolMapper schoolMapper;
    @Test
    public void testInsertMany() throws Exception {
        List<School> list = new ArrayList<>();
        School school1 = new School();
        school1.setName("beijingdaxue");
        school1.setDescp("really good");
        school1.setProvince(Province.北京);
        list.add(school1);
        School school2 = new School();
        school2.setName("qinghuadaxue");
        school2.setDescp("perfect good");
        school2.setProvince(Province.北京);
        list.add(school2);
        schoolMapper.insertMany(list);
        assertThat(school1.getId()).isEqualTo(11);
        assertThat(school2.getId()).isEqualTo(12);

    }
}