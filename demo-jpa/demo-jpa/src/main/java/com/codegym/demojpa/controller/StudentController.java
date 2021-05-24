package com.codegym.demojpa.controller;

import  com.codegym.demojpa.model.Student;
import com.codegym.demojpa.service.StudentService;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public ModelAndView getHome(@RequestParam Optional<String> key_search){
        if(!key_search.isPresent()){
            return new ModelAndView("list", "students", studentService.findAllStudent());
        }else {
            return new ModelAndView("list", "students", studentService.findStudentByName(key_search.get()));
        }
    }
}
