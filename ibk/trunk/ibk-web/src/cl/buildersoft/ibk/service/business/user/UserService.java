package cl.buildersoft.ibk.service.business.user;

import cl.buildersoft.ibk.bean.business.Customer;
import cl.buildersoft.ibk.bean.business.User;

public interface UserService {
	public Customer getCustomer(User user);

	public void loadBasicInformation(User user);
}
