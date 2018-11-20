/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.impl;

import com.lo54.projet.dao.data.User;
import com.lo54.projet.dao.interf.UserDao;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Test class of LoginServiceImpl.
 */
public class LoginServiceImplTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private LoginServiceImpl loginService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUser() {
        User userExpected = new User();
        userExpected.setUserName("userName");
        userExpected.setPassword("password");
        userExpected.setAdmin(true);

        Mockito.when(userDao.getUserByUserNameAndPassword("userName", "password")).thenReturn(userExpected);

        User userActual = loginService.getUser("userName", "password");

        Assert.assertEquals(userExpected.getUserName(), userActual.getUserName());
        Assert.assertEquals(userExpected.getPassword(), userActual.getPassword());
        Assert.assertEquals(userExpected.isAdmin(), userActual.isAdmin());
    }

}
