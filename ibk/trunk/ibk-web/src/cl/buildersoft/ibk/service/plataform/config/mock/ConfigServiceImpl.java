package cl.buildersoft.ibk.service.plataform.config.mock;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.plataform.Feature;
import cl.buildersoft.ibk.bean.plataform.Property;
import cl.buildersoft.ibk.service.plataform.config.ConfigService;

public class ConfigServiceImpl implements ConfigService {

	@Override
	public Feature getFeature(HttpServletRequest request, String key) {

		
		
		return null;
	}

	@Override
	public List<Feature> listFeatures(HttpServletRequest request) {

		return null;
	}

	@Override
	public Property getValue(HttpServletRequest request, Feature group, String key) {

		return null;
	}

}
