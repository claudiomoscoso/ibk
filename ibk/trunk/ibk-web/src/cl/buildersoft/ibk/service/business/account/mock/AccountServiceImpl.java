package cl.buildersoft.ibk.service.business.account.mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.List;

import cl.buildersoft.framework.util.BSWeb;
import cl.buildersoft.ibk.bean.business.Account;
import cl.buildersoft.ibk.bean.business.Movement;
import cl.buildersoft.ibk.service.business.account.AccountService;

public class AccountServiceImpl implements AccountService {

	@Override
	public List<Movement> listMovement(Account account) {
		List<Movement> listOut = new ArrayList<Movement>();
		Currency currency = account.getCurrency();

		if (!currency.getCurrencyCode().equals("EUR")) {
			Movement m = null;
			for (int i = 0; i < 10; i++) {
				m = new Movement();
				m.setBalance(BigDecimal.valueOf(10.8));
				m.setChannel("WEB");
				m.setCredit(BigDecimal.ZERO);
				m.setDebit(BigDecimal.ONE);
				m.setDate(Calendar.getInstance());
				m.setDescription("Movimiento de cuenta");
				m.setKey(BSWeb.randomString());
				m.setNumber((long) i);
			}
		}
		return listOut;
	}

}
