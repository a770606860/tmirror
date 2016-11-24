package com.example.domain;

/**
 * Created by 77060 on 2016/11/21.
 */
public class SchoolComment extends BasicComment {
    private int schoolId;

        public int getSchoolId() {
            return schoolId;
        }

        public SchoolComment setSchoolId(int schoolId) {
            this.schoolId = schoolId;
            return this;
        }
}
