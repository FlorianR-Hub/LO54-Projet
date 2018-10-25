/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.model;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.service.data.Formation;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Florian
 */
@Component("searchFormationsModel")
@Scope("session")
public class SearchFormationsModel {

    private List<Formation> listFormations;

    private List<Formation> filteredFormations;

    private Formation selectedFormation;

    private List<String> cities;

    private Client newClient;

    public List<Formation> getListFormations() {
        return listFormations;
    }

    public void setListFormations(List<Formation> listFormations) {
        this.listFormations = listFormations;
    }

    public Formation getSelectedFormation() {
        return selectedFormation;
    }

    public void setSelectedFormation(Formation selectedFormation) {
        this.selectedFormation = selectedFormation;
    }

    public List<Formation> getFilteredFormations() {
        return filteredFormations;
    }

    public void setFilteredFormations(List<Formation> filteredFormations) {
        this.filteredFormations = filteredFormations;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Client getNewClient() {
        return newClient;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }

}
