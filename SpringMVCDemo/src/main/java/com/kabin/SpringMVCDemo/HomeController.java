package com.kabin.SpringMVCDemo;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

    @RequestMapping("/")
    public String home() {

        System.out.println("Home method is called");
        return "index";
    }


    @RequestMapping("add")
    //if want to use different variable name then use @RequestParam("
    public ModelAndView add(@RequestParam("num1") int num1, int num2, ModelAndView mv ){
        //here we are returning data as well as view so using ModelAndView makes more sense

        int result =num1 + num2;

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;


    }



    @RequestMapping("addUser")
    public String addUser(@ModelAttribute User user){


        return "result";

    }


}
