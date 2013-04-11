package cl.buildersoft.ibk.bean.business;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Officer extends BSAbstractBean {
	private static final long serialVersionUID = 3929060432790671086L;
	private String key = null;
	private String name = null;
	private String email = null;
	private String phone = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
