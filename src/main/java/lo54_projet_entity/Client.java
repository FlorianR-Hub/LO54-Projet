/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo54_projet_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kaled
 */
@Entity
@Table(name="CLIENT")
public class Client {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int id ; 
    @Column(name="LASTNAME")
    private String lastName ; 
    @Column(name="FIRSTNAME")
    private String firstName ; 
    @Column(name="ADRESSE")
    private String adresse ;
    @Column(name="PHONE")
    private String phone ; 
    @Column(name="MAIL")
    private String mail ; 
    @Column(name="COURSE_SESSION_ID")
    private int courseSessionId ; 
    
    
     public Client(String lastName, String firstName, String adresse, String phone, String mail, int courseSessionId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.adresse = adresse;
        this.phone = phone;
        this.mail = mail;
        this.courseSessionId = courseSessionId;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public int getCourseSessionId() {
        return courseSessionId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCourseSessionId(int courseSessionId) {
        this.courseSessionId = courseSessionId;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", adresse=" + adresse + ", phone=" + phone + ", mail=" + mail + ", courseSessionId=" + courseSessionId + '}';
    }

   
    
    
    
}
