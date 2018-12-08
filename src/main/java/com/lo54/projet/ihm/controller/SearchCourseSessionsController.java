/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
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

    @Override
    public void initModel() {
        searchCourseSessionsModel.setListCourseSessions(searchCourseSessionsService.buildCourseSessionsList());
        searchCourseSessionsModel.setCities(searchCourseSessionsService.getAllCitiesNames());
        searchCourseSessionsModel.setSelectedCourseSession(null);
        searchCourseSessionsModel.setNewClient(new ClientIhm());
    }

    /**
     * Registers a client in a course session.
     */
    public void register() {
        ClientIhm clientIhm = searchCourseSessionsModel.getNewClient();
        int nbClients = searchCourseSessionsModel.getSelectedCourseSession().getListClients().size();
        int maxClients = searchCourseSessionsModel.getSelectedCourseSession().getMaxClients();

        // Checks if the course session is full or not.
        if (nbClients >= maxClients) {
            FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error : course session full !", null));
            return;
        }

        // Creates client and update course sessions list.
        if (searchCourseSessionsModel.getSelectedCourseSession() != null) {
            searchCourseSessionsService.createClient(clientIhm);
            searchCourseSessionsModel.setListCourseSessions(searchCourseSessionsService.buildCourseSessionsList());
        }

        // Updates selected course session.
        List<CourseSessionIhm> listCourseSessionsIhm = searchCourseSessionsModel.getListCourseSessions();
        for (CourseSessionIhm courseSessionIhm : listCourseSessionsIhm) {
            if (courseSessionIhm.getCourseSessionId() == clientIhm.getCourseSession().getId()) {
                searchCourseSessionsModel.setSelectedCourseSession(courseSessionIhm);
            }
        }

        // Resets new client variable.
        searchCourseSessionsModel.setNewClient(new ClientIhm());
    }
}
