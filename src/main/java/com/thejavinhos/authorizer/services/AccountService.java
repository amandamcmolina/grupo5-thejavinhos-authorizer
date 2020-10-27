package com.thejavinhos.authorizer.services;

import com.thejavinhos.authorizer.entity.Account;
import com.thejavinhos.authorizer.entity.CreditCard;
import com.thejavinhos.authorizer.repository.AccountRepository;
import com.thejavinhos.authorizer.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    private CardRepository cardRepository;

    public Account saveAccount(Account account) {
        List<Account> accounts = (List<Account>)accountRepository.findAll();

        if(accounts.size() >= 1 ){
            account.setViolations("account-already-initialized");
            return account;
        }else{
            account.setViolations("");
            CreditCard newCard = new CreditCard();
            newCard.setActiveCard(account.getCard().isActiveCard());
            newCard.setAvailableLimit(account.getCard().getAvailableLimit());
            cardRepository.save(newCard);
            account.setCard(newCard);
            return accountRepository.save(account);
        }
    }
}
