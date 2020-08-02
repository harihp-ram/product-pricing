package com.preeti;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {
	@JsonProperty
	private BigDecimal value;
	@JsonProperty
	private CurrencyCode currencyCode;
	public Price(BigDecimal value, CurrencyCode currencyCode) {
		super();
		this.value = value;
		this.currencyCode = currencyCode;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public CurrencyCode getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(CurrencyCode currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	
	public Price() {
		
	}
	
}
