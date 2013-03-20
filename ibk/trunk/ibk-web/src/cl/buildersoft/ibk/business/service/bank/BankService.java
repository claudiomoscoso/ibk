package cl.buildersoft.ibk.business.service.bank;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Bank;
import cl.buildersoft.ibk.bean.Customer;

public interface BankService {
	public Bank getMainBank(HttpServletRequest request, Customer customer);

}
