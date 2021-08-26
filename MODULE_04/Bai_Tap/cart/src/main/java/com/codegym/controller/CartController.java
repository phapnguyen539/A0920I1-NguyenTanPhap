package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.CartService;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import java.util.HashMap;
import java.util.Map;
@Controller
public class CartController {

    @Autowired
    CartService cartService;
    ProductService productService;

    @GetMapping("/")
    public String showCart(@SessionAttribute("carts") HashMap<Integer, Cart> cartHashMap, Model model) {
        model.addAttribute("carts", cartHashMap);
        model.addAttribute("cartNum", cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        return "cart";
    }

    @GetMapping("/")
    public String addCart(@PathVariable int id, @SessionAttribute("carts") HashMap<Integer, Cart> cartHashMap, Model model) {
        if (cartHashMap == null) {
            cartHashMap = new HashMap<>();
        }
        Product product = productService.findById(id);
        if (product != null) {
            model.addAttribute("carts", cartHashMap);
            model.addAttribute("CartNum", cartHashMap.size());
            model.addAttribute("cartMoney", totalPrice(cartHashMap));
        }
        return "redirect:/";
    }


    private double totalPrice(HashMap<Integer, Cart> cartHashMap) {
        int count = 0;
        for (Map.Entry<Integer, Cart> list : cartHashMap.entrySet()) {
            count += Double.parseDouble(list.getValue().getProduct().getNewPrice()) * list.getValue().getQuantity();
        }
        return count;
    }
}
