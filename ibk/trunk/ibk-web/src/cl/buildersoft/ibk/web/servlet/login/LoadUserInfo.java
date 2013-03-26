package cl.buildersoft.ibk.web.servlet.login;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.buildersoft.ibk.bean.Antiphishing;
import cl.buildersoft.ibk.bean.User;
import cl.buildersoft.ibk.business.service.security.SecurityService;
import cl.buildersoft.ibk.business.service.user.UserService;
import cl.buildersoft.ibk.util.BSFactory;
import cl.buildersoft.ibk.web.servlet.HttpServletAjax;

/**
 * Servlet implementation class LoadBankInfo
 */
@WebServlet("/servlet/login/LoadUserInfo")
public class LoadUserInfo extends HttpServletAjax {
	private static final long serialVersionUID = -1840999424221143352L;

	public LoadUserInfo() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext config = request.getServletContext();
		HttpSession session = request.getSession(false);

		BSFactory factory = new BSFactory();
		SecurityService securityService = factory.getSecurityService(config);
		UserService userService = factory.getUserService(config);

		User user = (User) session.getAttribute("User");

		userService.loadBasicInformation(request, user);
		Antiphishing antiphishing = securityService.getAntiphishingInfo(request, user);

		request.setAttribute("Antiphishing", antiphishing);
		session.setAttribute("User", user);
		// session.setAttribute("Bank", bank);

		// HttpSession session = request.getSession(false);
		// Bank bank =(Bank) session.getAttribute("Bank");

		request.getRequestDispatcher("/WEB-INF/jsp/login/user-info.jsp").forward(request, response);

	}

}
