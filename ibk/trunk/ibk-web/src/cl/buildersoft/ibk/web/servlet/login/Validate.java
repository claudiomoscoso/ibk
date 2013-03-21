package cl.buildersoft.ibk.web.servlet.login;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.business.service.bank.BankService;
import cl.buildersoft.ibk.business.service.customer.CustomerService;
import cl.buildersoft.ibk.business.service.security.SecurityService;
import cl.buildersoft.ibk.util.BSFactory;

@WebServlet("/servlet/login/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 7612033656945225124L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");

		BSFactory factory = new BSFactory();
		ServletContext config = getServletContext();
		SecurityService securityService = factory.getSecurityService(config);

		Boolean status = securityService.validateUserId(request, user);

		String url = "";
		if (status.equals(Boolean.TRUE)) {
			HttpSession session = request.getSession(true);

			BankService bankService = factory.getBankService(config);
			CustomerService customerService = factory.getCustomerService(config);
			Customer customer = customerService.getBasicInformation(request, user);

			session.setAttribute("CustomerUser", customer);
			session.setAttribute("MainBank", bankService.getMainBank(request, customer));
			url = "/WEB-INF/jsp/main/main-page.jsp";

		}

		request.getRequestDispatcher(url).forward(request, response);
	}
}
