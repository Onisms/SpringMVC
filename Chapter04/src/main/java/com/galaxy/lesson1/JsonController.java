package com.galaxy.lesson1;

import com.galaxy.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class JsonController {

    @ResponseBody
    @GetMapping("getJsonString")
    public String getJsonString(){
        System.out.println("getJsonString.......");
    return "getJsonString";
    }


    @ResponseBody
    @GetMapping("/getJsonList")
    public List<String> getJsonList(){
        System.out.println("getJsonList.......");

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("小雷");
        stringList.add("小李");
        stringList.add("小裴");
        stringList.add("小闫");
        stringList.add("小建");
        stringList.add("小郭");

        return stringList;
    }
    @ResponseBody
    @GetMapping("/getJsonList2")
    public List<Student> getJsonList2(){
        System.out.println("getJsonList2.......");

        ArrayList<Student> stringList = new ArrayList<>();
        stringList.add(new Student(001,"小雷","未签到！"));
        stringList.add(new Student(002,"小李","未签到！"));
        stringList.add(new Student(003,"小裴","未签到！"));
        stringList.add(new Student(004,"小闫","未签到！"));
        stringList.add(new Student(005,"小建","未签到！"));
        stringList.add(new Student(006,"小郭","未签到！"));

        return stringList;
    }

    @ResponseBody
    @GetMapping("getJsonMap")
    public Map<String, Object> getJsonMap(){
        System.out.println("getJsonMap.......");

        //模拟分页
        HashMap<String, Object> studentMap = new HashMap<>();
        ArrayList<Student> studentList = new ArrayList<>();
        studentMap.put("stu1",new Student(001,"小雷","未签到！"));
        studentMap.put("stu2",new Student(002,"小李","未签到！"));
        studentMap.put("stu3",new Student(003,"小裴","未签到！"));
        studentMap.put("stu4",new Student(004,"小闫","未签到！"));
        studentMap.put("stu5",new Student(005,"小建","未签到！"));

        studentMap.put("studentList", studentList);
        studentMap.put("current", 2);
        studentMap.put("totalToal", 20);
        return studentMap;
    }
}
