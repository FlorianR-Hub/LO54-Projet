/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.Course;

/**
 * DAO interface for COURSE table.
 */
public interface CourseDao {

    /**
     * Creates a new Course in COURSE table.
     *
     * @param course the course to create.
     */
    public void create(Course course);

}
