/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.view;

import com.lo54.projet.ihm.controller.HomeController;
import com.lo54.projet.ihm.model.HomeModel;
import java.io.IOException;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component("homeView")
@Scope("session")
public class HomeView extends GenericView {

    @Autowired
    private HomeController homeController;

    @Autowired
    private HomeModel homeModel;

    @Override
    public void initView() {
        // La méthode initView() est appelée pour chaque appel AJAX.
        // On ne souhaite l'appeler qu'au démarrage de la page.
        if (FacesContext.getCurrentInstance().getPartialViewContext().isAjaxRequest()) {
            return;
        }

        if (!homeModel.isLogged()) {
            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PF('dlg').show();");
        }

        homeController.initModel();
    }

    /**
     *
     */
    public void onLogin() {
        homeController.login();
    }

    /**
     *
     */
    public void onSignOut() throws IOException {
        homeController.signOut();
    }

}
