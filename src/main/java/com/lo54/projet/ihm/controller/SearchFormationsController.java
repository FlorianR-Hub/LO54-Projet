/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.controller;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.ihm.model.SearchFormationsModel;
import com.lo54.projet.service.interf.SearchFormationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Florian
 */
@Controller("searchFormationsController")
@Scope("session")
public class SearchFormationsController extends GenericController {

    @Autowired
    private SearchFormationsService searchFormationsService;

    @Autowired
    private SearchFormationsModel searchFormationsModel;

    @Override
    public void initModel() {
        searchFormationsModel.setListFormations(searchFormationsService.buildFormationsList());
        searchFormationsModel.setCities(searchFormationsService.getAllCitiesNames());
        searchFormationsModel.setSelectedFormation(null);
    }

    public void register() {
        Client client = searchFormationsModel.getNewClient();
        searchFormationsService.createClient(client);
        searchFormationsModel.setListFormations(searchFormationsService.buildFormationsList());
    }
}
