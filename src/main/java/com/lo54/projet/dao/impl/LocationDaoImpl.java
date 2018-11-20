/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
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

@Repository
public class LocationDaoImpl implements LocationDao {

    @PersistenceContext(unitName = "Formation")
    private EntityManager entityManager;

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
