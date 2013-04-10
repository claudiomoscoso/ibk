package cl.buildersoft.ibk.service.plataform.config;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.plataform.Feature;
import cl.buildersoft.ibk.bean.plataform.Property;

public interface ConfigService {
	public Feature getFeature(HttpServletRequest request, String key);

	public List<Feature> listFeatures(HttpServletRequest request);

	public Property getValue(HttpServletRequest request, Feature feature, String key);
	/** Se definiran mas metodos */
}
