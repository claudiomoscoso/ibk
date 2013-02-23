package cl.buildersoft.ibk.business.service.login.mock;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Bank;
import cl.buildersoft.ibk.bean.CustomerUser;
import cl.buildersoft.ibk.business.service.login.LoginService;
import cl.buildersoft.ibk.business.service.login.LoginStatusEnum;

public class LoginServiceImpl implements LoginService {

	@Override
	public LoginStatusEnum validate(HttpServletRequest request, String user, String password) {
		LoginStatusEnum out = LoginStatusEnum.CORRECT;
		return out;
	}

	@Override
	public Bank getMainBank(HttpServletRequest request) {

		return null;
	}

	@Override
	public CustomerUser getUser(HttpServletRequest request, String user) {
		
		return null;
	}

}
