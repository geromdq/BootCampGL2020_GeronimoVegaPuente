package com.globallogic.bootcamp.patterns;

public class Order {
	
	String description;
	int count;
	Currency currency;
	Product product;
	
	public Order(String description, int count, Currency currency) {
		this.description = description;
		this.count = count;
		this.currency = currency;
		
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}

}
