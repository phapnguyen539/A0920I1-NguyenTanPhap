package com.codegym.customer_aop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
   @AfterThrowing(value = "execution(*com.codegym.customer_aop.controller.CustomerController.*(..))")


}
