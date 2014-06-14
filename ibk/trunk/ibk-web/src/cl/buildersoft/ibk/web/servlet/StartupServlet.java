package cl.buildersoft.ibk.web.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import cl.buildersoft.ibk.bean.plataform.Feature;
import cl.buildersoft.ibk.service.plataform.config.ConfigService;
import cl.buildersoft.ibk.util.BSFactory;

// @ WebServlet("/StartupServlet")
public class StartupServlet extends HttpServlet {

	private static final long serialVersionUID = 5322431764726461918L;

	public StartupServlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		readFromPropertiesFile(config);

		BSFactory factory = new BSFactory();
		ConfigService cfg = factory.getConfigService(config.getServletContext());
		Feature login = cfg.getFeature("LOGIN");

		System.out.println(login.toString());

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

	}

	private void readFromPropertiesFile(ServletConfig config) {
		ServletContext ctx = config.getServletContext();
		Properties props = new Properties();
		try {
			props.load(ctx.getResourceAsStream("/WEB-INF/ibk.properties"));
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
	}

}
