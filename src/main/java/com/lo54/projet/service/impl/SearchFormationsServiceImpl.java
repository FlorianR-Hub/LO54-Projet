/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.impl;

import com.lo54.projet.dao.data.Client;
import com.lo54.projet.dao.data.CourseSession;
import com.lo54.projet.dao.interf.ClientDao;
import com.lo54.projet.dao.interf.CourseDao;
import com.lo54.projet.dao.interf.CourseSessionDao;
import com.lo54.projet.dao.interf.LocationDao;
import com.lo54.projet.service.data.Formation;
import com.lo54.projet.service.interf.SearchFormationsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Florian
 */
@Service
public class SearchFormationsServiceImpl implements SearchFormationsService {

    @Autowired
    private CourseDao courseDao;

    @Autowired
    private CourseSessionDao courseSessionDao;

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private LocationDao locationDao;

    @Override
    public List<Formation> buildFormationsList() {
        List<Formation> listFormations = new ArrayList<>();
        List<CourseSession> listCourseSessions = courseSessionDao.getAllCourseSessions();

        for (CourseSession cs : listCourseSessions) {
            Formation formation = new Formation();

            formation.setCourseSessionId(cs.getId());
            formation.setCourseCode(cs.getCourseCode());
            formation.setTitle(courseDao.getCourseTitle(cs.getCourseCode()));
            formation.setStartDate(cs.getStartDate());
            formation.setEndDate(cs.getEndDate());
            formation.setCity(locationDao.getCityName(cs.getLocationId()));
            formation.setMaxClients(cs.getMaxClients());
            formation.setListClients(clientDao.getClientsForSessionId(cs.getId()));

            listFormations.add(formation);
        }

        return listFormations;
    }

    @Override
    public List<String> getAllCitiesNames() {
        return locationDao.getAllCitiesNames();
    }

    @Override
    public void createClient(Client client) {
        clientDao.create(client);
    }

}
