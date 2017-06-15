package com.ccteam.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

/**
 * Created by cuongnv on 6/13/17.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/finger/auth", method = RequestMethod.GET)
    public String form(Principal principal) {
        if (principal != null && !principal.getName().equals(""))
            return "redirect:/home";
        return "/auth/login";
    }
}
