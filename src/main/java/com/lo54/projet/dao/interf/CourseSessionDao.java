/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.CourseSession;
import java.util.List;

/**
 * DAO class for COURSE_SESSION table.
 */
public interface CourseSessionDao {

    /**
     * Return the list of all course sessions.
     *
     * @return
     */
    public List<CourseSession> getAllCourseSessions();
}
