package com.ccteam.model.admin.gym.field;

import java.io.Serializable;

/**
 * Created by cuongnv on 6/15/17.
 */
public class PhoneNumber implements Serializable {

    private String value;

    public String getValue() {
        return value;
    }

    public PhoneNumber(String value) {

        this.value = value;
    }

    public PhoneNumber() {

    }
}
