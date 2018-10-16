/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo54_project.tests;
import java.sql.*;
/**
 *
 * @author kaled
 */
public class ConnexionTest {
    
     public static void main(String[] args) {
        // TODO code application logic here
        try{ 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527//Formation","lo54","lo54");
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM LO54.CLIENT");
        
        while (rs.next()) {
        String name = rs.getString("LASTNAME")+ " "+rs.getString("FIRSTNAME");
        
        System.out.println(name);
    }
        }catch(SQLException e){
            System.err.println(e);
        }                 
     
      }
}
