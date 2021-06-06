package com.codegym.form_vld.formatter;

import com.codegym.form_vld.model.Province;
import com.codegym.form_vld.service.ProvinceService;
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
        this.provinceService=provinceService;
    }

    @Override
    public Province parse(String s, Locale locale) throws ParseException {
        return provinceService.findById(Integer.parseInt(s));
    }


    @Override
    public String print(Province province, Locale locale) {
        return "["+province.getId()+","+province.getName()+"]";
    }
}
