/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.dao.interf.ClientDao;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author flori
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ClientDaoImplTest {

    @Autowired
    private ClientDao clientDao;

    @Test
    @Rollback(true)
    public void testCreate() {
        Client client = new Client();
        client.setId(0);
        client.setLastName("Test");
        client.setFirstName("Test");
        client.setAdresse("75 rue du test");
        client.setPhone("0654546445");
        client.setMail("test@test.test");
        client.setCourseSessionId(1);

        //clientDao.create(client);
    }

    @Test
    public void testDelete() {
        Client client = new Client();
        client.setId(0);
        client.setLastName("Test2");
        client.setFirstName("Test2");
        client.setAdresse("75 rue du test");
        client.setPhone("0654546445");
        client.setMail("test@test.test");
        client.setCourseSessionId(1);

        clientDao.create(client);
        clientDao.delete("Test2", "Test2");
    }

    @Test
    public void testGetAllClients() {
        List<Client> listClients = clientDao.getAllClients();

        for (Client c : listClients) {
            System.out.println(c.toString());
        }
    }
}
