/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.Course;
import com.lo54.projet.dao.interf.CourseDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Florian
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

    @Override
    @Transactional
    public List<Course> getCourseByKeyword(String key) {
        String sQuery = "SELECT c FROM Course c WHERE c.title LIKE :key OR c.code LIKE :key";
        TypedQuery<Course> query = entityManager.createQuery(sQuery, Course.class);
        query.setParameter("key", "%" + key + "%");

        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

}
