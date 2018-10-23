/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service;

import com.lo54.projet.dao.interf.CourseDao;
import com.lo54.projet.dao.data.Course;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author Florian
 */
public class CourseServiceImplTest {

    @Mock
    private CourseDao courseDao;

    @InjectMocks
    private CourseServiceImpl courseService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Rollback(true)
    public void testNewCourse() {
        Course course = new Course();
        course.setCode("TEST");
        course.setTitle("test course");

        Mockito.doNothing().when(courseDao).create(course);

        courseService.newCourse(course);
    }

}
