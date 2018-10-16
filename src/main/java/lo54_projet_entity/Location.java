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
@Table(name="LOCATION")
public class Location {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int id ; // will be generated automaticly when we add new city to the database
    @Column(name="CITY")
    private String city ;

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

  

    public void setCity(String city) {
        this.city = city;
    }

    public Location(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", city=" + city + '}';
    }
    
    
    
}
