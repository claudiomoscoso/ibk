package cl.buildersoft.ibk.web.servlet.login;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.buildersoft.ibk.business.service.login.LoginService;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;
import cl.buildersoft.ibk.util.BSFactory;

@WebServlet("/servlet/login/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 7612033656945225124L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");

		BSFactory factory = new BSFactory();
		ServletContext config = getServletContext();
		LoginService service = factory.getLoginService(config);

		LoginStatusEnum status = service.validate(request, user, password);

		if (status.equals(LoginStatusEnum.CORRECT)) {
			HttpSession session = request.getSession(true);
			
			session.setAttribute("CustomerUser", service.getCustomerUser(request, user));
			session.setAttribute("MainBank", service.getMainBank(request));

		}

		request.getRequestDispatcher("/WEB-INF/jsp/main/main-page.jsp").forward(request, response);
	}
}
