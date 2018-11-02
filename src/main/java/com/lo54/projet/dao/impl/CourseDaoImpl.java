/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.Course;
import com.lo54.projet.dao.interf.CourseDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public class CourseDaoImpl implements CourseDao {

    @PersistenceContext(unitName = "Formation")
    private EntityManager entityManager;

    @Override
    @Transactional
    public void create(Course course) {
        entityManager.persist(course);
    }

}
