package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;
import java.util.List;

@Controller
@SessionAttributes("carts")
public class ProductController {
    @Autowired
    ProductService productService;
    @ModelAttribute("carts")
    public HashMap<Integer, Cart> ShowInfor(){
return new HashMap<>();
    }
    @GetMapping("/list")
    public String gethome(Model model){
        List<Product> products= productService.findAll();
        model.addAttribute("products",new Product());
        return "list";
    }

}
