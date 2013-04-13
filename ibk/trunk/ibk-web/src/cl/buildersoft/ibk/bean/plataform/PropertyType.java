package cl.buildersoft.ibk.bean.plataform;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class PropertyType extends BSAbstractBean {
	private static final long serialVersionUID = 7912736529584482586L;
	private final String TABLE = "tPropertyType";
	private String key = null;
	private String name = null;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
