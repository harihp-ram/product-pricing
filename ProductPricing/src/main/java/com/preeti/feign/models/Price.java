package com.preeti.feign.models;

import java.math.BigDecimal;

public class Price {

	private BigDecimal value;
	private CurrencyCode currencyCode;

	public Price(BigDecimal value, CurrencyCode currCode) {
		this.value = value;
		this.currencyCode = currCode;
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
