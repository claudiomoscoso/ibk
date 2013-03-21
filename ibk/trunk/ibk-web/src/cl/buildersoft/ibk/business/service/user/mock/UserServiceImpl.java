package cl.buildersoft.ibk.business.service.user.mock;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.framework.util.BSWeb;
import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.bean.User;
import cl.buildersoft.ibk.business.service.user.UserService;

public class UserServiceImpl implements UserService {
	@Override
	public void loadBasicInformation(HttpServletRequest request, User user) {

		user.setId(BSWeb.randomString());
		user.setLastLoginSuccess(Calendar.getInstance());
		Calendar lastLoginUnsuccessDate = Calendar.getInstance();
		lastLoginUnsuccessDate.add(Calendar.DAY_OF_WEEK, 3);
		user.setLastLoginUnsuccess(lastLoginUnsuccessDate);
		user.setName(getRandomName());

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
		Integer index = Integer.parseInt("" + number.charAt(number.length() - 3));
		return index;
	}

	@Override
	public Customer getCustomer(HttpServletRequest request, User user) {
		
		return null;
	}
}
