/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.Client;
import java.util.List;

/**
 *
 * @author Florian
 */
public interface ClientDao {

    public void create(Client client);

    public void delete(String firstName, String lastName);

    public List<Client> getAllClients();
}
