package com.codegym.customer_manager.aop;

import com.codegym.customer_manager.exception.NotAvailableException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import java.util.Arrays;

@Aspect
public class Logger {
    @AfterThrowing(pointcut = "execution(public * com.codegym.customer_manager.service.CustomerService.findAll(..))",throwing = "e")
    public void log(JoinPoint joinPoint, NotAvailableException e){
        String className= joinPoint.getTarget().getClass().getSimpleName();
        String methodName=joinPoint.getSignature().getName();
        String argsName= Arrays.toString(joinPoint.getArgs());
        System.out.printf("An error has occured at:%s.%s.%s:$s",className,methodName,argsName ,e.getMessage());
    }
    @After(("execution(public * com.codegym.customer_manager.service.CustomerService.*(..))"))
    public void logCus(JoinPoint joinPoint){
        String className= joinPoint.getTarget().getClass().getSimpleName();
        String methodName= joinPoint.getSignature().getName();
        System.err.printf("Method excuted at:%s.%s",className,methodName);
    }
}
