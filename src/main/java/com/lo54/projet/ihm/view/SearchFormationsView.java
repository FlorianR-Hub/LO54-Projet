/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.view;

import com.lo54.projet.ihm.controller.SearchFormationsController;
import com.lo54.projet.ihm.model.SearchFormationsModel;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Florian
 */
@Component("searchFormationsView")
@Scope("session")
public class SearchFormationsView extends GenericView {

    @Autowired
    private SearchFormationsController searchFormationsController;

    @Autowired
    private SearchFormationsModel searchFormationsModel;

    @Override
    public void initView() {
        // La méthode initView() est appelée pour chaque appel AJAX.
        // On ne souhaite l'appeler qu'au démarrage de la page.
        if (FacesContext.getCurrentInstance().getPartialViewContext().isAjaxRequest()) {
            return;
        }

        searchFormationsController.initModel();
    }

    // TODO : l'inscription d'un nouveau client ne fonctionne pas
    public void addNew() {
        searchFormationsController.register();
    }

}
