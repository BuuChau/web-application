package com.ccteam.model.admin.field;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by cuongnv on 6/13/17.
 */
public class AdminStartDate implements Serializable {

    LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public AdminStartDate() {
    }

    public AdminStartDate(LocalDate date) {

        this.date = date;
    }
}
