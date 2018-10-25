/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.interf;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.service.data.Formation;
import java.util.List;

/**
 *
 * @author Florian
 */
public interface SearchFormationsService {

    public List<Formation> buildFormationsList();

    public List<String> getAllCitiesNames();

    public void createClient(Client client);
}
