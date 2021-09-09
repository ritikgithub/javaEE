package com.ritik.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.ritik.config.MysqlConnection;
import com.ritik.general.GeneralClass;


public class LoginDao {
	
	public GeneralClass check(String username, String password) {
		Connection connection = MysqlConnection.getConnection();
		try {
			if(connection!=null) {
				String query = "Select * from users where username='" + username + "' and password='"+ password+"'";
				Statement statement = connection.createStatement();
				ResultSet rSet = statement.executeQuery(query);
				if(rSet.next()) {
					return new GeneralClass(true, "User Successfully Registered");
				}
				else {
					return new GeneralClass(false, "User Does not Exist");
				}
				
			}
			else {
				throw new Exception("Connection does not establish");
			}
		} catch (Exception e) {
			System.out.println(e);
			return new GeneralClass(false, "Something Went Wrong");
		}
		
	}

}
