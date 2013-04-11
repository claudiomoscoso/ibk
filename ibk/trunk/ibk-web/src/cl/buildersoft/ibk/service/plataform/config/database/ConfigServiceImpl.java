package cl.buildersoft.ibk.service.plataform.config.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import cl.buildersoft.framework.database.BSBeanUtils;
import cl.buildersoft.ibk.bean.plataform.Feature;
import cl.buildersoft.ibk.bean.plataform.Property;
import cl.buildersoft.ibk.service.plataform.config.ConfigService;

public class ConfigServiceImpl implements ConfigService {

	@Override
	public Feature getFeature(HttpServletRequest request, String key) {
		Connection conn = getConnection();
		// BSmySQL mysql = new BSmySQL();
		BSBeanUtils bu = new BSBeanUtils();

		Feature feature = new Feature();

		if (!bu.search(conn, feature, "cKey=?", key)) {
			feature = null;
		}

		return feature;
	}

	@Override
	public List<Feature> listFeatures(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getValue(HttpServletRequest request, Feature feature, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	private Connection getConnection() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/ibk");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
