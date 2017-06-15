package com.ccteam.web.gym;

import com.ccteam.model.Account;
import com.ccteam.model.admin.field.AdminUsername;
import com.ccteam.model.admin.gym.GymAccount;
import com.ccteam.model.admin.gym.field.*;
import com.ccteam.model.gym.AccountGym;
import com.ccteam.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.time.LocalDate;

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

    @RequestMapping(value = "/ajax/check/finger", method = RequestMethod.GET)
    @ResponseBody
    AccountGym checkFinger(Principal principal, Model model) {
        return new AccountGym(new GymAccount(
                new AccountId(1),
                new GymAccountId(1),
                new FullName("Nguyễn Văn A"),
                new Age("20"),
                new Picture("https://s-media-cache-ak0.pinimg.com/736x/8b/d1/b8/8bd1b8b02e9cb633adb1d789dd4588c6.jpg"),
                new CodeFinger("123"),
                new PhoneNumber("0987654321"),
                new StartDate(null),
                new EndDate(null)
        ));
    }
}
