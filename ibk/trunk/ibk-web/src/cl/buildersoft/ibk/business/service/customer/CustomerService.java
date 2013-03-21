package cl.buildersoft.ibk.business.service.customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Account;
import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.bean.Profile;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;

public interface CustomerService {
	public Customer getBasicInformation(HttpServletRequest request, String userId);

	public List<Account> listAccounts(HttpServletRequest request, String userId);

	public Profile getProfile(HttpServletRequest request, String userId);

	public String getPhoto(HttpServletRequest request, String UserId);
}
