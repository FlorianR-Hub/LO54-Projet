/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo54_project.dao;
import java.util.ArrayList;
import java.util.List;
import lo54_project.entity.Client;
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
    
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
                boolean successful = false;
		
		try {			
			
			System.out.println("Creating new student object...");
			Client tempClient = new Client(lastName, firstName, adresse, phone, mail, courseSessionId);
			
			
			session.beginTransaction();
			
			
			System.out.println("Saving the student...");
			session.save(tempClient);
			
			
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
    
    
     public boolean DeleteClient(String lastName, String firstName)
    {
    
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
                boolean successful = false;
		
		try {			
			
			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			session.createQuery("delete from CLIENT where LASTNAME='"+lastName+"' and FIRSTNAME='"+firstName + "'").executeUpdate();
			
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} catch (HibernateException r) {  
                    System.out.println(" transaction error");
                } finally {
			factory.close();
                        session = null;
		}
                 return successful;
    }
     
     public List<Client> GetClients()
    {
    
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
                List<Client> myClients = new ArrayList<Client>()  ;
		try {			
			
			session.beginTransaction();
			
			
			myClients = session.createQuery("from CLIENT").list();
			
			
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		} catch (HibernateException r) {  
                    System.out.println(" transaction error");
                } finally {
			factory.close();
                        session = null;
		}
                 return myClients;
    }
    
    
    
    
}
