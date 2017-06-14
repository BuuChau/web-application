package com.ccteam.model.admin;


import com.ccteam.model.admin.field.AdminUsername;

import java.util.Optional;

public interface AdminRepository {
    Optional<Admin> findByUsername(AdminUsername username);
}
