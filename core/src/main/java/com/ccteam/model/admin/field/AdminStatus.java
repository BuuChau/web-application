package com.ccteam.model.admin.field;

import java.io.Serializable;

/**
 * Created by cuongnv on 6/13/17.
 */
public class AdminStatus implements Serializable {

    boolean value;

    public boolean getValue() {
        return value;
    }

    public AdminStatus() {

    }

    public AdminStatus(boolean value) {

        this.value = value;
    }
}
