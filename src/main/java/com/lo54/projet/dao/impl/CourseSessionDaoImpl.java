/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.CourseSession;
import com.lo54.projet.dao.interf.CourseSessionDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public class CourseSessionDaoImpl implements CourseSessionDao {

    @PersistenceContext(unitName = "Formation")
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<CourseSession> getAllCourseSessions() {
        String sQuery = "SELECT cs FROM CourseSession cs";
        TypedQuery<CourseSession> query = entityManager.createQuery(sQuery, CourseSession.class);

        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

}
