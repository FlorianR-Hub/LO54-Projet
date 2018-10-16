/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo54_project.service;

import java.sql.*;

/**
 *
 * @author kaled
 */
public class Connexion {

    private Connection cnx;

    public Connexion() throws Exception {

        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        cnx = DriverManager.getConnection("jdbc:derby://localhost:1527//LO54", "lo54", "lo54");

    }

    public Connection getcnx() {
        return cnx;
    }

}
