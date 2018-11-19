/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.controller;

import com.lo54.projet.dao.data.User;
import com.lo54.projet.ihm.model.HomeModel;
import com.lo54.projet.service.interf.LoginService;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 */
@Controller("homeController")
@Scope("session")
public class HomeController extends GenericController {

    @Autowired
    private HomeModel homeModel;

    @Autowired
    private LoginService loginService;

    @Override
    public void initModel() {
        homeModel.setUser(new User());
    }

    /**
     *
     */
    public void login() {
        FacesMessage message = null;
        User user = loginService.getUser(homeModel.getUser().getUserName(), homeModel.getUser().getPassword());

        if (user != null) {
            homeModel.setLogged(true);
            homeModel.getUser().setAdmin(user.isAdmin());
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", homeModel.getUser().getUserName());
        } else {
            homeModel.setLogged(false);
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }

        FacesContext.getCurrentInstance().addMessage(null, message);
        RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.addCallbackParam("loggedIn", homeModel.isLogged());
    }

    /**
     *
     */
    public void signOut() throws IOException {
        homeModel.setLogged(false);
        FacesContext.getCurrentInstance().getExternalContext().redirect("/pages/home.xhtml");
    }

    /**
     *
     */
    public void signIn() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/pages/home.xhtml");
    }

}
