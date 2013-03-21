package cl.buildersoft.ibk.bean;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;

public class Account extends BSAbstractBean {
	private Integer id = null;
	private String number = null;
	private Product product = null;
	private Product byProduct = null;
	private BigDecimal balance = null;
	private Currency currency = null;
	private HashMap<String, Object> attribute = null;
	private String mask = null;

}
