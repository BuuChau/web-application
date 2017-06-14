package com.ccteam.datasource.admin;

import com.ccteam.model.admin.Admin;
import com.ccteam.model.admin.AdminRepository;
import com.ccteam.model.admin.field.AdminUsername;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AdminDatasource implements AdminRepository {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Optional<Admin> findByUsername(AdminUsername username) {
        return Optional.ofNullable(adminMapper.findByUsername(username));
    }
}
