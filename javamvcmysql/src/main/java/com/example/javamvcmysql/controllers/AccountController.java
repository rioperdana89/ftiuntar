/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.javamvcmysql.controllers;

import com.example.javamvcmysql.models.Account;
import com.example.javamvcmysql.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author novar
 */
@Controller
public class AccountController {
    
    @Autowired
    AccountRepository accRep;
    
    @RequestMapping("/account")
    public String account(Model model) {
        model.addAttribute("account", accRep.findAll());
        return "account";
    }
    
    @RequestMapping("/create")
    public String create(Model model){
        return "create";
    }
    
    @RequestMapping("/save")
    public String save(@RequestParam int AccountNumber, @RequestParam String AccountName, 
            @RequestParam double AccountBalance) {
        Account account = new Account();
        account.setAccountName(AccountName);
        account.setAccountNumber(AccountNumber);
        account.setAccountBalance(AccountBalance);
        accRep.save(account);
        
        return "redirect:/show/" + account.getAccountID();
    }
    
    @RequestMapping("/show/{id}")
    public String show(@PathVariable Integer id, Model model){
        model.addAttribute("account", accRep.findById(id).orElse(null));
        return "show";
    }
}
