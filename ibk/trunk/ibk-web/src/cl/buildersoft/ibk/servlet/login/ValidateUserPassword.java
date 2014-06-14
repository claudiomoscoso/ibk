package cl.buildersoft.ibk.servlet.login;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.buildersoft.ibk.bean.business.Customer;
import cl.buildersoft.ibk.bean.business.User;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;
import cl.buildersoft.ibk.service.business.security.SecurityService;
import cl.buildersoft.ibk.service.business.user.UserService;
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
		String url = "/";

		BSFactory factory = new BSFactory();
		ServletContext config = request.getServletContext();
		SecurityService securityService = factory.getSecurityService(config);

		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("User");

		if (user == null) {
			user = securityService.validateUserId(request, userId);
		}

		if (user != null) {
			LoginStatusEnum loginStatus = securityService.validatePassword(request, userId, password);

			if (loginStatus.equals(LoginStatusEnum.CORRECT)) {
				session = request.getSession(true);

				if (user.getCustomer() == null) {
					UserService userService = factory.getUserService(config);
					Customer customer = userService.getCustomer(request, user);
					user.setCustomer(customer);
				}

				session.setAttribute("User", user);

				url = "/WEB-INF/jsp/login/main.jsp";
			} else if (loginStatus.equals(LoginStatusEnum.INCORRECT)) {
				url = "/WEB-INF/jsp/login/fail.jsp";
			}

		} else {
			url = "/WEB-INF/jsp/login/not-found.jsp";
		}

		request.getRequestDispatcher(url).forward(request, response);

	}

}
