
package com.ritik.actionForms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class RegisterForm extends ActionForm {
	
	@Override
	public String toString() {
		return "RegisterForm [name=" + name + ", username=" + username + ", password=" + password + "]";
	}

	private static final long serialVersionUID = 1L;
	private String name;
	private String username;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if(name.length()<1 || name==null) {
			errors.add("name", new ActionMessage("error.name.required"));
		}
		if(username.length()<1 || username==null) {
			errors.add("username", new ActionMessage("error.username.required"));
		}
		if(password.length()<1 || password==null) {
			errors.add("password", new ActionMessage("error.password.required"));
		}
		return errors;
	}

}
