package com.asd.service;

import com.asd.pojo.Account;

import java.util.List;

public interface AccountService {
    public void save(Account account);
    public List<Account> findAll();
}
