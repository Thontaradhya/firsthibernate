package com.techxyte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		users u=new users();
		
		u.setName("aradhya");
		u.setCity("tumkur");
		u.setState("karnataka");
		
		session.save(u);
		tx.commit();
		System.out.println("Successfully submited");
		factory.close();
		session.close();
		

	}

}
