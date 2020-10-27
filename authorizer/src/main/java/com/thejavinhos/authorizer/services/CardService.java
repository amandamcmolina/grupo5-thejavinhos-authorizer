package com.thejavinhos.authorizer.services;

import com.thejavinhos.authorizer.entity.Account;
import com.thejavinhos.authorizer.entity.CreditCard;
import com.thejavinhos.authorizer.repository.AccountRepository;
import com.thejavinhos.authorizer.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public CreditCard saveCard(CreditCard card) {

            return cardRepository.save(card);

    }
}
