package com.ritik.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ritik.actionForms.LoginForm;
import com.ritik.dao.LoginDao;
import com.ritik.general.GeneralClass;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm myForm = (LoginForm) form;
	System.out.println(myForm);
		GeneralClass obj = new LoginDao().check(myForm.getUsername(), myForm.getPassword());
		if(obj.getStatus()) {
		//	myForm.setMyString("masn");
//			response.setHeader("Cache-Control", "no-cache");
			return mapping.findForward("success");
		}
		else {
			request.setAttribute("error", obj);

			return mapping.findForward("failure");
		}
		
	}

}
