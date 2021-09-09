package com.ritik.actions;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ritik.actionForms.RegisterForm;

import com.ritik.dao.RegisterDao;
import com.ritik.general.GeneralClass;

public class RegisterAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		RegisterForm myForm = (RegisterForm) form;
		String name = myForm.getName();
		String username = myForm.getUsername();
		String password = myForm.getPassword();
		System.out.println(myForm);
		GeneralClass obj = new RegisterDao().registerUser(username, name, password);
		if(obj.getStatus()) {
			request.setAttribute("username", username);
			return mapping.findForward("success");
		}
		else {
		    request.setAttribute("error", obj.getMessage());
			return mapping.findForward("failure");
		}
		
	}
}
