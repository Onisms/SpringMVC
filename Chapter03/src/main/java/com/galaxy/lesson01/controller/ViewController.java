package com.galaxy.lesson01.controller;

import com.galaxy.bean.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes("emp")
public class ViewController {
















    @PostMapping(value = "/loginGetSession")
    //将登录的用户存入Session两种方式
    public String register(Emp emp){
        System.out.println("注册姓名："+emp.getName());
        //将登录的用户存入Session中
        return "success";
    }


//原有的方式
    /*@PostMapping(value = "/loginGetSession")
    //将登录的用户存入Session两种方式
    public String register(Emp emp, HttpServletRequest request, HttpSession session){
        System.out.println("注册姓名："+emp.getName());
        //将登录的用户存入Session中
        request.getSession().setAttribute("emp1",emp);
        session.setAttribute("emp2",emp);
        return "success";
    }*/






    @GetMapping("modelMap")
    public String modelMap(Map<String, Emp> map, Model model){
        Emp stu1 = new Emp(1,"裴殿宇22");
        Emp stu2 = new Emp(2, "李建222");
        Emp stu3 = new Emp(3, "小雷333");

        map.put("stu1",stu1);
        map.put("stu2",stu2);
        map.put("stu3",stu3);

        ArrayList<Emp> stuList = new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        model.addAttribute("stuList",stuList);

        return "pojo";



    }

    @GetMapping("modelAndView")
    public ModelAndView modelAndView(){
        System.out.println("modelAndView........");
        ModelAndView vm = new ModelAndView();
        vm.addObject("msg","modelAndView........");
        HashMap<String, String> map = new HashMap<>();
        map.put("stu1","裴殿宇");
        map.put("stu2","李建");
        map.put("stu3","小雷");
        vm.addAllObjects(map);


        ArrayList<String> stuList = new ArrayList<>();
        stuList.add("小雷");
        stuList.add("小裴");
        stuList.add("小建");
        vm.addObject("stuList",stuList);

        //设置视图
        vm.setViewName("string");

        return vm;

    }

    @GetMapping("modelAndView2")
    public ModelAndView modelAndView2(){
        ModelAndView vm = new ModelAndView();
        vm.addObject("msg","modelAndView........");
        HashMap<String, Emp> map = new HashMap<>();
        Emp stu1 = new Emp(1,"裴殿宇");
        Emp stu2 = new Emp(2, "李建");
        Emp stu3 = new Emp(3, "小雷");
        map.put("stu1",stu1);
        map.put("stu2",stu2);
        map.put("stu3",stu3);
        vm.addAllObjects(map);


        ArrayList<Emp> stuList = new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        vm.addObject("stuList",stuList);

        //设置视图
        vm.setViewName("pojo");

        return vm;


    }
}
