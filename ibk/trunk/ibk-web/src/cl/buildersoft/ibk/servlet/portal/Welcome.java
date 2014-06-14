package cl.buildersoft.ibk.servlet.portal;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/portal/Welcome")
public class Welcome extends HttpServlet {

	private static final String LOGIN_METHOD = "cl.buildersoft.ibk.login.method";
	private static final String BANK_NAME = "cl.buildersoft.ibk.bank.name";
	private static final long serialVersionUID = 2429072429100718580L;

	public Welcome() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = request.getServletContext();
		String method = (String) ctx.getAttribute(LOGIN_METHOD);

		String url = (String) ctx.getAttribute(LOGIN_METHOD + "." + method);
		String bankName = (String) ctx.getAttribute(BANK_NAME);
		request.setAttribute("BankName", bankName);

		request.getRequestDispatcher(url).forward(request, response);
	}

}
