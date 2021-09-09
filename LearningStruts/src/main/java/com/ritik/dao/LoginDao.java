package com.ritik.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.exceptions.WrongArgumentException;
import com.ritik.config.MysqlConnection;
import com.ritik.general.GeneralClass;
import com.ritik.models.User;


public class LoginDao {
	
	public GeneralClass check(String username, String password) {
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
			Session session = sessionFactory.openSession();
			session.beginTransaction();
		
			//Class.forName("antlr.collections.AST").getResource("AST.class");

//	User user = 	(User)	session.get(User.class, "ufk");
//   System.out.println(user+"&&");
		Query query = session.createQuery("from User where username=? and password=?");
//		System.out.println("sdfadf");
		query.setString(0, username);
		query.setString(1, password);
//		System.out.println(query);
	User user =(User)query.uniqueResult();
	
	
			session.getTransaction().commit();
			session.close();
			if(user==null) {
			   return new GeneralClass(false, "User Does not Exist");
			}
			return new GeneralClass(true, "User Successfully Logged In");
		}catch (Exception e) {
			e.getStackTrace();
			return new GeneralClass(false, "Something went wrong");
		}
			
			
				
	}

}
