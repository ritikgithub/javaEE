package com.ritik.actionForms;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {
	
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String myString;
	
	public String getMyString() {
		return myString;
	}
	@Override
	public String toString() {
		return "LoginForm [username=" + username + ", password=" + password + ", myString=" + myString + "]";
	}
	public void setMyString(String myString) {
		this.myString = myString;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
