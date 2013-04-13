package cl.buildersoft.ibk.service.plataform.config.database;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import cl.buildersoft.framework.database.BSBeanUtils;
import cl.buildersoft.ibk.bean.plataform.Component;
import cl.buildersoft.ibk.bean.plataform.ComponentType;
import cl.buildersoft.ibk.bean.plataform.Feature;
import cl.buildersoft.ibk.bean.plataform.Option;
import cl.buildersoft.ibk.bean.plataform.Property;
import cl.buildersoft.ibk.bean.plataform.PropertyType;
import cl.buildersoft.ibk.service.plataform.config.ConfigService;

public class ConfigServiceImpl implements ConfigService {

	@Override
	public Feature getFeature(String key) {
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
	public List<Feature> listFeatures() {
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

	@Override
	public List<Component> listComponent(Feature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComponentType> listComponentTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComponentType getComponentType(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> listProperties(Component component) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PropertyType> listPropertyTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PropertyType getPropertyType(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Option> getOptions(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getValue(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getValueBoolean(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getNumber(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getInteger(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Option getValueOption(Property property) {
		// TODO Auto-generated method stub
		return null;
	}
}
