package com.codegym.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.Locale;

@Configuration
public class ApplicationConfig implements WebMvcConfigurer{

    //Cau hinh gia tri mac dinh
@Bean
    public LocaleResolver localeResolver(){
SessionLocaleResolver localeResolver= new SessionLocaleResolver();
localeResolver.setDefaultLocale(new Locale("vi"));
return localeResolver;
}
//Tao local Intercepter_ Tao 1 bien cho nguoi dung chon ngon ngu.
@Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
LocaleChangeInterceptor local= new LocaleChangeInterceptor();
local.setParamName("lang");
return local;
}
@Override
    public void addInterceptors(InterceptorRegistry registry){
    registry.addInterceptor(localeChangeInterceptor());
}
@Bean
    public MessageSource messageSource(){
     ResourceBundleMessageSource messageSource= new ResourceBundleMessageSource();
     messageSource.setBasename("messages/message");
     messageSource.setDefaultEncoding("UTF-8");
     return messageSource;
}


}