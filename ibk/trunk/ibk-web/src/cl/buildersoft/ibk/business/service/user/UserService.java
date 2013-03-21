package cl.buildersoft.ibk.business.service.user;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.bean.User;

public interface UserService {
	public Customer getCustomer(HttpServletRequest request, User user);
	public void loadBasicInformation (HttpServletRequest request, User user);
}
