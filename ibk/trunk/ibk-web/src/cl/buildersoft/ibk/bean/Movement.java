package cl.buildersoft.ibk.bean;

import java.math.BigDecimal;
import java.util.Calendar;

public class Movement extends BSAbstractBean {
	private String id = null;
	private Long number = null;
	private Calendar date = null;
	private String description = null;
	private String channel = null;
	private BigDecimal debit = null;
	private BigDecimal credit = null;
	private BigDecimal balance = null;

}
