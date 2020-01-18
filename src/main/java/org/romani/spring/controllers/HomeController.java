package org.romani.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String mainMenu() {
//        ModelAndView modelAndView = new ModelAndView("main-menu");
//        modelAndView.addObject("pageTitle" , "Home Page");
//        modelAndView.addObject("message" , "Hi , Welcome! this HomePage");
        return "main-menu";
    }

//    @RequestMapping(value = "helloWorldForm")
//    public String helloWorldForm() {
//        return "helloworld-form";
//    }
}
