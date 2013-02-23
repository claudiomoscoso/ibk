package cl.buildersoft.ibk.util;

import javax.servlet.ServletContext;

import cl.buildersoft.framework.exception.BSConfigurationException;
import cl.buildersoft.ibk.business.service.login.LoginService;

public class BSFactory {
	public LoginService getLoginService(ServletContext context) {
		String coreName = context.getInitParameter("cl.buildersoft.ibk.core.name");

		String className = "cl.buildersoft.ibk.business.service" + ".login." + coreName + ".LoginServiceImpl";
		LoginService out = null;
		Object obj = null;
		try {
			obj = Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new BSConfigurationException(e);
		}
		out = (LoginService) obj;

		return out;
	}

}
