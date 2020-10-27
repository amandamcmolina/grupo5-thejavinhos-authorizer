package com.thejavinhos.authorizer.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Account {

    @GeneratedValue()
    @Column(name = "id")
    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "creditCard_id", referencedColumnName = "id")
    private CreditCard creditCard;


    private ArrayList violations = new ArrayList<>();


    public int getId() {
        return id;
    }

    public CreditCard getCard() {
        return creditCard;
    }

    public void setCard(CreditCard card) {
        this.creditCard = card;
    }

    public ArrayList<String> getViolations() {
        return violations;
    }

    public void setViolations(String violations) {
        this.violations.add(violations);
    }
}
