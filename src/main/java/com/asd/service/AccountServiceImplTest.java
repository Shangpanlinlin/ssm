package com.asd.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AccountServiceImplTest {


    @Test
    public void testSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = ac.getBean(AccountService.class);
        as.findAll();
    }
}
