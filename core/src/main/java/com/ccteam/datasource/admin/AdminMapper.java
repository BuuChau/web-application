package com.ccteam.datasource.admin;

import com.ccteam.model.admin.Admin;
import com.ccteam.model.admin.field.AdminUsername;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {

    Admin findByUsername(@Param("adminUsername") AdminUsername username);
}
