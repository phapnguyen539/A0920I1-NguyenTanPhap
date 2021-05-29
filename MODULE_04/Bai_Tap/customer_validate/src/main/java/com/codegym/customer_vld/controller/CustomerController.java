package com.codegym.customer_vld.controller;

import com.codegym.customer_vld.model.Customer;
import com.codegym.customer_vld.model.Province;
import com.codegym.customer_vld.service.CustomerService;
import com.codegym.customer_vld.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ProvinceService provinceService;

    @GetMapping

    public ModelAndView viewCustomer(@RequestParam Optional<String> key, @PageableDefault Pageable pageable, Model model){
if (!key.isPresent()){
    return new ModelAndView("/customer/list","customers", customerService.findAllCustomer(pageable));
}else{
    model.addAttribute("key",key.get());
    return new ModelAndView("/customer/list","customers",customerService.findByNameCustomer(key.get(),pageable));
}
    }

    @GetMapping("/create")
    public ModelAndView showCreate(Model model){
        model.addAttribute("provinces",provinceService.findAllProvince());
        return new ModelAndView("/customer/create","customers",new Customer());
    }

    @PostMapping("/create")
    public String saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/";

    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer( @PathVariable (value="id")int id){
        customerService.deleteCustomer(id);
        return "redirect:/";
    }
    @GetMapping("/edit-customer/{id}")
    public ModelAndView editCustomer(@PathVariable(value = "id")int id){
       Customer customer= customerService.findByIdCustomer(id);
       if (customer!=null){
           return new ModelAndView("/customer/edit","customers",customer);
       }
       return new ModelAndView("/errors.404");
    }
    @PostMapping("/edit-customer")
    public String updateCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/";
    }
    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAllProvince();
    }

}
