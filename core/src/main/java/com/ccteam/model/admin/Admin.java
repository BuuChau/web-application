package com.ccteam.model.admin;


import com.ccteam.model.admin.field.*;

import javax.validation.Valid;
import java.io.Serializable;

public class Admin implements Serializable{

    /* id of userlogin*/
    AdminId adminId;
    /* user login */
    @Valid
    AdminUsername adminUsername;
    /*rmail register using send/recvice email*/
    @Valid
    AdminEmail adminEmail;
    /* Role of account register in table */
    AdminRole adminRole;
    AdminCode adminCode;
    AdminStatus adminStatus;
    AdminStartDate adminStartDate;
    AdminEndDate adminEndDate;
    @Valid
    AdminPassword adminPassword;

    public Admin() {
    }

    public AdminId getAdminId() {
        return adminId;
    }

    public AdminUsername getAdminUsername() {
        return adminUsername;
    }

    public AdminEmail getAdminEmail() {
        return adminEmail;
    }

    public AdminRole getAdminRole() {
        return adminRole;
    }

    public AdminCode getAdminCode() {
        return adminCode;
    }

    public AdminStatus getAdminStatus() {
        return adminStatus;
    }

    public AdminStartDate getAdminStartDate() {
        return adminStartDate;
    }

    public AdminEndDate getAdminEndDate() {
        return adminEndDate;
    }

    public AdminPassword getAdminPassword() {
        return adminPassword;
    }

    public Admin(AdminId adminId, AdminUsername adminUsername, AdminEmail adminEmail, AdminRole adminRole, AdminCode adminCode, AdminStatus adminStatus, AdminStartDate adminStartDate, AdminEndDate adminEndDate, AdminPassword adminPassword) {

        this.adminId = adminId;
        this.adminUsername = adminUsername;
        this.adminEmail = adminEmail;
        this.adminRole = adminRole;
        this.adminCode = adminCode;
        this.adminStatus = adminStatus;
        this.adminStartDate = adminStartDate;
        this.adminEndDate = adminEndDate;
        this.adminPassword = adminPassword;
    }
}
