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
            String[] violation = new String[1];
            violation[0] = "account-already-initialized";
            account.setViolations(violation);
            return account;
        }else{
            String[] violation = new String[1];
            violation[0] = "";
            account.setViolations(violation);
            return accountRepository.save(account);
        }
    }
}
