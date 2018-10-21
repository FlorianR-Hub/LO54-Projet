/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo54_project.tests;
import lo54_project.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author kaled
 */
public class HibernateTest {
    
    public static void main(String[] args) {
    // create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create a student object
			System.out.println("Creating new student object...");
			Client tempClient = new Client("Paul", "Wall","75 fake adresse" ,"0654546445","paul@luv2code.com",1);
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			session.save(tempClient);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
                        
                        
                     // now get a new session and start transaction
			/*session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			// delete student id=2
			
			
			session.createQuery("delete from CLIENT where LASTNAME='krifa' and FIRSTNAME= 'khaled'").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");*/
		}
		finally {
			factory.close();
		}

    }
}
 
