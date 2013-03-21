package cl.buildersoft.ibk.business.service.customer.mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Account;
import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.bean.Product;
import cl.buildersoft.ibk.bean.Profile;
import cl.buildersoft.ibk.bean.User;
import cl.buildersoft.ibk.business.service.bank.BankService;
import cl.buildersoft.ibk.business.service.bank.mock.BankServiceImpl;
import cl.buildersoft.ibk.business.service.customer.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Account> listAccounts(HttpServletRequest request, Customer customer, User user) {
		BankService bankService = new BankServiceImpl();
		List<Product> products = bankService.listProducts(request);

		Integer idAccount = 191;

		List<Account> accounts = new ArrayList<Account>();
		Account account = new Account();
		for (Product product : products) {
			for (int i = 0; i < 5; i++) {
				account = new Account();
				account.setBalance(BigDecimal.ZERO);
				account.setCurrency(getCurrency(i));
				String acctNumber = getAcctNumber(i);

				account.setId(idAccount++);
				account.setNumber(acctNumber);
				account.setMask(createString(acctNumber.length() - 4, '*') + acctNumber.substring(acctNumber.length() - 4));
				account.setProduct(product);

			}
		}

		return accounts;
	}

	public String createString(int length, char ch) {
		char[] chars = new char[length];
		Arrays.fill(chars, ch);
		return new String(chars);
	}

	private String getAcctNumber(int i) {
		double r = Math.random() * i;
		Long l = (long) r * 1000000000;
		return "" + l;
	}

	private Currency getCurrency(int i) {
		String currencyCode = null;
		switch (i) {
		case 0:
			currencyCode = "EUR";
			break;
		case 1:
			currencyCode = "CLP";
			break;
		case 2:
			currencyCode = "USD";
			break;
		case 3:
			currencyCode = "CLU";
			break;
		case 4:
			currencyCode = "CLF";
			break;
		default:
			break;
		}

		return Currency.getInstance(currencyCode);
	}

	@Override
	public Profile getProfile(HttpServletRequest request, Customer customer, User user) {
		Profile profile = new Profile();
		profile.setKey("098");
		profile.setName("Perfil por omisión");
		return profile;
	}

	@Override
	public String getPhoto(HttpServletRequest request, User user) {
		
		return null;
	}

}
