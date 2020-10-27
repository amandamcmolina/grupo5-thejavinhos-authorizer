package com.thejavinhos.authorizer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Account {


    @GeneratedValue
    @column(name = "id")
    @id
    private int id;


    private String cpf;
    private boolean activeCard;
    private double availableLimit;




}
