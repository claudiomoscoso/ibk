package cl.buildersoft.ibk.bean;

public class Profile extends BSAbstractBean {
	private String key = null;
	private String name = null;
	
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
}
