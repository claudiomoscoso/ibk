package cl.buildersoft.ibk.business.service.security.mock;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Antiphishing;
import cl.buildersoft.ibk.business.service.security.SecurityService;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;

public class SecurityServiceImpl implements SecurityService {

	@Override
	public Boolean validateUserId(HttpServletRequest request, String user) {
		// LoginStatusEnum out = LoginStatusEnum.CORRECT;
		return Boolean.TRUE;
	}

	@Override
	public Antiphishing getAntiphishingInfo(HttpServletRequest request, String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginStatusEnum validatePassword(HttpServletRequest request, String userId, String password) {
		// TODO Auto-generated method stub
		return null;
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
