/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.Client;

/**
 * DAO interface for CLIENT table.
 */
public interface ClientDao {

    /**
     * Creates a new client in CLIENT table.
     *
     * @param client the client to create.
     */
    public void create(Client client);

}
