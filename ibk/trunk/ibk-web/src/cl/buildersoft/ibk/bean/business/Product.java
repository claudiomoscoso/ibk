package cl.buildersoft.ibk.bean.business;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Product extends BSAbstractBean {
	private static final long serialVersionUID = -1447304791775060514L;
	private String key = null;
	private String name = null;
	private String parent = null;

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

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
}
