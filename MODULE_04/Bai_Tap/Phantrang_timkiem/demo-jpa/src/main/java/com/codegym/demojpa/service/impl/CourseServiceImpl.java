package com.codegym.demojpa.service.impl;

import com.codegym.demojpa.model.Course;
import com.codegym.demojpa.repository.CourseRepository;
import com.codegym.demojpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Override
    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }
}
