/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.ihm.model;

import com.lo54.projet.service.data.ClientIhm;
import com.lo54.projet.service.data.CourseSessionIhm;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Model class for the course sessions search page.
 */
@Component("searchCourseSessionsModel")
@Scope("session")
public class SearchCourseSessionsModel {

    private List<CourseSessionIhm> listCourseSessions;

    private List<CourseSessionIhm> filteredCourseSessions;

    private CourseSessionIhm selectedCourseSession;

    private List<String> cities;

    private ClientIhm newClient;

    public List<CourseSessionIhm> getListCourseSessions() {
        return listCourseSessions;
    }

    public void setListCourseSessions(List<CourseSessionIhm> listCourseSessions) {
        this.listCourseSessions = listCourseSessions;
    }

    public List<CourseSessionIhm> getFilteredCourseSessions() {
        return filteredCourseSessions;
    }

    public void setFilteredCourseSessions(List<CourseSessionIhm> filteredCourseSessions) {
        this.filteredCourseSessions = filteredCourseSessions;
    }

    public CourseSessionIhm getSelectedCourseSession() {
        return selectedCourseSession;
    }

    public void setSelectedCourseSession(CourseSessionIhm selectedCourseSession) {
        this.selectedCourseSession = selectedCourseSession;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public ClientIhm getNewClient() {
        return newClient;
    }

    public void setNewClient(ClientIhm newClient) {
        this.newClient = newClient;
    }

}
