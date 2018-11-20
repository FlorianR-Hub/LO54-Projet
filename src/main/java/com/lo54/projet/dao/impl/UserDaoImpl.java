/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.User;
import com.lo54.projet.dao.interf.UserDao;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "Formation")
    private EntityManager entityManager;

    @Override
    public User getUserByUserNameAndPassword(String userName, String password) {
        String sQuery = "SELECT u FROM User u WHERE u.userName = :username AND u.password = :password";
        TypedQuery<User> query = entityManager.createQuery(sQuery, User.class);
        query.setParameter("username", userName);
        query.setParameter("password", password);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
