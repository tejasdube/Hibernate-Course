package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Emp.class);
		cfg.configure().addAnnotatedClass(Address.class);
		
		SessionFactory factory =cfg.buildSessionFactory();
		Session session=factory.openSession();
		Address ad=new Address();
		ad.setId(201);
		ad.setAddressType("local");
		ad.setAddresss("pune");
		Address ad1=new Address();
		ad1.setId(202);
		ad1.setAddressType("Rural");
		ad1.setAddresss("Mumabi");
		
		List<Address>list=new ArrayList<>();
		list.add(ad);
		list.add(ad1);
		
		Emp emp=new Emp();
		emp.setId(1);
		emp.setName("tejas");
		emp.setAddresses(list);
		
		Transaction tx=session.beginTransaction();
		session.save(emp);
		session.save(ad);
		session.save(ad1);
		
		tx.commit();
		factory.close();
		
		
		
		
		
		
	}

}
