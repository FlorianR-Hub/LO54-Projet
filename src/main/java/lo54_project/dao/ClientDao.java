/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo54_project.dao;
import lo54_projet_entity.Client;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author kaled
 */
public class ClientDao {
    
    public boolean CreateNewClient(String lastName, String firstName, String adresse, String phone, String mail, int courseSessionId)
    {
    // create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
                boolean successful = false;
		
		try {			
			// create a student object
			System.out.println("Creating new student object...");
			Client tempClient = new Client(lastName, firstName, adresse, phone, mail, courseSessionId);
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			session.save(tempClient);
			
			// commit transaction
			session.getTransaction().commit();
			successful = true;
			System.out.println("Done!");
		} catch (HibernateException r) {  
                    System.out.println(" transaction error");
                } finally {
			factory.close();
                        session = null;
		}
                 return successful;

    }
    
    
}
