package cl.buildersoft.ibk.bean.plataform;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class ComponentType extends BSAbstractBean {
	private static final long serialVersionUID = 3674108295841461321L;
	private final String TABLE = "tComponentType";
	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
