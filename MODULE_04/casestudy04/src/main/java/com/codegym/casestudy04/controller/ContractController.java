package com.codegym.casestudy04.controller;

import com.codegym.casestudy04.model.Contract;
import com.codegym.casestudy04.model.Customer;
import com.codegym.casestudy04.model.CustomerType;
import com.codegym.casestudy04.service.ContractService;
import com.codegym.casestudy04.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    CustomerService customerService;

    @GetMapping("/contract")
    public ModelAndView viewContract(){
        return new ModelAndView("/contract/list","contracts",contractService.findAllContract());
    }

    @GetMapping("/contract/create-contract")
    public ModelAndView createCustomer(Model model) {
        return new ModelAndView("/contract/create", "contracts", new Contract());
    }
    @PostMapping("/contract/create-contract")
    public String  saveCustomer(@ModelAttribute("contracts") Contract contract) {
        contractService.save(contract);
        return "redirect:/contract";
    }
    @ModelAttribute("customers")
    public List<Customer> customerList(){
        return customerService.findAll();
    }
}