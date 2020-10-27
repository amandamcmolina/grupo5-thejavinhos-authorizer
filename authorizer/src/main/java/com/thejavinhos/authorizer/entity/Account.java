package com.thejavinhos.authorizer.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Account {

    @GeneratedValue()
    @Column(name = "id")
    @Id
    private int id;

    @Column(name = "card")
   private CreditCard card;


//    private String[] violations;
    private ArrayList violations = new ArrayList<>();

    public int getId() {
        return id;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public ArrayList<String> getViolations() {
        return violations;
    }

    public void setViolations(String violations) {
        this.violations.add(violations);
    }
}
