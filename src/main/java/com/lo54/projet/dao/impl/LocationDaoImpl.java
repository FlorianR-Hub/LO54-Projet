/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.interf.LocationDao;
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
public class LocationDaoImpl implements LocationDao {

    @PersistenceContext(unitName = "Formation")
    private EntityManager entityManager;

    @Override
    @Transactional
    public String getCityName(int id) {
        String sQuery = "SELECT l.city FROM Location l WHERE l.id = :id";
        TypedQuery<String> query = entityManager.createQuery(sQuery, String.class);
        query.setParameter("id", id);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    @Transactional
    public List<String> getAllCitiesNames() {
        String sQuery = "SELECT l.city FROM Location l";
        TypedQuery<String> query = entityManager.createQuery(sQuery, String.class);

        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

}
