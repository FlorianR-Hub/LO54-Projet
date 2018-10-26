/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.CourseSession;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Florian
 */
public interface CourseSessionDao {

    public List<CourseSession> getCourseSessionsFilteredByDate(Date date);

    public List<CourseSession> getCourseSessionsFilteredByCity(String city);

    public List<CourseSession> getCourseSessionsByCode(String courseCode);

    public List<CourseSession> getAllCourseSessions();
}
