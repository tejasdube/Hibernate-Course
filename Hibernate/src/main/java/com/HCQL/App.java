package com.HCQL;
// HCQL = hibernate criteria query language

// in that lang we can not write queries 
// createCriteria method have all methods
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Students.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

//		List<Students> list = session.createQuery("from Students", Students.class).list();
//		for (Students ele : list) {
//			System.out.println(ele);
//		}

		Criteria cr = session.createCriteria(Students.class);
		//cr.add(Restrictions.gt("salary", 1000));
		//cr.add(Restrictions.lt("salary", 4000));
	
		cr.add(Restrictions.between("salary", 4, 7));
		List<Students>list=cr.list();
		for(Students ele:list) {
			System.out.println(ele);
		}

	}

}
