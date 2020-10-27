package com.thejavinhos.authorizer.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Account {

    @GeneratedValue()
    @Column(name = "id")
    @Id
    private int id;

    @Column(name = "active_card")
    private boolean activeCard = true;

    @Column(name = "available_limit")
    private double availableLimit = 100;

//    private String[] violations;
    private ArrayList violations = new ArrayList<>();

    public int getId() {
        return id;
    }

    public boolean isActiveCard() {
        return activeCard;
    }

    public void setActiveCard(boolean activeCard) {
        this.activeCard = activeCard;
    }

    public double getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(double availableLimit) {
        this.availableLimit = availableLimit;
    }

    public ArrayList<String> getViolations() {
        return violations;
    }

    public void setViolations(ArrayList<String> violations) {
        this.violations = violations;
    }
}
