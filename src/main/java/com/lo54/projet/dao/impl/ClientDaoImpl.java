/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.dao.interf.ClientDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kaled
 */
@Repository
public class ClientDaoImpl implements ClientDao {

    @PersistenceContext(unitName = "Formation")
    private EntityManager entityManager;

    @Override
    @Transactional
    public void create(Client client) {
        entityManager.persist(client);
    }

    @Override
    @Transactional
    public void delete(String firstName, String lastName) {
        Query query = entityManager.createQuery("DELETE FROM Client c WHERE c.firstName = :firstName AND c.lastName = :lastName");

        query.setParameter("firstName", firstName);
        query.setParameter("lastName", lastName);
        query.executeUpdate();
    }

    @Override
    @Transactional
    public List<Client> getAllClients() {
        Query query = entityManager.createQuery("SELECT c FROM Client c");

        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

}
