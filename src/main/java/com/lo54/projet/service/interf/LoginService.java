/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.interf;

import com.lo54.projet.dao.data.User;

/**
 * Service class for login.
 */
public interface LoginService {

    /**
     * Returns the user for the specified userName and password.
     *
     * @param userName the specified userName.
     * @param password the specified password.
     * @return
     */
    public User getUser(String userName, String password);
}
