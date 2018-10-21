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
public class CourseSessionDao {
     public List<Course> getCourseFiltredByDate(String date)
    {
        SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		
        Session session = factory.getCurrentSession();
                
               List<Course> myCourses = new ArrayList<Course>()  ;
		try {			
			
			session.beginTransaction();
			
			
			myCourses = session.createQuery("from COURSE_SESION where '"+date+"' between START_DATE and END_DATE").list();
			
			
			
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
     
      public List<Course> getCourseFiltredByCity(String city)
    {
        SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Client.class)
								.buildSessionFactory();
		
		
        Session session = factory.getCurrentSession();
                
               List<Course> myCourses = new ArrayList<Course>()  ;
		try {			
			
			session.beginTransaction();
			
			
			myCourses = session.createQuery("select * from COURSE_SESSION, LOCATION  where LOCATION.ID = COURSE_SESSION.LOCATION_ID and LOCATION.CITY='"+city+"'").list();
			
			
			
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
    
}
