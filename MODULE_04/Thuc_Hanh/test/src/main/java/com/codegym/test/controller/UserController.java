package com.codegym.test.controller;

import com.codegym.test.model.Role;
import com.codegym.test.model.User;
import com.codegym.test.service.RoleService;
import com.codegym.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    @GetMapping("/user")
    public String viewCustomer(@RequestParam Optional<String> searchNameUser, @PageableDefault(value = 5) Pageable pageable, Model model) {
        String check = "";
        if (!searchNameUser.isPresent()) {
            model.addAttribute("users", userService.findAllUser(pageable));
        } else {
            check = searchNameUser.get();
            model.addAttribute("users", userService.findAllByNameUser(check, pageable));
        }
        model.addAttribute("check", check);
        return "/user/list";
    }
    @GetMapping("/user/create")
    public ModelAndView createCustomer(Model model) {
        return new ModelAndView("/user/create", "users", new User());
    }

    @PostMapping("/user/create")
    public String  saveUser(@Validated @ModelAttribute("users") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("users", user);
            return "/user/create";
        }
        userService.save(user);
        return "redirect:/user";
    }
    @ModelAttribute("roles")
    public List<Role> typeList() {
        return roleService.findAll();
    }
    @GetMapping("/edit-user/{id}")
    public ModelAndView eidtUser(@PathVariable("id") int id){
        User user= userService.findById(id);
        if(user!= null){
            return new ModelAndView("/user/edit","users",user);
        }
        return new ModelAndView("/error");
    }
    @PostMapping("/edit-user")
    public String  updateUser(@Validated @ModelAttribute("users") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("users", user);
            return "/user/edit";
        }
        userService.save(user);
        return "redirect:/user";
    }
    @GetMapping("/delete-user/{id}")
    public ModelAndView showDelete(@PathVariable("id") int id) {
        User user= userService.findById(id);
        if (user!= null){
            ModelAndView modelAndView= new ModelAndView("user/delete");
            modelAndView.addObject("users",user);
            return modelAndView;
        }
        ModelAndView modelAndView= new ModelAndView("/Error");
        return modelAndView;
    }
    @PostMapping("/delete-user")
    public String deleteCustomer(@ModelAttribute("users") User user) {
        userService.delete(user.getId());
        return "redirect:/user";
    }
}
