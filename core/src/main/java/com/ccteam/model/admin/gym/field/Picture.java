package com.ccteam.model.admin.gym.field;

import java.io.Serializable;

/**
 * Created by cuongnv on 6/15/17.
 */
public class Picture implements Serializable {

    String value;

    public String getValue() {
        return value;
    }

    public Picture(String value) {

        this.value = value;
    }

    public Picture() {

    }
}
