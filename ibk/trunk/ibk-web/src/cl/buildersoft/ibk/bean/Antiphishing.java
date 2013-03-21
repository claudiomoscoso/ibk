package cl.buildersoft.ibk.bean;

public class Antiphishing extends BSAbstractBean {
	private String session = null;
	private String image = null;
	private String phrase = null;
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
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
