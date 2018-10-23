/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.CourseSession;
import com.lo54.projet.dao.interf.CourseSessionDao;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Florian
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CourseSessionDaoImplTest {

    @Autowired
    private CourseSessionDao courseSessionDao;

    @Test
    public void testGetCourseSessionsFilteredByDate() {
        List<CourseSession> listCourseSessions = courseSessionDao.getCourseSessionsFilteredByDate("2018-11-20");

        for (CourseSession cs : listCourseSessions) {
            System.out.println(cs.toString());
        }
    }

    // Ne fonctionne pas
    @Test
    public void testGetCourseSessionsFilteredByCity() {
        /*List<CourseSession> listCourseSessions = courseSessionDao.getCourseSessionsFilteredByCity("Lyon");

        for (CourseSession cs : listCourseSessions) {
            System.out.println(cs.toString());
        }*/
    }
}
