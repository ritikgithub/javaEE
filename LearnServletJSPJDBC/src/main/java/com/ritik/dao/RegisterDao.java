package com.ritik.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import com.ritik.config.MysqlConnection;


public class RegisterDao {
	public boolean registerUser(String username,String name, String password) {
		try {
		Connection con = MysqlConnection.getConnection();
		if(con!=null) {
		PreparedStatement statement =  con.prepareStatement("insert into users values(?,?,?)");
		statement.setString(1, username);
		statement.setString(2, name);
		statement.setString(3, password);	
		statement.execute();
		return true;
		}
		else {
			System.out.println("Connection cant be stablized");
			return false;
		}
	}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
}
