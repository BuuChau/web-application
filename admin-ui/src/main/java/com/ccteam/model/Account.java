package com.ccteam.model;

import java.util.Date;

/**
 * Created by phuoclt on 6/6/17.
 */
public class Account {

    int accountId;
    String username;
    String password;
    String role;
    String code;
    boolean status;
    Date startDate;
    Date endDate;

    public Account(){}

    public Account(String role) {
        this.role = role;
    }

    public Account(int accountId, String usermane, String password, String role, String code, boolean status, Date startDate, Date endDate) {

        this.accountId = accountId;
        this.username = usermane;
        this.password = password;
        this.role = role;
        this.code = code;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
