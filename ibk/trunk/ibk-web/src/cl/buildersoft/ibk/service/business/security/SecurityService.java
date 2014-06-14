package cl.buildersoft.ibk.service.business.security;

import cl.buildersoft.ibk.bean.business.Antiphishing;
import cl.buildersoft.ibk.bean.business.User;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;

public interface SecurityService {
	public User validateUserId(String userId);

	public Antiphishing getAntiphishingInfo(User user);

	public void setAntiphishingInfo(String userId, Antiphishing antiphishing);

	public LoginStatusEnum validatePassword(String userId, String password);

	public String[] askSecurityQuestions(String userId);

	public Boolean answerSecurityQuestions(String userId, String[] asnwers);

}
