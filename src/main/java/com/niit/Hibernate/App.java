package com.niit.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.niit.Hibernate.model.Employee;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Employee e = new Employee();

		e.setEmpname("deepansuriyaa");
		e.setEmpdest("coimbatore");
		Session s = sessionFactory.openSession();
		Transaction txt = s.beginTransaction();
		s.save(e);
		txt.commit();
		s.close();
		sessionFactory.close();
	}
}
