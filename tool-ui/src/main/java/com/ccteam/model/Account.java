package com.ccteam.model;

import com.ccteam.model.admin.Admin;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by phuoclt on 6/6/17.
 */
public class Account {

    int accountId;
    String username;
    String email;
    String password;
    String role;
    String code;
    boolean status;
    LocalDate startDate;
    LocalDate endDate;

    public Account(){}

    public Account(String role) {
        this.role = role;
    }

    public Account(int accountId, String usermane, String email, String password, String role, String code, boolean status, LocalDate startDate, LocalDate endDate) {

        this.accountId = accountId;
        this.username = usermane;
        this.email = email;
        this.password = password;
        this.role = role;
        this.code = code;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Account(Admin admin) {
        this.accountId = admin.getAdminId().getValue();
        this.username = admin.getAdminUsername().getValue();
        this.email = admin.getAdminEmail().getValue();
        this.role = admin.getAdminRole().getName();
        this.code = admin.getAdminCode().getValue();
        this.status = admin.getAdminStatus().getValue();
        this.startDate = admin.getAdminStartDate().getDate();
        this.endDate = admin.getAdminEndDate().getDate();
    }

    public int getAccountId() {
        return accountId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getCode() {
        return code;
    }

    public boolean isStatus() {
        return status;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getEmail() {
        return email;
    }
}
