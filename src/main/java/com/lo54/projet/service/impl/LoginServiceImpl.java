/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.service.impl;

import com.lo54.projet.dao.data.User;
import com.lo54.projet.dao.interf.UserDao;
import com.lo54.projet.service.interf.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String userName, String password) {
        return userDao.getUserByUserNameAndPassword(userName, password);
    }

}
