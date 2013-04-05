package cl.buildersoft.ibk.web.servlet.main;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.buildersoft.ibk.bean.Bank;
import cl.buildersoft.ibk.bean.Customer;
import cl.buildersoft.ibk.business.service.bank.BankService;
import cl.buildersoft.ibk.util.BSFactory;
import cl.buildersoft.ibk.web.servlet.HttpServletAjax;

@WebServlet("/servlet/main/LoadBankInfo")
public class LoadBankInfo extends HttpServletAjax {
	private static final long serialVersionUID = -1840999424221143352L;

	public LoadBankInfo() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		HttpSession session = request.getSession(false);

		Bank bank = (Bank) session.getAttribute("Bank");

		if (bank == null) {
			BSFactory factory = new BSFactory();
			// SecurityService securityService =
			// factory.getSecurityService(config);
			BankService bankService = factory.getBankService(context);
			bank = bankService.getMainBank(request, (Customer) session.getAttribute("Customer"));
			session.setAttribute("Bank", bank);
		}
		// HttpSession session = request.getSession(false);
		// Bank bank =(Bank) session.getAttribute("Bank");

		request.getRequestDispatcher("/WEB-INF/jsp/login/bank-info.jsp").forward(request, response);

	}

}