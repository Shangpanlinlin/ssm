package com.asd.service;

import com.asd.dao.AccountDao;
import com.asd.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements  AccountService{

    @Autowired
    AccountDao accountDao;

    public void save(Account account){
        System.out.println("service account is saved");

    }
    public List<Account> findAll(){
        System.out.println("service find all account execute");

        return accountDao.findAll();
    }
}
