package com.codegym.casestudy04.controller;

import com.codegym.casestudy04.service.CustomerService;
import com.codegym.casestudy04.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerTypeController {
    @Autowired
    CustomerTypeService customerTypeService;
    @Autowired
    CustomerService customerService;

}
