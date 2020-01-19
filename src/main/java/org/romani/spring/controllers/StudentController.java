package org.romani.spring.controllers;

import org.romani.spring.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showStudentForm")
    public String showStudentForm(Model model) {

        // create a student object
        Student student = new Student();

        // add a student object to model
        model.addAttribute("student" , student);

        return "student-form";
    }

    // wrong getting error
//    @RequestMapping("/processStudentForm")
//    public String processStudentForm(@RequestParam Student student , Model model) {
//        model.addAttribute("student" , student);
//        return "student-details";
//    }

    @RequestMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute Student student) {
        return "student-details";
    }
}
