package com.ccteam.service.admin;

public class AdminNotFoundException extends RuntimeException{
    public AdminNotFoundException() {
        super("Admin user not found.");
    }
}
