package com.codegym.casestudy04.controller;

import com.codegym.casestudy04.model.Customer;
import com.codegym.casestudy04.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

   @GetMapping ("/customer")
        public String viewCustomer (@RequestParam Optional<String> searchNameCustomer, @PageableDefault(value = 5) Pageable pageable, Model model){
       String check="";
       if (!searchNameCustomer.isPresent()){
            model.addAttribute("customersL",customerService.findAllCustomer(pageable));
        }else{
           check = searchNameCustomer.get();
           model.addAttribute("customersL",customerService.findByNameCustomer(check,pageable));
       }
       model.addAttribute("check",check);
       return "/customer/list";
        }

    @GetMapping("customer/create")
    public ModelAndView createCustomer(Model model){
        return new ModelAndView("customer/create","customers",new Customer());
    }
    @PostMapping("/create")
    public ModelAndView saveCustomer(@ModelAttribute("customers") Customer customer){
        customerService.save(customer);
        return new ModelAndView("customer/create","customers",new Customer());
    }
}
