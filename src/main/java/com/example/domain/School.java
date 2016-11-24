package com.example.domain;

import java.io.Serializable;

/**
 * Created by 77060 on 2016/11/21.
 */
public class School extends BasicInfo implements Serializable {

    private Province province;

    public Province getProvince() {
        return province;
    }

    public School setProvince(Province province) {
        this.province = province;
        return this;
    }
}
