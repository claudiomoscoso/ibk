package cl.buildersoft.ibk.service.business.bank;

import java.util.List;

import cl.buildersoft.ibk.bean.business.Bank;
import cl.buildersoft.ibk.bean.business.Customer;
import cl.buildersoft.ibk.bean.business.Officer;
import cl.buildersoft.ibk.bean.business.Product;

public interface BankService {
	public Bank getMainBank(Customer customer);

	public Officer getOfficer(Customer customer);

	public List<Product> listProducts();

}
