package cl.buildersoft.ibk.bean.business;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Bank extends BSAbstractBean {
	private static final long serialVersionUID = -4077163131741071034L;
	private String key = null;
	private String name = null;
	private String logo = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
