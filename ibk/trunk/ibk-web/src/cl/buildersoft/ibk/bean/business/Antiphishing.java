package cl.buildersoft.ibk.bean.business;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Antiphishing extends BSAbstractBean {
	private static final long serialVersionUID = -1788960402959514115L;

	private String image = null;
	private String phrase = null;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

}
