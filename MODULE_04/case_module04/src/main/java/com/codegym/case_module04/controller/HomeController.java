package com.codegym.case_module04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public  String getHome(){
        return "page/home";
    }
}
