package cl.buildersoft.ibk.bean.business;

import java.util.Currency;
import java.util.HashMap;

public class Account extends BSAbstractBean {
	private static final long serialVersionUID = -5695555924542635417L;
	private Integer id = null;
	private String number = null;
	private Product product = null;
	private Currency currency = null;
	private HashMap<String, Object> attribute = null;
	private String mask = null;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public HashMap<String, Object> getAttribute() {
		return attribute;
	}

	public void setAttribute(HashMap<String, Object> attribute) {
		this.attribute = attribute;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

}
