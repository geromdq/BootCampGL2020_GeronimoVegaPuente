package com.globallogic.bootcampgl.Order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component	
public class Order {
	
	@Value("${in.product}")
	private String product;
	@Value("${in.count}")
	private int count;
	@Value("${in.customer}")
	private int customer;
	
	public String toString() {
		return "Product: " + product + " count: " + count + " customer: " + customer;
	}

}
