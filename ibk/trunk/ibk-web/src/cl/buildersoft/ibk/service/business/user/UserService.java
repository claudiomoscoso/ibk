package cl.buildersoft.ibk.service.business.user;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.business.Customer;
import cl.buildersoft.ibk.bean.business.User;

public interface UserService {
	public Customer getCustomer(HttpServletRequest request, User user);

	public void loadBasicInformation(HttpServletRequest request, User user);
}
