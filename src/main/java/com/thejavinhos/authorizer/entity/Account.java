package com.thejavinhos.authorizer.entity;

import javax.persistence.*;

@Entity
public class Account {

    @GeneratedValue()
    @Column(name = "id")
    @Id
    private int id;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "active_card")
    private boolean activeCard;

    @Column(name = "available_limit")
    private double availableLimit;

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

}
