package com.example.domain;

/**
 * Created by 77060 on 2016/11/21.
 */
public class InstructorComment extends BasicComment {
    private String course;
    private int instId;

    public String getCourse() {
        return course;
    }

    public InstructorComment setCourse(String course) {
        this.course = course;
        return this;
    }

    public int getInstId() {
        return instId;
    }

    public InstructorComment setInstId(int instId) {
        this.instId = instId;
        return this;
    }
}
