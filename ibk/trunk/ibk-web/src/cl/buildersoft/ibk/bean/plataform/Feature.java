package cl.buildersoft.ibk.bean.plataform;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Feature extends BSAbstractBean {
	private static final long serialVersionUID = 4479488211856259457L;
	private final String TABLE = "tFeature";
	private String key = null;
	private String name = null;
	private Boolean enable = null;

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

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	@Override
	public String toString() {
		return "Feature [key=" + key + ", name=" + name + ", enable=" + enable + ", getId()=" + getId() + "]";
	}

}
