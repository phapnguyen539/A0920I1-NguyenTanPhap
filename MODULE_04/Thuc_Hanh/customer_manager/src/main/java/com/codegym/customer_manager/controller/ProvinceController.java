package com.codegym.customer_manager.controller;

import com.codegym.customer_manager.model.Customer;
import com.codegym.customer_manager.model.Province;
import com.codegym.customer_manager.service.CustomerService;
import com.codegym.customer_manager.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;
    @Autowired
    CustomerService customerService;

    @GetMapping("/province")
    public ModelAndView listProvince(){
        List<Province> list= provinceService.findAll();
        ModelAndView modelAndView= new ModelAndView("/province/list");
        modelAndView.addObject("provinces",list);
        return modelAndView;
    }
    @GetMapping("/create-province")
    public ModelAndView viewProvicne(){
        ModelAndView modelAndView= new ModelAndView("/province/create");
        modelAndView.addObject("provinces",new Province());

        return modelAndView;
    }
    @PostMapping("create-province")
    public ModelAndView createProvince(@ModelAttribute("provinces") Province province){
        provinceService.save(province);
        ModelAndView modelAndView= new ModelAndView("/province/create");
        modelAndView.addObject("province",new Province());
        modelAndView.addObject("message","New Province created successfuly");
        return modelAndView;
    }

    @GetMapping("/edit-province/{id}")
    public ModelAndView viewEdit(@PathVariable("id") int id){
        Province province= provinceService.findById(id);
        if (province!= null){
            ModelAndView modelAndView=new ModelAndView("province/edit");
            modelAndView.addObject("provinces",province);
            return modelAndView;
        }
        ModelAndView modelAndView= new ModelAndView("/Error.404");
        return modelAndView;
    }
    @PostMapping("/edit-province")
    public ModelAndView editProvince(@ModelAttribute("provinces") Province province){
        provinceService.save(province);
        ModelAndView modelAndView= new ModelAndView("/province/edit");
        modelAndView.addObject("provinces", province);
        modelAndView.addObject("message","Update province successfuly");
        return modelAndView;
    }
    @GetMapping("/delete-province/{id}")
    public ModelAndView viewDelete(@PathVariable int id){
        Province province= provinceService.findById(id);
        ModelAndView modelAndView= new ModelAndView("/province/delete");
        modelAndView.addObject("provinces",province);
        return modelAndView;
    }
    @PostMapping("/delete-province")
    public String deleteProvince (@ModelAttribute("provinces")Province province){
        provinceService.delete(province.getId());
        return "redirect:province";
    }

    @GetMapping("/view-province/{id}")
    public ModelAndView showProvince(@PathVariable int id, Province province){
        ModelAndView modelAndView= new ModelAndView("province/view");
        modelAndView.addObject("provinces",provinceService.findById(id));
        modelAndView.addObject("customers",customerService.findAllByProvince(province));
        return modelAndView;
    }
}
