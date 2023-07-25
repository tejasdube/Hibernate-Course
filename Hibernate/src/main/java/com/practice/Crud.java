package com.practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Crud {

	public static Session getSession() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Emp.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;

	}

	public void insertData() {

		Session session = Crud.getSession();
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("tejas");
		Emp emp1 = new Emp();
		emp1.setId(2);
		emp1.setName("rahul");
		Emp emp2 = new Emp();
		emp2.setId(3);
		emp2.setName("harish");

		Transaction tx = session.beginTransaction();
		session.save(emp);
		session.save(emp1);
		session.save(emp2);
		tx.commit();
		session.close();

	}

	public void readData() {
		Session session = Crud.getSession();
		List<Emp> emp = session.createQuery("from Emp", Emp.class).list();

		for (Emp ele : emp) {
			System.out.println(ele);
		}

	}

	public void updateData() {

		Session session = Crud.getSession();
		Emp emp = session.get(Emp.class, 1);
		emp.setName("java");
		Transaction tx = session.beginTransaction();

		session.save(emp);
		tx.commit();

	}

	public void deleteData() {
		Session session = Crud.getSession();
		Emp emp = session.get(Emp.class, 4);
		session.delete(emp);
		Transaction tx = session.beginTransaction();
		tx.commit();

	}

}
