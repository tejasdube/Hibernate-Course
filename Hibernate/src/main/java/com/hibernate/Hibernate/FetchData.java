package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.buildSessionFactory();

		Session session=factory.openSession();
		// fetch data from database we can use  get method or load method
		Student st=session.get(Student.class, 30);
		System.out.println(st);
		
	}

}
