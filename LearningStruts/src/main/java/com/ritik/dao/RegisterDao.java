package com.ritik.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ritik.config.MysqlConnection;
import com.ritik.general.GeneralClass;
import com.ritik.models.User;

public class RegisterDao {
	public GeneralClass registerUser(String username, String name, String password) {

		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setUsername(username);
		try {
			SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();

			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			return new GeneralClass(true, "User Registered Successfully");
		} catch (Exception e) {
			System.out.println("dlfkn");
			e.getStackTrace();
			System.out.println("KJNKNkn");
			return new GeneralClass(false,e.getMessage());
		}

	

//		try {
//		Connection con = MysqlConnection.getConnection();
//		if(con!=null) {
//		PreparedStatement statement =  con.prepareStatement("insert into users values(?,?,?)");
//		statement.setString(1, username);
//		statement.setString(2, name);
//		statement.setString(3, password);	
//		statement.execute();
//		return new GeneralClass(true, "User Registerd Successfully");
//		}
//		else {
//			System.out.println("Connection cant be stablized");
//			return new GeneralClass(false, "Connection Cant be established");
//		}
//	}
//		 catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return new GeneralClass(false,e.getMessage());
//		}
//		

	}
}
