package cl.buildersoft.ibk.bean.plataform;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Feature extends BSAbstractBean {
	private static final long serialVersionUID = 4479488211856259457L;
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
