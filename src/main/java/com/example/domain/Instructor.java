package com.example.domain;

/**
 * Created by 77060 on 2016/11/21.
 */
public class Instructor extends BasicInfo {
    private Gender gender;
    private int deptId;

    public Gender getGender() {
        return gender;
    }

    public Instructor setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public int getDeptId() {
        return deptId;
    }

    public Instructor setDeptId(int deptId) {
        this.deptId = deptId;
        return this;
    }
}
