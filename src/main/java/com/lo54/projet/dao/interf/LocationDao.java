/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
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
