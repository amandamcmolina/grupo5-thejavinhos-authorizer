package com.thejavinhos.authorizer.controller;

import com.thejavinhos.authorizer.entity.Account;
import com.thejavinhos.authorizer.entity.CreditCard;
import com.thejavinhos.authorizer.services.AccountService;
import com.thejavinhos.authorizer.services.CardService;
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
    private CardService cardService;

    @PostMapping
    public ResponseEntity <String> createAccount(@RequestBody Account account, @RequestBody CreditCard card){
        Account accountDefault = accountService.saveAccount(account);
        CreditCard activeCard =  cardService.saveCard(card);

        return ResponseEntity.ok("{\"account\": {\"active-card\": " +  activeCard.isActiveCard()+ ", \"available-active\": " + activeCard.getAvailableLimit() + "}, \"violations\": [" + accountDefault.getViolations() + "]}");
    }

}
