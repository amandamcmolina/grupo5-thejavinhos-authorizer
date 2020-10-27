package com.thejavinhos.authorizer.repository;

import com.thejavinhos.authorizer.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
