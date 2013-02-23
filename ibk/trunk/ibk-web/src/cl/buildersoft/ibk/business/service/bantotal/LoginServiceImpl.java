package cl.buildersoft.ibk.business.service.bantotal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.framework.database.BSmySQL;
import cl.buildersoft.framework.exception.BSDataBaseException;
import cl.buildersoft.framework.util.BSSecurity;
import cl.buildersoft.framework.util.BSUtils;
import cl.buildersoft.ibk.business.service.LoginService;
import cl.buildersoft.ibk.business.service.LoginStatusEnum;

public class LoginServiceImpl implements LoginService {

	@Override
	public LoginStatusEnum validate(HttpServletRequest request, String user, String password) {
		/**
		 * <code>
		BSmySQL mysql = new BSmySQL();
		Connection conn = mysql.getConnection(request);

		BSSecurity security = new BSSecurity();
		password = security.md5(password);

		ResultSet rs = mysql.callSingleSP(conn, "pLogin", BSUtils.array2List(user, password));
		Boolean out = Boolean.FALSE;

		try {
			if (rs.next()) {
				out = Boolean.TRUE;
			}
		} catch (SQLException e) {
			throw new BSDataBaseException(e);
		}
</code>
		 */
		return LoginStatusEnum.CORRECT;
	}

}
