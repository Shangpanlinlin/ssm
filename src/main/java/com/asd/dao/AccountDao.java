package com.asd.dao;


import com.asd.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountDao {

    @Insert("insert into account (name, money) values (#{name}, #{money})")
    void save(Account account);

    @Select("select * from account")
    List<Account> findAll();

}
