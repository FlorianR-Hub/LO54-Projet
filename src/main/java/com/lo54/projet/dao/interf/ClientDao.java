/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.Client;

/**
 * DAO class for CLIENT table.
 */
public interface ClientDao {

    /**
     * Create a new client in CLIENT table.
     *
     * @param client the client to create.
     */
    public void create(Client client);

}
