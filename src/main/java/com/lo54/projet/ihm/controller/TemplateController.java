/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.ihm.controller;

import com.lo54.projet.dao.data.User;
import com.lo54.projet.ihm.model.TemplateModel;
import com.lo54.projet.service.interf.LoginService;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Controller class for the template of each pages.
 */
@Controller("templateController")
@Scope("session")
public class TemplateController extends GenericController {

    @Autowired
    private TemplateModel templateModel;

    @Autowired
    private LoginService loginService;

    @Override
    public void initModel() {
        templateModel.setUser(new User());
    }

    /**
     * Checks the credentials.
     */
    public void login() {
        FacesMessage message = null;
        User user = loginService.getUser(templateModel.getUser().getUserName(), templateModel.getUser().getPassword());

        if (user != null) {
            templateModel.setLogged(true);
            templateModel.getUser().setAdmin(user.isAdmin());
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", templateModel.getUser().getUserName());
        } else {
            templateModel.setLogged(false);
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }

        FacesContext.getCurrentInstance().addMessage(null, message);
        RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.addCallbackParam("loggedIn", templateModel.isLogged());
    }

    /**
     * Disconnects the user.
     *
     * @throws java.io.IOException
     */
    public void signOut() throws IOException {
        templateModel.setLogged(false);
    }

    /**
     * Displays the login dialog.
     *
     * @throws java.io.IOException
     */
    public void signIn() throws IOException {
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('dlg').show();");
    }

}
