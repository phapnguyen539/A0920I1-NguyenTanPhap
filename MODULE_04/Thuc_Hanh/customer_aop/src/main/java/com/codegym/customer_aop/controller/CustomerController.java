package com.codegym.customer_aop.controller;

import com.codegym.customer_aop.model.Customer;
import com.codegym.customer_aop.model.Province;
import com.codegym.customer_aop.service.CustomerService;
import com.codegym.customer_aop.service.ProvinceService;
import jdk.nashorn.internal.runtime.options.Option;
import org.apache.catalina.User;
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
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    ProvinceService provinceService;

    @GetMapping
    public ModelAndView viewCustomer(@RequestParam Optional<String> key_search, @PageableDefault Pageable pageable, Model model) {
        if (!key_search.isPresent()) {
            return new ModelAndView("index", "customers", customerService.findAll(pageable));
        } else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("index", "customers", customerService.findByNameCustomer(key_search.get(), pageable));

        }
    }

    @GetMapping("/create")
    public ModelAndView viewCreate(Model model, Pageable pageable) {
        model.addAttribute("provinces", provinceService.findAllProvince(pageable));
        return new ModelAndView("create", "customers", new Customer());
    }

    @PostMapping("/create")
    public String saveCreate(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        customerService.save(customer);
        return "result";
    }
//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable(value = "id")int id){
//      customerService.delete(id);
//        return "redirect:/";
//    }
//    @GetMapping("/edit/{id}")
//    public ModelAndView editUser(@PathVariable(value = "id") int id){
//        return new ModelAndView("edit","customers",customerService.findById(id));
//    }
//    @PostMapping("/update")
//    public String updateUser(Customer customer){
//       customerService.save(customer);
//        return "redirect:/";
}


