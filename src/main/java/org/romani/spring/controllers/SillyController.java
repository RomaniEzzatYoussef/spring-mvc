package org.romani.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

    @RequestMapping("/helloWorldForm")
    public String sillyForm() {
        return "silly-form";
    }
}
