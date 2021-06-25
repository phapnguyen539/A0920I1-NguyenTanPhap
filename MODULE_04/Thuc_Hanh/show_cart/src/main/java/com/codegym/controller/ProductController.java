package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;


@Controller
@RequestMapping("/product")
@SessionAttributes("carts")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ModelAttribute("carts")
    public HashMap<Long, Cart> getShowInfo(){
        return new HashMap<>();
    }

    @GetMapping("/list")
    public String showList(Model model){
        Iterable<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "list";
    }

    @GetMapping("/create-product")
    public String showFormCreate(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create-product")
    public String saveProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "New product created successfully");
        return "redirect:/product/list";
    }

    @GetMapping("/view-product/{id}")
    public String viewProduct(@PathVariable Long id, Model model, @ModelAttribute("carts") HashMap<Long, Cart> cartHashMap){
        Product product = productService.findById(id);
        model.addAttribute("carts", cartHashMap);
        model.addAttribute("product", product);
        return "view";
    }

    @GetMapping("/delete-product/{id}")
    public String showDeleteProduct(@PathVariable Long id, Model model){
        Product product = productService.findById(id);

        model.addAttribute("product",product);
        return "delete";
    }

    @PostMapping("/delete-product/{id}")
    public String deleteProduct(@ModelAttribute Product product, @PathVariable Long id){
        productService.remove(id);
        return "redirect:/product/list";
    }
}
