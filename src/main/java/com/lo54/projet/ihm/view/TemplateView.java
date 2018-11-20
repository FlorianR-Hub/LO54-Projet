/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.ihm.view;

import com.lo54.projet.ihm.controller.TemplateController;
import com.lo54.projet.ihm.model.TemplateModel;
import java.io.IOException;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * View class for the template of each pages.
 */
@Component("templateView")
@Scope("session")
public class TemplateView extends GenericView {

    @Autowired
    private TemplateController templateController;

    @Autowired
    private TemplateModel templateModel;

    @Override
    public void initView() {
        // The initView() method is called for each AJAX call.
        // We only want to call it when we load the page.
        if (FacesContext.getCurrentInstance().getPartialViewContext().isAjaxRequest()) {
            return;
        }

        if (!templateModel.isLogged()) {
            templateController.initModel();
            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PF('dlg').show();");
        }

    }

    /**
     * Call the login() method of the controller class.
     */
    public void onLogin() {
        templateController.login();
    }

    /**
     * Call the signOut() method of the controller class.
     *
     * @throws java.io.IOException
     */
    public void onSignOut() throws IOException {
        templateController.signOut();
    }

    /**
     * Call the signIn() method of the controller class.
     *
     * @throws java.io.IOException
     */
    public void onSignIn() throws IOException {
        templateController.signIn();
    }

}
