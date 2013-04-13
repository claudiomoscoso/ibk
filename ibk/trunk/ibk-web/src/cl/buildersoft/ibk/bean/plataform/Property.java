package cl.buildersoft.ibk.bean.plataform;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Property extends BSAbstractBean {
	private static final long serialVersionUID = -2405498142238661252L;
	private final String TABLE = "tProperty";
	private Long component = null;
	private Long type = null;
	private Integer order = null;

	public Long getComponent() {
		return component;
	}

	public void setComponent(Long component) {
		this.component = component;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Property [component=" + component + ", type=" + type + ", order=" + order + ", Id=" + getId() + "]";
	}

}
