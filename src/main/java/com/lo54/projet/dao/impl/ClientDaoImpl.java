/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.dao.interf.ClientDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDaoImpl implements ClientDao {

    @PersistenceContext(unitName = "Formation")
    private EntityManager entityManager;

    @Override
    @Transactional
    public void create(Client client) {
        entityManager.persist(client);
    }

}
