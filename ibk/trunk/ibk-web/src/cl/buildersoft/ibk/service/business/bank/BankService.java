package cl.buildersoft.ibk.service.business.bank;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.business.Bank;
import cl.buildersoft.ibk.bean.business.Customer;
import cl.buildersoft.ibk.bean.business.Officer;
import cl.buildersoft.ibk.bean.business.Product;

public interface BankService {
	public Bank getMainBank(HttpServletRequest request, Customer customer);

	public Officer getOfficer(HttpServletRequest request, Customer customer);
	
	public List<Product> listProducts(HttpServletRequest request);
	
}
