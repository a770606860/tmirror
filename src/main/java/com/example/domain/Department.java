package com.example.domain;

/**
 * Created by 77060 on 2016/11/21.
 */
public class Department extends BasicInfo {

    private int schoolId;

    public int getSchoolId() {
        return schoolId;
    }

    public Department setSchoolId(int schoolId) {
        this.schoolId = schoolId;
        return this;
    }
}
