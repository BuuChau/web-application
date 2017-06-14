package com.ccteam.model.admin.field;

import java.io.Serializable;

/**
 * Created by cuongnv on 6/13/17.
 */
public class AdminId implements Serializable {

    Integer value;

    public AdminId() {
    }

    public AdminId(Integer value) {

        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
