package cl.buildersoft.ibk.bean.business;

import java.util.Calendar;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class User extends BSAbstractBean {
	private static final long serialVersionUID = 221685245119541158L;
	private Customer customer = null;
	private String key = null;
	private String name = null;
	private Calendar lastLoginSuccess = null;
	private Calendar lastLoginUnsuccess = null;
	private String email = null;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getLastLoginSuccess() {
		return lastLoginSuccess;
	}

	public void setLastLoginSuccess(Calendar lastLoginSuccess) {
		this.lastLoginSuccess = lastLoginSuccess;
	}

	public Calendar getLastLoginUnsuccess() {
		return lastLoginUnsuccess;
	}

	public void setLastLoginUnsuccess(Calendar lastLoginUnsuccess) {
		this.lastLoginUnsuccess = lastLoginUnsuccess;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
