package com.codegym.customer_manager.controller;

import com.codegym.customer_manager.exception.NotAvailableException;
import com.codegym.customer_manager.model.Customer;
import com.codegym.customer_manager.model.Province;
import com.codegym.customer_manager.service.CustomerService;
import com.codegym.customer_manager.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    ProvinceService provinceService;

    @GetMapping
    public ModelAndView showCustomer(Customer customer){
        return new ModelAndView("customer/create","customers",new Customer());
    }
    @PostMapping
    public ModelAndView saveCustomer(@ModelAttribute("customers") Customer customer) throws NotAvailableException {
        customerService.save(customer);
        ModelAndView modelAndView= new ModelAndView("customer/create");
        modelAndView.addObject("customers",new Customer());
        modelAndView.addObject("message","New customer created successfully");
        return modelAndView;
    }
    @GetMapping("/list")
    public String listCustomer(@RequestParam("key") Optional<String> key,@PageableDefault(size = 5) Pageable pageable,Model model) {
//        if (!key.isPresent()) {
//            Page<Customer> list = customerService.findAll(pageable);
//            ModelAndView modelAndView = new ModelAndView("/customer/list");
//            modelAndView.addObject("customers", list);
//            return modelAndView;
//        }
//        model.addAttribute("key",key.get());
//        return new ModelAndView("/customer/list","customers",
//                customerService.findAllByFirstNameContaining(key.get(),pageable));
        String stringAfterCheck = "";
        if (!key.isPresent()) {
            model.addAttribute("customers", customerService.findAll(pageable));
        } else {
            stringAfterCheck = key.get();
            model.addAttribute("customers", customerService.findAllByFirstNameContaining(stringAfterCheck, pageable));
        }
        model.addAttribute("stringAfterCheck", stringAfterCheck);
        return "/customer/list";
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showForm(@PathVariable("id") int id) throws Exception {
        Customer customer= customerService.findById(id);
        if (customer!=null){
            ModelAndView modelAndView= new ModelAndView("customer/edit");
            modelAndView.addObject("customers",customer);
            return modelAndView;
        }else{
            ModelAndView modelAndView= new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit-customer")
    public ModelAndView updataCustomer(@ModelAttribute("customers") Customer customer) throws NotAvailableException {
        customerService.save(customer);
        ModelAndView modelAndView= new ModelAndView("customer/edit");
        modelAndView.addObject("customers",customer);
        modelAndView.addObject("message","Customer Update successfuly");
        return modelAndView;
    }
    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDelete(@PathVariable("id") int id) throws Exception {
        Customer customer= customerService.findById(id);
        if (customer!= null){
            ModelAndView modelAndView= new ModelAndView("customer/delete");
            modelAndView.addObject("customers",customer);
            return modelAndView;
        }
        ModelAndView modelAndView= new ModelAndView("/Error.404");
        return modelAndView;
    }
    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customers") Customer customer){
        customerService.delete(customer.getId());
        return "redirect:list";
    }
    @ModelAttribute("provinces")
    public List<Province> provinces(){
        return provinceService.findAll();
    }

}
