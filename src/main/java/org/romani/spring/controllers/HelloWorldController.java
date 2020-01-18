package org.romani.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controller method to show the initial HTML form
    @RequestMapping("/helloWorldForm")
    public String helloWorldForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "helloworld";
    }

    // new a controller method to read form data and
    // add data to the model
    @RequestMapping("/nameUpperCase")
    public String nameUpperCase(HttpServletRequest request , Model model) {

        // read the request parameter from the HTML form
        String studenyName = request.getParameter("studentName");

        // convert to upper case
        studenyName = studenyName.toUpperCase();

        // create the message
        String result = "Yo! " + studenyName;

        // add message to the model
        model.addAttribute("message" , result);

        return "helloworld";
    }
}
