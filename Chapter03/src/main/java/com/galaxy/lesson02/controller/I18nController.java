package com.galaxy.lesson02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18nController {
    @RequestMapping("index")
    public String index(){
        System.out.println("index");
        return "index";
    }

    @RequestMapping("forward")
    public String forword(){
        System.out.println("forward");
        return "forward:index.jsp";
    }



    @RequestMapping("redirect")
    public String redirect(){
        System.out.println("redirect");
        return "redirect:index.jsp";
    }

    @RequestMapping("list")
    public String list(){
        System.out.println("list");
        return "list";
    }


}
