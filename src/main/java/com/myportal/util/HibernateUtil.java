package com.myportal.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	 static
	 {
	  try
	  {
	   sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	  }
	  catch(Throwable th){
	   System.err.println("Enitial SessionFactory creation failed"+th);
	   throw new ExceptionInInitializerError(th);
	  }
	   }
	   public static SessionFactory getSessionFactory(){
	    return sessionFactory;
	   }

}
