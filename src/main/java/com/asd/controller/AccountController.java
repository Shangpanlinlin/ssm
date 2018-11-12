package com.asd.controller;

import com.asd.pojo.Account;
import com.asd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accountList= accountService.findAll();
        model.addAttribute("list", accountList);
        return "list";
    }
}
