package cl.buildersoft.ibk.servlet.util;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import cl.buildersoft.ibk.enumeration.ContentTypeEnum;

public abstract class HttpServletAjax extends HttpServlet {
	private static final long serialVersionUID = -1117836080412262972L;

	protected void setHeaderResponse(HttpServletResponse response, ContentTypeEnum contentTypeEnum) {
		response.setContentType(getContentType(contentTypeEnum)); 
		response.setCharacterEncoding("UTF-8");

//		System.out.println();
	}

	private String getContentType(ContentTypeEnum contentType) {
		int index = contentType.ordinal();

		String[] types = { "text/html", "text/xml", "text/plain", "text/plain", "image/gif", "application/pdf",
				"application/download", "application/zip", "image/jpg", "application/vnd.ms-excel" };

		return types[index];

		/**
		 * <code>
		res.setContentType("image/gif");
		res.setContentType("application/pdf");
		res.setContentType ("application/download");
		res.setContentType("application/zip");
		res.setContentType("application/tar");
		res.setContentType("application/doc");
		res.setContentType("image/jpg");
		res.setContentType("application/word");
		res.setContentType("text/plain");
		res.setContentType("image/jpeg");
		res.setContentType("application/txt");
		res.setContentType("application/gif");
		res.setContentType("application/jpg");
		res.setContentType("text/html");
		res.setContentType("text/xml");
		res.setContentType("text/vap.wap.wml");
		res.setContentType("text,vnd.wap.xml");
		res.setContentType("text/vnd.wap.wml");
		res.setContentType("multipart/mixed");
		res.setContentType("text/html;charset=iso-2022-jp");
		res.setContentType("application/vnd.ms-excel");
		</code>
		 */

	}

}
