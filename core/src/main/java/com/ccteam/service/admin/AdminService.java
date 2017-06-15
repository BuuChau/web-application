package com.ccteam.service.admin;

import com.ccteam.model.admin.Admin;
import com.ccteam.model.admin.AdminRepository;
import com.ccteam.model.admin.field.AdminUsername;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = RuntimeException.class)
@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Admin getAccountByLogin(AdminUsername username){
        return adminRepository.findByUsername(username).get();
    }
}
