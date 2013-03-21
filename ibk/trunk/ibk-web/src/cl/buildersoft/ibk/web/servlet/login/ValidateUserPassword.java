package cl.buildersoft.ibk.web.servlet.login;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.buildersoft.ibk.bean.User;
import cl.buildersoft.ibk.business.service.bank.BankService;
import cl.buildersoft.ibk.business.service.customer.CustomerService;
import cl.buildersoft.ibk.business.service.security.SecurityService;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;
import cl.buildersoft.ibk.util.BSFactory;

@WebServlet("/servlet/login/ValidateUserPassword")
public class ValidateUserPassword extends HttpServlet {

	private static final long serialVersionUID = 5937859167137968269L;

	public ValidateUserPassword() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("user");
		String password = request.getParameter("password");
		String url = "";

		BSFactory factory = new BSFactory();
		ServletContext config = request.getServletContext();
		SecurityService securityService = factory.getSecurityService(config);

		User user = securityService.validateUserId(request, userId);

		if (user != null) {
			LoginStatusEnum loginStatus = securityService.validatePassword(request, userId, password);

			if (loginStatus.equals(LoginStatusEnum.CORRECT)) {
				HttpSession session = request.getSession(true);

				BankService bankService = factory.getBankService(config);
				CustomerService customerService = factory.getCustomerService(config);

//				Customer customer = customerService.getBasicInformation(request, userId);

				session.setAttribute("Customer", null);
				session.setAttribute("User", user);
				session.setAttribute("MainBank", bankService.getMainBank(request, null));
				url = "/WEB-INF/jsp/main/main-page.jsp";
			}

		}

		request.getRequestDispatcher(url).forward(request, response);

	}

}
