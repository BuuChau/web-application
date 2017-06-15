package com.ccteam.model.admin.gym.field;

import java.io.Serializable;

/**
 * Created by cuongnv on 6/15/17.
 */
public class GymAccountId implements Serializable {

    private int value;

    public int getValue() {
        return value;
    }

    public GymAccountId(int value) {

        this.value = value;
    }

    public GymAccountId() {

    }
}
