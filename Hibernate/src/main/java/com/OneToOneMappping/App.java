package com.OneToOneMappping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Address.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Address ad = new Address();
		ad.setId(301);
		ad.setAddress("pune");

		Employee emp = new Employee();
		emp.setId(201);
		emp.setName("tejas");
		emp.setAddress(ad);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	    session.save(emp);
		session.save(ad);
		
	// get emp address by id	
//	Employee emp=session.get(Employee.class, 201);
//	System.out.println(emp.getName());
//	System.out.println(emp.getAddress().getAddress());
		tx.commit();

		factory.close();

	}

}
