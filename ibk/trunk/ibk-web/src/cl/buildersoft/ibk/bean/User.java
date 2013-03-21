package cl.buildersoft.ibk.bean;

import java.util.Calendar;

public class User extends BSAbstractBean {
	private Customer customer = null;
	private String id = null;
	private String name = null;
	private Calendar lastLoginSuccess = null;
	private Calendar lastLoginUnsuccess = null;
	private String email = null;
}
