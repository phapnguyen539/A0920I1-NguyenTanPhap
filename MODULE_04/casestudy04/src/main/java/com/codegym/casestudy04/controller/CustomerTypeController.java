package com.codegym.casestudy04.controller;

import com.codegym.casestudy04.model.Customer;
import com.codegym.casestudy04.model.CustomerType;
import com.codegym.casestudy04.service.CustomerService;
import com.codegym.casestudy04.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerTypeController {
    @Autowired
    CustomerTypeService customerTypeService;
    @Autowired
    CustomerService customerService;

    @GetMapping("/customerType")
    public ModelAndView listType(){
        List<CustomerType> customerTypes= customerTypeService.findAll();
        return new ModelAndView("/customerType/list","customerTypes", customerTypes);
    }
    @GetMapping("/create-type")
    public ModelAndView createType(){
        return new ModelAndView("/customerType/create","customerTypes",new CustomerType());
    }
    @PostMapping("/create-type")
    public String saveType(@ModelAttribute("customerTypes") CustomerType customerType){
        customerTypeService.save(customerType);
        return "/redirect:/customerType";
    }
}
