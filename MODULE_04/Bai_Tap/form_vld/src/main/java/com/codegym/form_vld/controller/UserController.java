package com.codegym.form_vld.controller;

import com.codegym.form_vld.model.User;
import com.codegym.form_vld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")

    public ModelAndView viewUser(@RequestParam Optional<String> key_search, @PageableDefault Pageable pageable, Model model) {
        if (!key_search.isPresent()) {
            return new ModelAndView("index", "users", userService.findAll(pageable));
        } else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("index", "users", userService.findByLastNameUser(key_search.get(), pageable));
        }
    }

    @GetMapping("/create")
    public ModelAndView viewCreate() {
        return new ModelAndView("create","users",new User());
    }
    @PostMapping("/create")
    public String saveCreate(@Valid @ModelAttribute("users") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
             return "create";
        }
        userService.saveUser(user);
        return "result";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable (value = "id")int id){
        userService.deleteUser(id);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public ModelAndView editUser(@PathVariable(value = "id") int id){
        return new ModelAndView("edit","users",userService.findByIdUser(id));
    }
    @PostMapping("/update")
    public String updateUser(User user){
        userService.saveUser(user);
        return "redirect:/";
    }
}
