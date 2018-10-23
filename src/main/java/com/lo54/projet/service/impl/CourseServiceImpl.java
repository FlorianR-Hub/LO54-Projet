/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.impl;

import com.lo54.projet.service.interf.CourseService;
import com.lo54.projet.dao.interf.CourseDao;
import com.lo54.projet.dao.data.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Florian
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public void newCourse(Course course) {
        courseDao.create(course);
    }
}
