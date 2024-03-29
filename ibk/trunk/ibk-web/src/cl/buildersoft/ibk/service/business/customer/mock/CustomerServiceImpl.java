package cl.buildersoft.ibk.service.business.customer.mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.business.Account;
import cl.buildersoft.ibk.bean.business.Customer;
import cl.buildersoft.ibk.bean.business.Product;
import cl.buildersoft.ibk.bean.business.Profile;
import cl.buildersoft.ibk.bean.business.User;
import cl.buildersoft.ibk.service.business.bank.BankService;
import cl.buildersoft.ibk.service.business.bank.mock.BankServiceImpl;
import cl.buildersoft.ibk.service.business.customer.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Account> listAccounts(Customer customer, User user) {
		BankService bankService = new BankServiceImpl();
		List<Product> products = bankService.listProducts();

		Integer idAccount = 191;

		List<Account> accounts = new ArrayList<Account>();
		Account account = new Account();
		for (Product product : products) {
			for (int i = 0; i < 5; i++) {
				account = new Account();
				// account.setBalance(BigDecimal.ZERO);
				account.setCurrency(getCurrency(i));
				String acctNumber = getAcctNumber(i);

				// account.setNumber(""+idAccount++);
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
	public Profile getProfile(Customer customer, User user) {
		Profile profile = new Profile();
		profile.setKey("098");
		profile.setName("Perfil por omisión");
		return profile;
	}

	@Override
	public String getPhoto(User user) {
		return "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";
	}

}
