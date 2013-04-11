package cl.buildersoft.ibk.bean.plataform;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Property extends BSAbstractBean {
	private static final long serialVersionUID = -2405498142238661252L;
	private final String TABLE = "tProperty";
	private String key = null;
	private String name = null;
	private String value = null;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
