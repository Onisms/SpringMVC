package com.galaxy.lesson02.controller;

import com.galaxy.bean.User;
import com.galaxy.bean.UserCollection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController2 {
    @PostMapping(value = "/loginGetSession")
    //将登录的用户存入Session两种方式
    public String register(User user, HttpServletRequest request, HttpSession session){
        System.out.println("注册姓名："+user.getName());
        System.out.println("注册密码："+user.getPwd());
        //将登录的用户存入Session中
//        request.getSession().setAttribute("user",user);
        session.setAttribute("user",user);
       return "success";
    }

    @PostMapping(value = "/register2")
    public String register2(User user){
        System.out.println("注册姓名2："+user.getName());
        System.out.println("注册密码2："+user.getPwd());

        System.out.println("注册部门2："+user.getBir());
        System.out.println("------------------------");
        System.out.println(user);
       return "success";
    }

    @PostMapping("/deleteBatch")
    public String deleteBatch(int[] ids){
        for (int id : ids) {
            System.out.println("删除id="+id+"的数据");
        }

        return "success";
    }

    @PostMapping("/updateBatch")
    public String updateBatch(UserCollection userCollection){
        for (User user:userCollection.getUserList()) {
            System.out.println(user);
        }

        return "success";
    }

}
