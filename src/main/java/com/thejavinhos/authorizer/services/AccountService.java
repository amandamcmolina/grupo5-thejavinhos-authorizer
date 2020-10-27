package com.thejavinhos.authorizer.services;

import com.thejavinhos.authorizer.entity.Account;
import com.thejavinhos.authorizer.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
