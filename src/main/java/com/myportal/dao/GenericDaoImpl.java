package com.myportal.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.myportal.util.HibernateUtil;

public class GenericDaoImpl<T> implements GenericDao<T>{

	@Override
	public Optional<T> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll(Class t) {
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  
		  List<T> users = session.createQuery("from " + t.getClass()).list();
		  return users;		  
	}
	
	public T getUserById(long id, T t) {
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();		  
		  t = (T) session.get(t.getClass(), id);
		  
		  return t;
	}

	@Override
	public void save(T t) {
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.save(t);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();		
	}

	@Override
	public void update(T t) {
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.update(t);
		  System.out.println("Upated Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();
		
	}

	@Override
	public void delete(T t) {
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.delete(t);;
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();		
	}

}
