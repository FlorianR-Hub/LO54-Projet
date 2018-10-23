/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service;

import com.lo54.projet.service.impl.ClientServiceImpl;
import com.lo54.projet.dao.interf.ClientDao;
import com.lo54.projet.dao.data.Client;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author Florian
 */
public class ClientServiceImplTest {

    @Mock
    private ClientDao clientDao;

    @InjectMocks
    private ClientServiceImpl clientService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Rollback(true)
    public void testNewCourse() {
        Client client = new Client();
        client.setId(0);
        client.setLastName("Test");
        client.setFirstName("Test");
        client.setAdresse("75 rue du test");
        client.setPhone("0654546445");
        client.setMail("test@test.test");
        client.setCourseSessionId(1);

        Mockito.doNothing().when(clientDao).create(client);

        clientService.newClient(client);
    }
}
