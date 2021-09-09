package com.ritik.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.ritik.config.MysqlConnection;
import com.ritik.model.User;


public class GetUserDao {
	public User getUser (String username) {
		Connection connection = new MysqlConnection().getConnection();
		if(connection==null) {
			System.out.println("Connection cant be established");
			return null;
		}
		try {
			PreparedStatement statement =  connection.prepareStatement("select * from Users where username = ?");
			statement.setString(1, username);
			ResultSet rSet =  statement.executeQuery();
			if(rSet.next()) {
				String name =  rSet.getString("name");
				String usernamee =  rSet.getString("username");
				return new User(name,usernamee,null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return null;
		
	}
}
