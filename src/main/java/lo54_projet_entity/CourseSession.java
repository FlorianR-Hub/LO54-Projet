/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo54_projet_entity;

/**
 *
 * @author kaled
 */
public class CourseSession {
    private int id ; 
    private String startDate ; 
    private String endDate ; 
    private int maxClients ; 
    private String courseCode ; 
    private int locationId ; 

    public int getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getMaxClients() {
        return maxClients;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setMaxClients(int maxClients) {
        this.maxClients = maxClients;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public CourseSession(String startDate, String endDate, int maxClients, String courseCode, int locationId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxClients = maxClients;
        this.courseCode = courseCode;
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "CourseSession{" + "id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", maxClients=" + maxClients + ", courseCode=" + courseCode + ", locationId=" + locationId + '}';
    }
    
    
    
    
}
