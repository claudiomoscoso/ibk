package cl.buildersoft.ibk.web.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

// @ WebServlet("/StartupServlet")
public class StartupServlet extends HttpServlet {

	private static final long serialVersionUID = 5322431764726461918L;

	public StartupServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {

		ServletContext ctx = config.getServletContext();
		Properties props = new Properties();
		try {
			props.load(ctx.getResourceAsStream("/WEB-INF/bs-ibk-config.properties"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		Set<Object> keys = props.keySet();
		String key = null;

		Iterator<Object> itr = keys.iterator();
		while (itr.hasNext()) {
			key = (String) itr.next();
			ctx.setAttribute(key, props.getProperty(key));
		}
		
		/**
		 * <code>
		Enumeration<String> e = config.getServletContext().getAttributeNames();
		while (e.hasMoreElements()) {
			String value = (String) e.nextElement();
			if (!"org.apache.tomcat.util.scan.MergedWebXml".equals(value)) {
				System.out.println(value + " = " + config.getServletContext().getAttribute(value));
			}
		}
 		 </code>
		 */
//		 System.out.println("Here!");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/**
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
*/
}
