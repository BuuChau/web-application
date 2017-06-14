package com.ccteam.web;

import com.ccteam.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "redirect:/gym/home";
    }


    @RequestMapping(value = "/gym/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("title","Gym Home");
        model.addAttribute("account",new Account("Administrator"));
        return "home";
    }
}
