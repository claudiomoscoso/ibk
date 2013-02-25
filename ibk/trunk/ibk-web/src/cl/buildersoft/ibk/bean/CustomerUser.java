package cl.buildersoft.ibk.bean;

import java.util.Calendar;

public class CustomerUser extends BSAbstractBean {
	private String id = null;
	private String name = null;
	private Calendar lastLoginSuccess = null;
	private Calendar lastLoginUnsuccess = null;

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
	public void setLastLoginSuccess(Calendar lastLogin) {
		this.lastLoginSuccess = lastLogin;
	}
	public Calendar getLastLoginUnsuccess() {
		return lastLoginUnsuccess;
	}
	public void setLastLoginUnsuccess(Calendar lastLoginUnsuccess) {
		this.lastLoginUnsuccess = lastLoginUnsuccess;
	}
}
