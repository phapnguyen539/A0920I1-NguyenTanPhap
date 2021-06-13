package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public ModelAndView viewCustomer(@RequestParam Optional<String> key_search, @PageableDefault Pageable pageable, Model model) {
        if (!key_search.isPresent()) {
            return new ModelAndView("customer/index", "customers", customerService.findAll(pageable));
        } else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("customer/index", "customers", customerService.findByNameCustomer(key_search.get(), pageable));
        }
    }
    @GetMapping("/create")
    public ModelAndView viewCreate(Model model,Pageable pageable){
        model.addAttribute("customer/create",customerService.findAll(pageable));
        return new ModelAndView("customer/create","customers",new Customer());
    }
    @PostMapping("/create")
    public String saveCreate(Customer customer){
        customerService.save(customer);
        return "redirect:/";

    }


}
