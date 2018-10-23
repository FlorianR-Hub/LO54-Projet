/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.impl;

import com.lo54.projet.service.interf.ClientService;
import com.lo54.projet.dao.interf.ClientDao;
import com.lo54.projet.dao.data.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Florian
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public void newClient(Client client) {
        clientDao.create(client);
    }

}
