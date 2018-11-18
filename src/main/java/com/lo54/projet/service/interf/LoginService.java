/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.interf;

import com.lo54.projet.dao.data.User;

/**
 *
 * @author flori
 */
public interface LoginService {

    public User getUser(String userName, String password);
}
