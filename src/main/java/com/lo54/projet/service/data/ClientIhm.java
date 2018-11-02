/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.service.data;

import com.lo54.projet.dao.data.CourseSession;

public class ClientIhm {

    private String lastName;

    private String firstName;

    private String address;

    private String phone;

    private String mail;

    private CourseSession courseSession;

    public ClientIhm() {
        courseSession = new CourseSession();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public CourseSession getCourseSession() {
        return courseSession;
    }

    public void setCourseSession(CourseSession courseSession) {
        this.courseSession = courseSession;
    }

    @Override
    public String toString() {
        return "ClientIhm{" + "lastName=" + lastName + ", firstName=" + firstName + ", address=" + address + ", phone=" + phone + ", mail=" + mail + ", courseSession=" + courseSession + '}';
    }

}
