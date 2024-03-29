package cl.buildersoft.ibk.servlet.home;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.buildersoft.ibk.bean.business.Antiphishing;
import cl.buildersoft.ibk.bean.business.User;
import cl.buildersoft.ibk.service.business.security.SecurityService;
import cl.buildersoft.ibk.service.business.user.UserService;
import cl.buildersoft.ibk.servlet.util.HttpServletAjax;
import cl.buildersoft.ibk.util.BSFactory;

@WebServlet("/servlet/main/LoadUserInfo")
public class LoadUserInfo extends HttpServletAjax {
	private static final long serialVersionUID = -1840999424221143352L;

	public LoadUserInfo() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext config = request.getServletContext();
		HttpSession session = request.getSession(false);

		User user = (User) session.getAttribute("User");
		BSFactory factory = new BSFactory();

		if (!userFilled(user)) {
			UserService userService = factory.getUserService(config);
			userService.loadBasicInformation(user);

			session.setAttribute("User", user);

		}

		Antiphishing antiphishing = (Antiphishing) session.getAttribute("Antiphishing");
		if (antiphishing == null) {
			SecurityService securityService = factory.getSecurityService(config);
			antiphishing = securityService.getAntiphishingInfo(user);

			session.setAttribute("Antiphishing", antiphishing);
		}
		request.getRequestDispatcher("/WEB-INF/jsp/login/user-info.jsp").forward(request, response);

	}

	private boolean userFilled(User user) {
		return user.getEmail() != null;
	}

}
