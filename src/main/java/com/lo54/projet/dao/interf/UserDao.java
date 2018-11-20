/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.User;

/**
 * DAO interface for USER_AUTH table.
 */
public interface UserDao {

    /**
     * Returns the user for the specified userName and password.
     *
     * @param userName the specified userName.
     * @param password the specified password.
     * @return
     */
    public User getUserByUserNameAndPassword(String userName, String password);
}
