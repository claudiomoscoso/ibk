package cl.buildersoft.ibk.bean.plataform;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Component extends BSAbstractBean {
	private static final long serialVersionUID = -7423315611011177019L;
	private final String TABLE = "tComponent";
	private Long feature = null;
	private String key = null;
	private String name = null;
	private Long type = null;
	
	public Long getFeature() {
		return feature;
	}
	public void setFeature(Long feature) {
		this.feature = feature;
	}
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
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Component [feature=" + feature + ", key=" + key + ", name=" + name + ", type=" + type
				+ ", Id=" + getId() + "]";
	}

}
