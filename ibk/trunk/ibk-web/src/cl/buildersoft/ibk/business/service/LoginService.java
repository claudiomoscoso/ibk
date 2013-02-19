package cl.buildersoft.ibk.business.service;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
	public Boolean validate(HttpServletRequest request,  String user, String password);
	
}
