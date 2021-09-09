package com.ritik.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ritik.models.Student;

public class App3 {

	public static void main(String[] args) {

		SessionFactory sf = 	new Configuration().configure().buildSessionFactory();
		Session session =  sf.openSession();
		
		Transaction tx =  session.beginTransaction();
		
		
		Student s1 = (Student) session.get(Student.class, 1);
		System.out.println("dnlsknlkn");
		System.out.println(s1);
		
		tx.commit();
		session.close();
		

	}

}
