package com.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Students.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

//		Students st=new Students(1, "tejas", "pune");
//		Students st1=new Students(2, "harish", "pune");

//		Transaction tx=session.beginTransaction();
//		session.save(st);
//		session.save(st1);
//		tx.commit();

//		Query q=session.createQuery("from Students", Students.class);
//		List<Students>list=q.list();
//		for(Students std:list) {
//			System.out.println(std);
//		}
		
		
		
	Query q=session.createQuery("from Students where id=1");
	System.out.println(q.uniqueResult());
		
		
	
        
		session.close();
		factory.close();

	}

}
