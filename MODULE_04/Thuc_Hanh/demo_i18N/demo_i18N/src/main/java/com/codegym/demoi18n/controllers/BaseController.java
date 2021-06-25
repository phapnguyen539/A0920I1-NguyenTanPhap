package com.codegym.demoi18n.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseController {
    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request, @RequestParam(value = "language", required = false) String lang) {
        String message = messageSource.getMessage("hello", null, "default message", request.getLocale());
        String goodbye = messageSource.getMessage("goodbye", null, "default", request.getLocale());
        model.addAttribute("goodbye", goodbye);
        model.addAttribute("message", message);
        if (lang == null) {
            lang = "en";
        }
        model.addAttribute("lang", lang);
        return "index";
    }

    @RequestMapping("/page2")
    public String index2(Model model, HttpServletRequest request, @RequestParam(value = "language", required = false) String lang) {
        String message = messageSource.getMessage("hello", null, "default message", request.getLocale());
        String goodbye = messageSource.getMessage("goodbye", null, "default", request.getLocale());
        model.addAttribute("goodbye", goodbye);
        model.addAttribute("message", message);
        if (lang == null) {
            lang = "en";
        }
        model.addAttribute("lang", lang);
        return "index2";
    }


}
