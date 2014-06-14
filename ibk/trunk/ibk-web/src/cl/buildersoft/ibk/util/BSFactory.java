package cl.buildersoft.ibk.util;

import javax.servlet.ServletContext;

import cl.buildersoft.ibk.service.business.bank.BankService;
import cl.buildersoft.ibk.service.business.bank.mock.BankServiceImpl;
import cl.buildersoft.ibk.service.business.customer.CustomerService;
import cl.buildersoft.ibk.service.business.customer.mock.CustomerServiceImpl;
import cl.buildersoft.ibk.service.business.security.SecurityService;
import cl.buildersoft.ibk.service.business.security.mock.SecurityServiceImpl;
import cl.buildersoft.ibk.service.business.user.UserService;
import cl.buildersoft.ibk.service.business.user.mock.UserServiceImpl;
import cl.buildersoft.ibk.service.plataform.config.ConfigService;
import cl.buildersoft.ibk.service.plataform.config.database.ConfigServiceImpl;

public class BSFactory {

	public BankService getBankService(ServletContext context) {
		return new BankServiceImpl();
		// return (BankService) getService(context, "Bank");
	}

	public CustomerService getCustomerService(ServletContext context) {
		return new CustomerServiceImpl();
		// return (CustomerService) getService(context, "Customer");
	}

	public SecurityService getSecurityService(ServletContext context) {
		return new SecurityServiceImpl();
		// return (SecurityService) getService(context, "Security");
	}

	public UserService getUserService(ServletContext context) {
		return new UserServiceImpl();
		// return (UserService) getService(context, "User");
	}

	public ConfigService getConfigService(ServletContext context){
		return new ConfigServiceImpl();
	}
	/**<code>
	private Object getService(ServletContext context, String serviceName) {
		String coreName = (String) context.getAttribute("cl.buildersoft.ibk.core.name");
	
		String className = String.format("cl.buildersoft.ibk.business.service.%s.%s.%sServiceImpl", serviceName.toLowerCase(),
				coreName, serviceName);

		Object out = null;
		try {
			out = Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new BSConfigurationException(e);
		}

		return out;
	}</code>*/

}
