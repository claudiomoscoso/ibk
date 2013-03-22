package cl.buildersoft.ibk.business.service.security.mock;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Antiphishing;
import cl.buildersoft.ibk.bean.User;
import cl.buildersoft.ibk.business.service.security.SecurityService;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;

public class SecurityServiceImpl implements SecurityService {

	@Override
	public User validateUserId(HttpServletRequest request, String userId) {
		User user = null;

		if (userId.length() > 0) {
			user = new User();
			user.setId(userId);
		}
		return user;
	}

	@Override
	public Antiphishing getAntiphishingInfo(HttpServletRequest request, String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginStatusEnum validatePassword(HttpServletRequest request, String userId, String password) {
		LoginStatusEnum out = null;
		if (userId.equals(password)) {
			out = LoginStatusEnum.CORRECT;
		} else {
			out = LoginStatusEnum.INCORRECT;
		}

		return out;
	}

	@Override
	public String[] askSecurityQuestions(HttpServletRequest request, String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean answerSecurityQuestions(HttpServletRequest request, String userId, String[] asnwers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAntiphishingInfo(HttpServletRequest request, String userId, Antiphishing antiphishing) {
		// TODO Auto-generated method stub

	}

}
