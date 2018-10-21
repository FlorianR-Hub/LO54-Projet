/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo54_project.dao;

import java.util.ArrayList;
import java.util.List;
import lo54_project.entity.Client;
import lo54_project.entity.Course;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author kaled
 */
public class CourseDao {
    
    public List<Course> getCourseByWordKey(String key)
    {
        SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		// create session
        Session session = factory.getCurrentSession();
                
               List<Course> myCourses = new ArrayList<Course>()  ;
		try {			
			
			session.beginTransaction();
			
			
			myCourses = session.createQuery("from COURSES where TITLE= '*"+key+"*'").list();
			
			
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		} catch (HibernateException r) {  
                    System.out.println(" transaction error");
                } finally {
			factory.close();
                        session = null;
		}
                 return myCourses; 
    }
    
    public boolean CreateNewCourse(String code,String title)
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
			
			System.out.println("Creating new course object...");
			Course tempCourse = new Course(code,title);
			
			
			session.beginTransaction();
			
			
			System.out.println("Saving the course...");
			session.save(tempCourse);
			
			
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
