package com.galaxy.web.controller;

import com.galaxy.entity.Account;
import com.galaxy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("account")
@PropertySource("classpath:db.properties")
public class AccountController {

    @Resource
    private AccountService accountService;

    //int pageSize = 5;
    @Value("${mybatis.pageSize}")
    int pageSize;

    @RequestMapping("queryAllByPages")
    public String queryAll(Model model, int current) {
        List<Account> accountList = accountService.queryAllByPages(current, pageSize);
        int totalPages = accountService.queryTotalPages(pageSize);
        model.addAttribute("accountList", accountList);
        model.addAttribute("current", current);
        model.addAttribute("totalPages", totalPages);
        return "list";
    }
    @RequestMapping("queryAll")
    public String queryAll(Model model){
        System.out.println("显示层： queryAll方法执行，查询所有用户。。。");
        List<Account> accountList = accountService.queryAll();
        model.addAttribute("accountList",accountList);
        return "list";
    }

    @GetMapping("insertPage")
    public String insertPage() {
        return "insert";
    }
    //添加
    @PostMapping("insert")
    public String insert(Account account) {
        accountService.insert(account);
        return "redirect:queryAllByPages?current=1";
    }

    //删除
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") int id) {
        accountService.delete(id);
        return "redirect:../queryAllByPages?current=1";
    }

    @GetMapping("queryById")
    public String queryById(int id, Model model) {
        Account account = accountService.queryById(id);
        model.addAttribute("account", account);
        return "update";
    }

    @PostMapping("update")
    public String update(Account account) {
        accountService.update(account);
        return "redirect:queryAllByPages?current=1";

    }


}
