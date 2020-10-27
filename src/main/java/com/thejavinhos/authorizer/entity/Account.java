package com.thejavinhos.authorizer.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {

    @GeneratedValue()
    @Column(name = "id")
    @Id
    private int id;

    
    @Column(name = "active_card")
    private boolean activeCard;

    @Column(name = "available_limit")
    private double availableLimit;

    @Column(name = "violations")
    private ArrayList<String> violations = new ArrayList<>();

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

    public List<String> getViolations() {
        return violations;
    }

    public void setViolations(String violations) {
        this.violations.add(violations);
    }

}
