package com.hibernate.practice.controller;

import com.hibernate.practice.entities.Account;
import com.hibernate.practice.services.AccountService;
import com.hibernate.practice.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService service;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "/account/register";
    }

    @PostMapping("/register")
    public String registerUser(
        @RequestParam String username,
        @RequestParam String email,
        @RequestParam String password,
        Model map,
        HttpSession session
    ) {
        Account account = new Account(username, email, password);

        if (service.register(account)) {
            return "redirect:/account/login";
        } else {
            return "redirect:/account/register";
        }
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "/account/login";
    }

    @PostMapping("/login")
    public String loginUser(
        @RequestParam String username,
        @RequestParam String password,
        Model map,
        HttpSession session
    ) {
        Account account = new Account(username, password);
        Account user = service.login(account);
        if (user.isLoggedIn()) {
            return "redirect:/account/welcome";
        } else {
            return "redirect:/account/login";
        }
    }

    @GetMapping("/forgot")
    public String showForgotPage() {
        return "/account/forgot";
    }

    @PostMapping("/forgot")
    public String recoverPassword(
        @RequestParam String username,
        @RequestParam String password,
        Model map,
        HttpSession session
    ) {
        Account account = new Account(username, password);

        if (service.forgotPassword(account)) {
            return "redirect:/account/welcome";
        } else {
            return "redirect:/account/login";
        }
    }

    @GetMapping("/welcome")
    public String showWelcomePage() {
        return "/account/welcome";
    }
}
