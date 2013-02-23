package cl.buildersoft.ibk.business.service;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
	public LoginStatusEnum validate(HttpServletRequest request,  String user, String password);
//	public void 
}
