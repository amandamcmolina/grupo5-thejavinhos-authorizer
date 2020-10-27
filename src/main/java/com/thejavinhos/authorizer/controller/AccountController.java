package com.thejavinhos.authorizer.controller;

import com.thejavinhos.authorizer.entity.Account;
import com.thejavinhos.authorizer.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity <String> createAccount(@RequestBody Account account){
        Account accountDefault = accountService.saveAccount(account);
        return ResponseEntity.ok("{\"account\": {\"active-card\": " + accountDefault.isActiveCard() + ", \"available-active\": " + accountDefault.getAvailableLimit() + "}, \"violations\": [" + accountDefault.getViolations()[0] + "]}");
    }

}
