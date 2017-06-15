package com.ccteam.model.admin.gym.field;

import java.io.Serializable;

/**
 * Created by cuongnv on 6/15/17.
 */
public class FullName implements Serializable {

    private String value;

    public String getValue() {
        return value;
    }

    public FullName(String value) {

        this.value = value;
    }

    public FullName() {

    }
}
