package com.thejavinhos.authorizer.services;

import com.thejavinhos.authorizer.entity.Account;
import com.thejavinhos.authorizer.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

   public Account saveAccount(Account account) {
        List<Account> accounts = (List<Account>)accountRepository.findAll();
        List<String> violations =  new ArrayList<>();
        if(accounts.size() >= 1 ){
            violations.add("account-already-initialized");
            account.setViolations((ArrayList<String>) violations);
            return account;
        }else{
            violations.add("");
            account.setViolations((ArrayList<String>) violations);
            return accountRepository.save(account);
        }
    }
}
