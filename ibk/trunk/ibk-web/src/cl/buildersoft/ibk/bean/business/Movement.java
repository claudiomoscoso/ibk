package cl.buildersoft.ibk.bean.business;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;

import cl.buildersoft.ibk.bean.BSAbstractBean;

public class Movement extends BSAbstractBean {
	private static final long serialVersionUID = -2140642321896843926L;
	private String id = null;
	private Long number = null;
	private Calendar date = null;
	private String description = null;
	private String channel = null;
	private BigDecimal debit = null;
	private BigDecimal credit = null;
	private BigDecimal balance = null;
	private HashMap<String, Object> attribute = null;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public BigDecimal getDebit() {
		return debit;
	}

	public void setDebit(BigDecimal debit) {
		this.debit = debit;
	}

	public BigDecimal getCredit() {
		return credit;
	}

	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public HashMap<String, Object> getAttribute() {
		return attribute;
	}

	public void setAttribute(HashMap<String, Object> attribute) {
		this.attribute = attribute;
	}

}
