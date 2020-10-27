package com.thejavinhos.authorizer.repository;


import com.thejavinhos.authorizer.entity.CreditCard;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<CreditCard, Integer> {
}
