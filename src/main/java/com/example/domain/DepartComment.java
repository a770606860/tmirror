package com.example.domain;

/**
 * Created by 77060 on 2016/11/21.
 */
public class DepartComment extends BasicComment {
    private int school_id;

    public int getSchool_id() {
        return school_id;
    }

    public DepartComment setSchool_id(int school_id) {
        this.school_id = school_id;
        return this;
    }
}
