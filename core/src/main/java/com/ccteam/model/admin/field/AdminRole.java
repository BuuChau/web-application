package com.ccteam.model.admin.field;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;


public enum AdminRole implements Serializable {
    Administrator("Administrator"),
    Staff("Staff"),
    Customer("Customer");

    String label;

    AdminRole(String label) {
        this.label = label;
    }

    public String getName() {
        return this.name();
    }

    public String getLabel() {
        return label;
    }

    public static List<AdminRole> listRoles() {
        return Arrays.asList(AdminRole.values());
    }
}