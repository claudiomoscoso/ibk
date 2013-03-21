package cl.buildersoft.ibk.util;

import javax.servlet.ServletContext;

import cl.buildersoft.framework.exception.BSConfigurationException;
import cl.buildersoft.ibk.business.service.bank.BankService;
import cl.buildersoft.ibk.business.service.customer.CustomerService;
import cl.buildersoft.ibk.business.service.security.SecurityService;

public class BSFactory {

	public BankService getBankService(ServletContext context) {
		BankService out = (BankService) getService(context, "Bank");
		return out;
	}

	public CustomerService getCustomerService(ServletContext context) {
		return (CustomerService) getService(context, "Customer");
	}

	public SecurityService getSecurityService(ServletContext context) {
		return (SecurityService) getService(context, "Security");
	}

	private Object getService(ServletContext context, String serviceName) {
		String coreName =  (String)context.getAttribute("cl.buildersoft.ibk.core.name");
//		String coreName = context.getInitParameter("cl.buildersoft.ibk.core.name");

		String className = String.format("cl.buildersoft.ibk.business.service.%s.%s.%sServiceImpl", serviceName.toLowerCase(),
				coreName, serviceName);

		Object out = null;
		try {
			out = Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new BSConfigurationException(e);
		}

		return out;
	}

}
