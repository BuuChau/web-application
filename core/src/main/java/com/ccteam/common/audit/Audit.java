package com.ccteam.common.audit;

import org.springframework.security.core.Authentication;

import java.io.Serializable;
import java.security.Principal;

public class Audit implements Serializable {
    public String updateUser;
    public String updateProgram;

    public Audit() {
        this.updateUser = "UNKONWN";
        setUpdateProgram();
    }

    public Audit(Principal principal) {
        Authentication authentication = (Authentication) principal;
        AuditUser auditUser = (AuditUser) authentication.getPrincipal();
        this.updateUser = auditUser.getUpdateUser();
        setUpdateProgram();
    }

    private void setUpdateProgram() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        this.updateProgram = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public String getUpdateProgram() {
        return updateProgram;
    }
}
