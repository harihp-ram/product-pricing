package com.preeti.feign.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private Integer id;
	private String name;
	private Price currentPrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Price getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Price currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Product(Integer id, String name, Price currPrice) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currPrice;
	}

	// default no-arg constructor
	public Product() {

	}

}
