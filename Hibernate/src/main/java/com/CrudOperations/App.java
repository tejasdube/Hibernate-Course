package com.CrudOperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Students.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
//		<<<< create a data >>>>

//		Students st=new Students();
//		st.setId(1);
//		st.setName("tejas");
//		st.setEmail("tejas@.com");
//		st.setCollegeName("trinity");
//		
//		Students st1=new Students();
//		st1.setId(2);
//		st1.setName("dube");
//		st1.setEmail("dube@.com");
//		st1.setCollegeName("kj");
//		Transaction tx=session.beginTransaction();
//		
//		session.save(st);
//		session.save(st1);
//		tx.commit();
//		System.out.println("Student register succesfully ");

		// get by id

//		Students students=session.get(Students.class, 1);
//		System.out.println(students);

		// read a data

//		List<Students> list = session.createQuery("from Students", Students.class).list();
//		for (Students ele : list) {
//			System.out.println(ele);
//		}

		// update a data in database
//
//		Students st = session.get(Students.class, 1);
//		st.setCollegeName("tae");
//		st.setEmail("xyz@");
//		st.setName("harish");
//
//		Transaction tx = session.beginTransaction();
//		session.save(st);
//		tx.commit();
//
//		System.out.println("Update succesfully");
//

		// delete record from the table

		Students st = session.get(Students.class, 1);

		Transaction tx = session.beginTransaction();
		session.delete(st);
		tx.commit();

		System.out.println("deleted succesfully");

		session.close();
		factory.close();

	}

}
