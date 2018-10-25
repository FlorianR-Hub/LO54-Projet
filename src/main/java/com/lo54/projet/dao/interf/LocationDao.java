/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.interf;

import java.util.List;

/**
 *
 * @author Florian
 */
public interface LocationDao {

    public String getCityName(int id);

    public List<String> getAllCitiesNames();
}
