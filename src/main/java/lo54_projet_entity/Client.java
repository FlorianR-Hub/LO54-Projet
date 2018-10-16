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
public class Client {
    
    private int id ; 
    private String lastName ; 
    private String firstName ; 
    private String adresse ;
    private String phone ; 
    private String mail ; 
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
