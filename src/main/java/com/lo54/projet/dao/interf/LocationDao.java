/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.interf;

import java.util.List;

/**
 * DAO interface for LOCATION table.
 */
public interface LocationDao {

    /**
     * Returns the list of all cities names.
     *
     * @return
     */
    public List<String> getAllCitiesNames();
}
