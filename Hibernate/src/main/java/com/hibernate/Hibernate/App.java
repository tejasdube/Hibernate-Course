package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    Configuration cfg=new Configuration();
    cfg.configure().addAnnotatedClass(Student.class);
    
    SessionFactory factory=cfg.buildSessionFactory();
    
    Student st=new Student();
    st.setId(1);
    st.setName("tejas");
    st.setPass("dube");
    Session session=factory.openSession();
    
    Transaction tx=session.beginTransaction();
    
    session.save(st);
    tx.commit();
    session.close();
    
    
   
      
    }
}
