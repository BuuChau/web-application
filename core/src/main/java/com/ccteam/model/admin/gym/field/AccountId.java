package com.ccteam.model.admin.gym.field;

import java.io.Serializable;

/**
 * Created by cuongnv on 6/15/17.
 */
public class AccountId implements Serializable {

    private int value;

    public AccountId() {
    }

    public int getValue() {
        return value;
    }

    public AccountId(int value) {

        this.value = value;
    }
}
