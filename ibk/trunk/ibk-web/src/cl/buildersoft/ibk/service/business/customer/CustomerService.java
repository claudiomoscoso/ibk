package cl.buildersoft.ibk.service.business.customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.business.Account;
import cl.buildersoft.ibk.bean.business.Customer;
import cl.buildersoft.ibk.bean.business.Profile;
import cl.buildersoft.ibk.bean.business.User;

public interface CustomerService {
//	public Customer getBasicInformation(HttpServletRequest request, User user);

	public List<Account> listAccounts(HttpServletRequest request, Customer customer, User user);

	public Profile getProfile(HttpServletRequest request, Customer customer, User user);

	public String getPhoto(HttpServletRequest request, User user);
}
