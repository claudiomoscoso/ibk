package cl.buildersoft.ibk.business.service.customer.mock;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Account;
import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.bean.Profile;
import cl.buildersoft.ibk.bean.User;
import cl.buildersoft.ibk.business.service.customer.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Account> listAccounts(HttpServletRequest request, Customer customer, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile getProfile(HttpServletRequest request, Customer customer, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPhoto(HttpServletRequest request, User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
