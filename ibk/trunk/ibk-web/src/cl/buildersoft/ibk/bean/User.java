package cl.buildersoft.ibk.bean;

import java.util.Calendar;

public class User extends BSAbstractBean {
	private Customer customer = null;
	private String id = null;
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
}
