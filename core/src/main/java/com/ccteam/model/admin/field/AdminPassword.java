package com.ccteam.model.admin.field;

import com.ccteam.common.password.Password;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * Created by cuongnv on 6/13/17.
 */
public class AdminPassword implements Serializable {

    @Valid
    Password password;

    public AdminPassword() {
    }

    public AdminPassword(Password password) {
        this.password = password;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
