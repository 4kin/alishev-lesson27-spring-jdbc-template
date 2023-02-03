package ru.alishev.springcourse.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/hi")
    public String sayHi(){
        return "Hi";
    }
}
