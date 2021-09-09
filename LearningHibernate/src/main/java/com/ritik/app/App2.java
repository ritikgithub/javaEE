package com.ritik.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ritik.models.Laptop;
import com.ritik.models.Student;



public class App2 {

	public static void main(String[] args) {
		
	Laptop lp1 = new Laptop();
	Student stud1 = new Student();
	
	stud1.setRollno(1);
	stud1.setName("Ritik");
	
	lp1.setLid(1);
	lp1.setLapt_name("Dell");
	
	stud1.getLaptops().add(lp1);
//	lp1.getStudents().add(stud1);
	
	SessionFactory sf = 	new Configuration().configure().buildSessionFactory();
	Session session =  sf.openSession();
	
	Transaction tx =  session.beginTransaction();
	
	
	session.save(stud1);
	
	
	tx.commit();
	session.close();
	

	}

}
