package com.ccteam.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public enum Role implements Serializable {
    Administrator("Administrator"),
    Staff("Staff"),
    Customer("Customer");

    String label;

    Role(String label) {
        this.label = label;
    }

    public String getName() {
        return this.name();
    }

    public String getLabel() {
        return label;
    }

    public static List<Role> listRoles() {
        return Arrays.asList(Role.values());
    }
}
