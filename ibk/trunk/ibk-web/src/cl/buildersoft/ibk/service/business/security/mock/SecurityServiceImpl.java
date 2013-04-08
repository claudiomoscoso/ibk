package cl.buildersoft.ibk.service.business.security.mock;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Antiphishing;
import cl.buildersoft.ibk.bean.User;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;
import cl.buildersoft.ibk.service.business.AbstractMockService;
import cl.buildersoft.ibk.service.business.security.SecurityService;

public class SecurityServiceImpl extends AbstractMockService implements SecurityService {

	private final static String IMAGE = "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";

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
	public Antiphishing getAntiphishingInfo(HttpServletRequest request, User user) {
		waitService();
		Antiphishing out = new Antiphishing();
		out.setImage(IMAGE);
		out.setPhrase("Frase de prueba");
		out.setSession(request.getSession(false).getId());

		return out;
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
