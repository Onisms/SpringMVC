package com.galaxy.lesson01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
   /* @PostMapping(value = "/login")
    public String login(String name, String pwd){
        System.out.println(name);
        System.out.println(pwd);

        if ("admin".equals(name) && "admin".equals(pwd)){
            return "success";
        }else{
        return "file";
        }
    }*/
    @PostMapping(value = "/login")
    public String login(@RequestHeader(value = "username" ,defaultValue = "111") String username, @RequestHeader(value = "pwd") String password) {
        System.out.println(username);
        System.out.println(password);

        if ("admin".equals(username) && "admin".equals(password)) {
            return "success";
        } else {
            return "file";
        }
    }

    @GetMapping("/getHeader")
    public String getHeader(@RequestHeader("Accept") String accept, @RequestHeader("user-Agent") String userAgent){
            System.out.println(accept);
            System.out.println(userAgent);
        return "success";
    }
}
