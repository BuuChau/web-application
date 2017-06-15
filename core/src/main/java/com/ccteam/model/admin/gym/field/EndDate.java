package com.ccteam.model.admin.gym.field;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by cuongnv on 6/15/17.
 */
public class EndDate implements Serializable {

    private LocalDate value;

    public LocalDate getValue() {
        return value;
    }

    public EndDate(LocalDate value) {

        this.value = value;
    }

    public EndDate() {

    }
}
