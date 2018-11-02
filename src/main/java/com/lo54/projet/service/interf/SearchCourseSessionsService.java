/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.interf;

import com.lo54.projet.service.data.ClientIhm;
import com.lo54.projet.service.data.CourseSessionIhm;
import java.util.List;

/**
 * Service class for the course session search page.
 */
public interface SearchCourseSessionsService {

    /**
     * Build and return the course sessions list.
     *
     * @return
     */
    public List<CourseSessionIhm> buildCourseSessionsList();

    /**
     * Returns the list of all cities in the LOCATION table.
     *
     * @return
     */
    public List<String> getAllCitiesNames();

    /**
     * Create a new Client in the CLIENT table.
     *
     * @param clientIhm
     */
    public void createClient(ClientIhm clientIhm);
}
