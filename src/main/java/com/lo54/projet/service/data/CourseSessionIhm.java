/*
 * LO54 Project
 *
 * KRIFA Khaled - RIFFLART Florian
 *
 * UTBM A2018
 */
package com.lo54.projet.service.data;

import com.lo54.projet.dao.data.Client;
import java.util.Date;
import java.util.List;

public class CourseSessionIhm {

    private int courseSessionId;

    private String courseCode;

    private String title;

    private Date startDate;

    private Date endDate;

    private String city;

    private int maxClients;

    private List<Client> listClients;

    public int getCourseSessionId() {
        return courseSessionId;
    }

    public void setCourseSessionId(int courseSessionId) {
        this.courseSessionId = courseSessionId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMaxClients() {
        return maxClients;
    }

    public void setMaxClients(int maxClients) {
        this.maxClients = maxClients;
    }

    public List<Client> getListClients() {
        return listClients;
    }

    public void setListClients(List<Client> listClients) {
        this.listClients = listClients;
    }

}
