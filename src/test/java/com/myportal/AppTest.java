package com.myportal;
import junit.framework.TestCase;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.myportal.dao.UserDao;
import com.myportal.model.AppUser;
import com.myportal.model.User;

public class AppTest {
	@Test
	public void testApp() {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		User user = new User();
		session.save(user);

		session.getTransaction().commit();
		session.close();
}
	
	@Test
	public void test2() {
		User user = new User();
		user.setName("Joao");
		user.setSurname("Maria");
		
		UserDao dao = new UserDao();
		
		dao.save(user);		
		
		List<User> a = dao.getAll(User.class);
	}
	
	
}