package com.codegym.thi_module04.controller;

import com.codegym.thi_module04.model.Product;
import com.codegym.thi_module04.model.ProductType;
import com.codegym.thi_module04.service.ProductService;
import com.codegym.thi_module04.service.ProductTypeService;
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
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    ProductTypeService productTypeService;

    @GetMapping("/product")
    public String viewProduct(@RequestParam Optional<String> searchNameProduct, @PageableDefault(value = 5) Pageable pageable, Model model) {
        String check = "";
        if (!searchNameProduct.isPresent()) {
            model.addAttribute("products", productService.findAll(pageable));
        } else {
            check = searchNameProduct.get();
            model.addAttribute("products", productService.findByNameProduct(check, pageable));
        }
        model.addAttribute("check", check);
        return "/product/list";
    }
    
    @ModelAttribute("productTypes")
    public List<ProductType> typeList() {
        return productTypeService.findAll();
    }
    @GetMapping("/product/create")
    public ModelAndView createCustomer(Model model) {
        return new ModelAndView("/product/create", "products", new Product());
    }

    @PostMapping("/product/create")
    public String  saveUser(@Validated @ModelAttribute("products") Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("products", product);
            return "/product/create";
        }
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/delete-product/{id}")
    public ModelAndView showDelete(@PathVariable("id") int id) {
        Product product= productService.findById(id);
        if (product!= null){
            ModelAndView modelAndView= new ModelAndView("product/delete");
            modelAndView.addObject("products",product);
            return modelAndView;
        }
        ModelAndView modelAndView= new ModelAndView("/Error");
        return modelAndView;
    }
    @PostMapping("/delete-product")
    public String deleteCustomer(@ModelAttribute("products") Product product) {
        productService.delete(product.getId());
        return "redirect:/product";
    }

    @GetMapping("/edit-product/{id}")
    public ModelAndView eidtUser(@PathVariable("id") int id){
        Product product= productService.findById(id);
        if(product!= null){
            return new ModelAndView("/product/edit","products",product);
        }
        return new ModelAndView("/error");
    }
    @PostMapping("/edit-product")
    public String  updateUser(@Validated @ModelAttribute("products") Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("products", product);
            return "/product/edit";
        }
        productService.save(product);
        return "redirect:/product";
    }

}
