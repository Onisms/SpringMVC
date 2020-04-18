package com.galaxy.lesson02.controller;

import com.galaxy.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController3 {
   @PostMapping("/loginDateFormate")
    public String loginDateFormate(User user){
       System.out.println("姓名：" + user.getName());
       System.out.println("密码：" + user.getPwd());
       System.out.println("生日：" + user.getBir());
       return "success";
   }

}
