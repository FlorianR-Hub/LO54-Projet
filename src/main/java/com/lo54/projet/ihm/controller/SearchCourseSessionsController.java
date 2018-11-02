/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.ihm.controller;

import com.lo54.projet.ihm.model.SearchCourseSessionsModel;
import com.lo54.projet.service.data.ClientIhm;
import com.lo54.projet.service.data.CourseSessionIhm;
import com.lo54.projet.service.interf.SearchCourseSessionsService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Controller class for the course sessions search page.
 */
@Controller("searchCourseSessionsController")
@Scope("session")
public class SearchCourseSessionsController extends GenericController {

    @Autowired
    private SearchCourseSessionsService searchCourseSessionsService;

    @Autowired
    private SearchCourseSessionsModel searchCourseSessionsModel;

    /**
     * Initialize the model.
     */
    @Override
    public void initModel() {
        searchCourseSessionsModel.setListCourseSessions(searchCourseSessionsService.buildCourseSessionsList());
        searchCourseSessionsModel.setCities(searchCourseSessionsService.getAllCitiesNames());
        searchCourseSessionsModel.setSelectedCourseSession(null);
        searchCourseSessionsModel.setNewClient(new ClientIhm());
    }

    public void register() {
        ClientIhm clientIhm = searchCourseSessionsModel.getNewClient();
        int nbClients = searchCourseSessionsModel.getSelectedCourseSession().getListClients().size();
        int maxClients = searchCourseSessionsModel.getSelectedCourseSession().getMaxClients();

        if (nbClients >= maxClients) {
            FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error : course session full !", null));
            return;
        }

        // Create client and update course sessions list
        if (searchCourseSessionsModel.getSelectedCourseSession() != null) {
            searchCourseSessionsService.createClient(clientIhm);
            searchCourseSessionsModel.setListCourseSessions(searchCourseSessionsService.buildCourseSessionsList());
        }

        // Update selected course session
        List<CourseSessionIhm> listCourseSessionsIhm = searchCourseSessionsModel.getListCourseSessions();
        for (CourseSessionIhm courseSessionIhm : listCourseSessionsIhm) {
            if (courseSessionIhm.getCourseSessionId() == clientIhm.getCourseSession().getId()) {
                searchCourseSessionsModel.setSelectedCourseSession(courseSessionIhm);
            }
        }

        // Reset new client variable
        searchCourseSessionsModel.setNewClient(new ClientIhm());
    }
}
