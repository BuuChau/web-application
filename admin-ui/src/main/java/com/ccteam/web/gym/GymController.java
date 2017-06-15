package com.ccteam.web.gym;

import com.ccteam.model.Account;
import com.ccteam.model.admin.field.AdminUsername;
import com.ccteam.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

/**
 * Created by phuoclt on 6/15/17.
 */
@Controller
public class GymController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/gym/list-member", method = RequestMethod.GET)
    public String listPeople(Principal principal, Model model) {
        model.addAttribute("title","Gym Home");

        Account account = new Account(adminService.getAccountByLogin(new AdminUsername(principal.getName())));
        model.addAttribute("account", account);
        return "gym/index-list-member";
    }

    @RequestMapping(value = "/gym/register-member", method = RequestMethod.GET)
    public String register(Principal principal, Model model) {
        model.addAttribute("title","Gym Register");

        Account account = new Account(adminService.getAccountByLogin(new AdminUsername(principal.getName())));
        model.addAttribute("account", account);
        return "gym/new-account";
    }
}
