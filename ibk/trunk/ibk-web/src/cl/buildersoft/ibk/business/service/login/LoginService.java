package cl.buildersoft.ibk.business.service.login;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Bank;
import cl.buildersoft.ibk.bean.CustomerUser;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;

public interface LoginService {
	public LoginStatusEnum validate(HttpServletRequest request, String user, String password);

	public CustomerUser getCustomerUser(HttpServletRequest request, String user);

	public Bank getMainBank(HttpServletRequest request);

}
