package cl.buildersoft.ibk.bean;

public class Bank extends BSAbstractBean {
	private static final long serialVersionUID = -4077163131741071034L;
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

}
