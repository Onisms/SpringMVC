package com.galaxy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("testInterceptor")
    public String testInterceptor(Model model){
        System.out.println("2: testInterceptor方法被执行");
        model.addAttribute("msg","跳转到success.jsp页面。。。。");

        return "success";

    }

}
