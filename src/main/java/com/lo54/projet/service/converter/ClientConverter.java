/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.converter;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.service.data.ClientIhm;

/**
 * Conversion class for ClientIhm and Client objects.
 */
public class ClientConverter {

    /**
     * Converts a ClientIhm object to Client object.
     *
     * @param clientIhm object to convert.
     * @return
     */
    public static Client convert(ClientIhm clientIhm) {
        Client client = new Client();
        client.setFirstName(clientIhm.getFirstName());
        client.setLastName(clientIhm.getLastName());
        client.setAddress(clientIhm.getAddress());
        client.setPhone(clientIhm.getPhone());
        client.setMail(clientIhm.getMail());
        client.setCourseSession(clientIhm.getCourseSession());

        return client;
    }

    /**
     * Converts a Client object to ClientIhm object.
     *
     * @param client object to convert.
     * @return
     */
    public static ClientIhm convert(Client client) {
        ClientIhm clientIhm = new ClientIhm();
        clientIhm.setFirstName(client.getFirstName());
        clientIhm.setLastName(client.getLastName());
        clientIhm.setAddress(client.getAddress());
        clientIhm.setPhone(client.getPhone());
        clientIhm.setMail(client.getMail());
        clientIhm.setCourseSession(client.getCourseSession());

        return clientIhm;
    }
}
