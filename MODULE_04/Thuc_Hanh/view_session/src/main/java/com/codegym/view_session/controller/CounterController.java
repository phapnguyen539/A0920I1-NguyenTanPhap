package com.codegym.view_session.controller;

import com.codegym.view_session.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")
public class CounterController {
@ModelAttribute("mycounter")
    public MyCounter setUpCounter(){
    return new MyCounter();
}
@GetMapping
    public String get(@ModelAttribute("mycounter") MyCounter myCounter){
    myCounter.increment();
     return "index";
}
}
