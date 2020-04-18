package com.galaxy.service;

import com.galaxy.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountService {

    public List<Account> queryAll();

    public void insert(Account account);

    public void delete(int id);

    public Account queryById(int id);

    public void update(Account account);

    public int queryTotalPages(int pageSize);

    public List<Account> queryAllByPages(int current, int pageSize);

}
