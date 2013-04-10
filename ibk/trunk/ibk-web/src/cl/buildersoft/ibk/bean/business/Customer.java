package cl.buildersoft.ibk.bean.business;


public class Customer extends BSAbstractBean {
	private static final long serialVersionUID = 5394835420493871216L;
	private String id = null;
	private String name = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
