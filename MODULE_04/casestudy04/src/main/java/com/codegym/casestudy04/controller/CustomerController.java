package com.codegym.casestudy04.controller;

import com.codegym.casestudy04.model.Customer;
import com.codegym.casestudy04.model.CustomerType;
import com.codegym.casestudy04.service.ContractService;
import com.codegym.casestudy04.service.CustomerService;
import com.codegym.casestudy04.service.CustomerTypeService;
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
@SessionAttributes("customerA")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
    @Autowired
    ContractService contractService;
    @ModelAttribute("customerA")
    public Customer getInFor(){
        return new Customer();
    }

    @GetMapping("/customer")
    public String viewCustomer(@RequestParam Optional<String> searchNameCustomer, @PageableDefault(value = 5) Pageable pageable, Model model) {
        String check = "";
        if (!searchNameCustomer.isPresent()) {
            model.addAttribute("customersL", customerService.findAllCustomer(pageable));
        } else {
            check = searchNameCustomer.get();
            model.addAttribute("customersL", customerService.findByNameCustomer(check, pageable));
        }
        model.addAttribute("check", check);
        return "/customer/list";
    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomer(Model model) {
        return new ModelAndView("customer/create", "customers", new Customer());
    }

    @PostMapping("/customer/create")
    public String  saveCustomer(@Validated @ModelAttribute("customers") Customer customer, BindingResult bindingResult,Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("customers",customer);
             return "customer/create";
        }
        customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView editCustomer(@PathVariable("id") int id){
        Customer customer= customerService.findById(id);
        if(customer!= null){
            return new ModelAndView("/customer/edit","customers",customer);
        }
        return new ModelAndView("/error");
    }
    @PostMapping("/edit-customer")
    public String updateCustomer(@ModelAttribute("customers") Customer customer){
        customerService.save(customer);
        return "redirect:/customer";
    }
        @ModelAttribute("customerTypes")
        public List<CustomerType> typeList() {
            return customerTypeService.findAll();
        }
    @GetMapping("delete-customer/{id}")
    public String deleteCustomer(@PathVariable("id")int id){
        customerService.delete(id);
        return "redirect:/customer";
    }
}

