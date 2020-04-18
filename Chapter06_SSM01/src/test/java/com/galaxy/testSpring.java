package com.galaxy;

import com.galaxy.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
    public void testSpring(){

        //加载Spring核心配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //获取Spring对象
        AccountService accountService = (AccountService) context.getBean("accountService");
        //调用方法
        accountService.queryAll();


    }
}
