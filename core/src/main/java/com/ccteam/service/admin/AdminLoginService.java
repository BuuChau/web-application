package com.ccteam.service.admin;

import com.ccteam.model.admin.Admin;
import com.ccteam.model.admin.AdminLoginUser;
import com.ccteam.model.admin.AdminRepository;
import com.ccteam.model.admin.field.AdminUsername;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by Cuongnv on 11/29/16.
 */
@Service("adminLoginService")
public class AdminLoginService implements UserDetailsService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
        return new AdminLoginUser(adminRepository.findByUsername(new AdminUsername(username)).orElseThrow(() -> new AdminNotFoundException()));
    }
}