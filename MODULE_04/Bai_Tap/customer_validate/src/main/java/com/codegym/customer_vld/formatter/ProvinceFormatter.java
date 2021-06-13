package com.codegym.customer_vld.formatter;

import com.codegym.customer_vld.model.Province;
import com.codegym.customer_vld.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ProvinceFormatter implements Formatter<Province> {

    @Autowired
    ProvinceService provinceService;

    public ProvinceFormatter(ProvinceService provinceService) {
        this.provinceService = provinceService;

    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        return provinceService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Province province, Locale locale) {
        return "[" + province.getId() + ", " + province.getName() + "]";
    }
}
