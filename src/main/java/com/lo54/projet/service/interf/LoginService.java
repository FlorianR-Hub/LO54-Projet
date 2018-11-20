/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
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
