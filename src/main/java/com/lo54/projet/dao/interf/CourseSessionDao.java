/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.CourseSession;
import java.util.List;

/**
 * DAO interface for COURSE_SESSION table.
 */
public interface CourseSessionDao {

    /**
     * Returns the list of all course sessions.
     *
     * @return
     */
    public List<CourseSession> getAllValidCourseSessions();
}
