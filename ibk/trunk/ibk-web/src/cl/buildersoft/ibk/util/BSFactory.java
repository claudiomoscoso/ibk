package cl.buildersoft.ibk.util;

import javax.servlet.ServletContext;

import cl.buildersoft.framework.exception.BSConfigurationException;
import cl.buildersoft.ibk.business.service.bank.BankService;
import cl.buildersoft.ibk.business.service.customer.CustomerService;

public class BSFactory {

	public BankService getBankService(ServletContext context) {
		BankService out = (BankService) getService(context, "Bank");

		return out;
	}

	public CustomerService getCustomerService(ServletContext context) {
		return (CustomerService) getService(context, "Customer");
		/**
		 * <code>
		String coreName = context.getInitParameter("cl.buildersoft.ibk.core.name");

		String className = "cl.buildersoft.ibk.business.service" + ".customer." + coreName + ".CustomerServiceImpl";
		CustomerService out = null;
		Object obj = null;
		try {
			obj = Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new BSConfigurationException(e);
		}
		out = (CustomerService) obj;

		return out;
		</code>
		 */
	}

	private Object getService(ServletContext context, String serviceName) {
		String coreName = context.getInitParameter("cl.buildersoft.ibk.core.name");

		// String className = "cl.buildersoft.ibk.business.service." +
		// serviceName.toLowerCase() + "." + coreName + "." + serviceName +
		// "ServiceImpl";
		String className = String.format("cl.buildersoft.ibk.business.service.%s.%s.%sServiceImpl", serviceName.toLowerCase(),
				coreName, serviceName);

		// CustomerService out = null;
		Object out = null;
		try {
			out = Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new BSConfigurationException(e);
		}
		// out = (CustomerService) obj;
		return out;
	}

}
