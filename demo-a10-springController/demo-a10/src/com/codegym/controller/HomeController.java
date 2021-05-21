package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController //dùng cho webservice
@RequestMapping("/admin/api")
public class HomeController {

    //Handle Method
    @GetMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("text", "Hello cac ban");
        return "index";
    }

    @PostMapping("/login")
    public String checkLogin(Model model, @RequestParam String username){
        model.addAttribute("username", username);
        return "result";
    }
}
