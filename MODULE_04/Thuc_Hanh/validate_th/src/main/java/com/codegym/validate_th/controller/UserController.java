package com.codegym.validate_th.controller;

import com.codegym.validate_th.model.User;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/user")
    public ModelAndView showUser() {
        return new ModelAndView("index", "user", new User());
    }

    @PostMapping("/validateUser")
    public ModelAndView checkValidate(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        }
        return new ModelAndView("result");
    }
}
