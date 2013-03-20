package cl.buildersoft.ibk.business.service.customer;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;

public interface CustomerService {
	public LoginStatusEnum validate(HttpServletRequest request, String user, String password);

	public Customer getBasicInformation(HttpServletRequest request, String user);


}
