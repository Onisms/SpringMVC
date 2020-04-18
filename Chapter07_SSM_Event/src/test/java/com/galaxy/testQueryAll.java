package com.galaxy;

import com.galaxy.entity.TestBean;
import com.galaxy.service.TestBeanService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testQueryAll {

    @Test
    public void query(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestBeanService testBeanService = (TestBeanService) context.getBean("testBeanService");
        TestBean testBean = testBeanService.queryById(4);
        System.out.println(testBean);
    }
    @Test
    public void insert(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestBeanService testBeanService = (TestBeanService) context.getBean("testBeanService");
        TestBean testBean = new TestBean();
        testBean.setName("小阿磊");
        testBean.setName("12344");
        System.out.println("success");
        testBeanService.insert(testBean);
    }
    @Test
    public void delete(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestBeanService testBeanService = (TestBeanService) context.getBean("testBeanService");
        testBeanService.delete(4);
        System.out.println("success");
    }
    @Test
    public void queryById(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestBeanService testBeanService = (TestBeanService) context.getBean("testBeanService");
        TestBean testBean = testBeanService.queryById(6);
        System.out.println(testBean);
    }


}
