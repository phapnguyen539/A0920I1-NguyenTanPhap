package com.codegym.blogdata.service;

import com.codegym.blogdata.model.Language;
import com.codegym.blogdata.repository.LanguageRepository;
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
