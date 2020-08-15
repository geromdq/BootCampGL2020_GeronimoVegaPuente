package com.globallogic.bootcampgl.Order;

import org.springframework.stereotype.Component;

@Component("order")
public class Order {
	
	private String product = "C-00221";
	private int count = 1000;
	private int customer = 12342;
	
	public String toString() {
		return "Product: " + product + " count: " + count + " customer: " + customer;
	}

}
