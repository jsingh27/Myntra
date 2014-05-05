package com.pronto.myntra.domain;

import java.math.BigDecimal;

public class Product {
	private String productID;
	private String name;
	private BigDecimal price;
	private float quantity;
	private String brand;
	

	public String getID() {
		return productID;
	}

	public void setID(String iD) {
		productID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
