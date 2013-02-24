package cl.buildersoft.ibk.business.service.login.bantotal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.framework.database.BSmySQL;
import cl.buildersoft.framework.exception.BSDataBaseException;
import cl.buildersoft.framework.util.BSSecurity;
import cl.buildersoft.framework.util.BSUtils;
import cl.buildersoft.ibk.bean.Bank;
import cl.buildersoft.ibk.bean.CustomerUser;
import cl.buildersoft.ibk.business.service.login.LoginService;
import cl.buildersoft.ibk.enumeration.LoginStatusEnum;


public class LoginServiceImpl implements LoginService {

	@Override
	public LoginStatusEnum validate(HttpServletRequest request, String user, String password) {

		BSmySQL mysql = new BSmySQL();
		Connection conn = mysql.getConnection(request);

		BSSecurity security = new BSSecurity();
		password = security.md5(password);

		ResultSet rs = mysql.callSingleSP(conn, "pLogin", BSUtils.array2List(user, password));
		LoginStatusEnum out = LoginStatusEnum.INCORRECT;

		try {
			if (rs.next()) {
				out = LoginStatusEnum.CORRECT;
			}
		} catch (SQLException e) {
			throw new BSDataBaseException(e);
		}
		return out;
	}

	@Override
	public Bank getMainBank(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerUser getUser(HttpServletRequest request, String user) {
		// TODO Auto-generated method stub
		return null;
	}

}
