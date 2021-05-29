package com.codegym.blog_validate.service;

import com.codegym.blog_validate.model.Language;
import com.codegym.blog_validate.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    LanguageRepository languageRepository;
    @Override
    public List<Language> findAllLanguage() {
        return languageRepository.findAll();
    }
}
