/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.Course;
import com.lo54.projet.dao.interf.CourseDao;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO : faire fonctionner le rollback pour les tests create en BDD
 *
 * @author Florian
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CourseDaoImplTest {

    @Autowired
    private CourseDao courseDao;

    @Test
    @Rollback(true)
    public void testCreate() {
        Course course = new Course();
        course.setCode("TEST");
        course.setTitle("test course");

        //courseDao.create(course);
    }

    @Test
    public void testGetCourseByKeyword() {
        List<Course> listCourses = courseDao.getCourseByKeyword("AA22");

        for (Course c : listCourses) {
            System.out.println(c.toString());
        }
    }
}
