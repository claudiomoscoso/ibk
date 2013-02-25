package cl.buildersoft.ibk.business.service.login.mock;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.framework.util.BSWeb;
import cl.buildersoft.ibk.bean.Bank;
import cl.buildersoft.ibk.bean.CustomerUser;
import cl.buildersoft.ibk.business.service.login.LoginService;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;

public class LoginServiceImpl implements LoginService {

	@Override
	public LoginStatusEnum validate(HttpServletRequest request, String user, String password) {
		LoginStatusEnum out = LoginStatusEnum.CORRECT;
		return out;
	}

	@Override
	public Bank getMainBank(HttpServletRequest request) {
Bank mainBank = new Bank();
mainBank.setLogo("");
mainBank.setName("Banco Independiente Mock");
		return mainBank;
	}

	@Override
	public CustomerUser getCustomerUser(HttpServletRequest request, String user) {
		CustomerUser out = new CustomerUser();

		out.setId(BSWeb.randomString());
		out.setLastLoginSuccess(Calendar.getInstance());
		out.setName(getRandomName());

		return out;
	}

	private String getRandomName() {
		String names[] = { "Juan Carlos Arancibia Hernandez", "José Hernesto Lopez Soto", "Miguel Angel Perez Lopez",
				"Katherine Nicole Hernandez Rojas", "Gabriela Mariana Castillo Strange", "Veronica Viviana Solis Rojas",
				"Valentina Amanda Nuñez Bravo", "Julio Eduardo Cerda Lopez", "Oscar Mauricio Jimenez Vega",
				"Raquel del Carmen Valdez Sandoval" };

		return names[number0to9()];
	}

	private Integer number0to9() {
		String number = "" + System.currentTimeMillis();
		Integer index = Integer.parseInt("" + number.charAt(number.length() - 1));
		return index;
	}

}
