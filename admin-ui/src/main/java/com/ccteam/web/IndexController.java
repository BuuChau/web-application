package com.ccteam.web;

import com.ccteam.model.Account;
import com.ccteam.model.admin.field.AdminUsername;
import com.ccteam.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class IndexController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "redirect:/home";
    }


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Principal principal, Model model) {
        model.addAttribute("title","Gym Home");

        Account account = new Account(adminService.getAccountByLogin(new AdminUsername(principal.getName())));
        model.addAttribute("account",account);
        return "home";
    }
}
