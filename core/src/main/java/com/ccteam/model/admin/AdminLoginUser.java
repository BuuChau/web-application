package com.ccteam.model.admin;

import com.ccteam.common.audit.AuditUser;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class AdminLoginUser extends User implements AuditUser {

    final Admin admin;

    public AdminLoginUser(Admin admin) {
        super(admin.getAdminUsername().getValue(), admin.getAdminPassword().getPassword().getValue(), AuthorityUtils.createAuthorityList(admin.getAdminRole().getName()));
        this.admin = admin;
    }

    public Admin getAdmin() {
        return admin;
    }
    
    @Override
    public String getUpdateUser() {
        return admin.getAdminUsername().getValue();
    }
}
