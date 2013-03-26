package cl.buildersoft.ibk.business.service.security;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.Antiphishing;
import cl.buildersoft.ibk.bean.User;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;

public interface SecurityService {
	public User validateUserId(HttpServletRequest request, String userId);

	public Antiphishing getAntiphishingInfo(HttpServletRequest request, User user);

	public void setAntiphishingInfo(HttpServletRequest request, String userId, Antiphishing antiphishing);

	public LoginStatusEnum validatePassword(HttpServletRequest request, String userId, String password);

	public String[] askSecurityQuestions(HttpServletRequest request, String userId);

	public Boolean answerSecurityQuestions(HttpServletRequest request, String userId, String[] asnwers);

}
