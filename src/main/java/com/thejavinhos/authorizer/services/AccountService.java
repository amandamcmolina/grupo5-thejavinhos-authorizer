package com.thejavinhos.authorizer.services;

import com.thejavinhos.authorizer.entity.Account;
import com.thejavinhos.authorizer.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        List<Account> accounts = (List<Account>)accountRepository.findAll();
        if(accounts.size() >= 1 ){
            account.setViolations("account-already-initialized");
            return account;
        }else{
            account.setViolations("");
            return accountRepository.save(account);
        }
    }
}
