/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.model;

import com.lo54.projet.dao.data.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Model class for the template of each pages.
 */
@Component("templateModel")
@Scope("session")
public class TemplateModel {

    private User user;

    private boolean logged = false;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

}
