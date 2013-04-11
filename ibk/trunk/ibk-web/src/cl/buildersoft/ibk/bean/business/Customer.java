package cl.buildersoft.ibk.bean.business;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Customer extends BSAbstractBean {
	private static final long serialVersionUID = 5394835420493871216L;
	private String key = null;
	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
