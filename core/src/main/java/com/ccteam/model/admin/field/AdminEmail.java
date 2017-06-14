package com.ccteam.model.admin.field;

import java.io.Serializable;

/**
 * Created by cuongnv on 6/13/17.
 */
public class AdminEmail  implements Serializable {

    String value;

    public String getValue() {
        return value;
    }

    public AdminEmail() {

    }

    public AdminEmail(String value) {

        this.value = value;
    }
}
