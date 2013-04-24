package cl.buildersoft.ibk.service.plataform.config;

import java.math.BigDecimal;
import java.util.List;

import cl.buildersoft.ibk.bean.plataform.Component;
import cl.buildersoft.ibk.bean.plataform.ComponentType;
import cl.buildersoft.ibk.bean.plataform.Feature;
import cl.buildersoft.ibk.bean.plataform.Option;
import cl.buildersoft.ibk.bean.plataform.Property;
import cl.buildersoft.ibk.bean.plataform.PropertyType;

public interface ConfigService {
	public Feature getFeature(String key);

	public List<Feature> listFeatures();

	public List<Component> listComponent(Feature feature);

	public List<ComponentType> listComponentTypes();

	public ComponentType getComponentType(Long id);

	public List<Property> listProperties(Component component);

	public List<PropertyType> listPropertyTypes();

	public PropertyType getPropertyType(Long id);

	public List<Option> getOptions(Property property);
	
	public Object getValue(Property property);

	public Boolean getValueBoolean(Property property);

	public BigDecimal getNumber(Property property);

	public Integer getInteger(Property property);

	public Option getValueOption(Property property);

}
