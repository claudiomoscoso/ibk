package cl.buildersoft.ibk.service.business.bank;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Bank;
import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.bean.Officer;
import cl.buildersoft.ibk.bean.Product;

public interface BankService {
	public Bank getMainBank(HttpServletRequest request, Customer customer);

	public Officer getOfficer(HttpServletRequest request, Customer customer);
	
	public List<Product> listProducts(HttpServletRequest request);
	
}
