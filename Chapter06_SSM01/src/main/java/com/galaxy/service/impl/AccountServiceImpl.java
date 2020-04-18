package com.galaxy.service.impl;

import com.galaxy.dao.AccountDao;
import com.galaxy.entity.Account;
import com.galaxy.entity.Pages;
import com.galaxy.service.AccountService;
import com.github.pagehelper.PageHelper;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public List<Account> queryAll() {
        System.out.println("业务层： queryAll方法执行，查询所有用户");
        return accountDao.queryAll();
    }

    @Override
    public void insert(Account account) {
        System.out.println("业务层： insert方法执行，id查询用户");
        accountDao.insert(account);

    }

    @Override
    public void delete(int id) {
        System.out.println("业务层： delete，删除用户");
        accountDao.delete(id);
    }

    @Override
    public Account queryById(int id) {
        System.out.println("业务层： queryById，修改用户");
        return accountDao.queryById(id);
    }

    @Override
    public void update(Account account) {
        System.out.println("业务层： update，修改用户");
        accountDao.update(account);
    }

    @Override
    public int queryTotalPages(int pageSize) {
        int totalCount = accountDao.queryTotalCount();
        int totalPages = totalCount%pageSize>0?totalCount/pageSize+1:totalCount/pageSize;
        return totalPages;
    }

    @Override
    public List<Account> queryAllByPages(int current, int pageSize) {
        //方法一：使用两个参数：current-当前页；pageSize每页条数
        //int start = (current-1)*pageSize;
        //List<Account> accountList = accountDao.queryAllPages1(start, pageSize);
        //方法二：将start,pageSize封装成对象
//        int start = (current-1)*pageSize;
//        List<Account> accountList = accountDao.queryAllPages2(new Pages(start, pageSize));

        //方法三 ： 使用pageHelper插件
        PageHelper.startPage(current, pageSize);
        List<Account> accountList = accountDao.queryAll();
        return accountList;
    }
}
