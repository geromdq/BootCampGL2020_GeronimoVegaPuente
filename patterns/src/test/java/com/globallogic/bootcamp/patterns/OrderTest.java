package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderTest {
	
	@Test
	void sameCurrencyTest() {
		Order order = new Order("Description",3,Currency.getInstance());
		Order order2 = new Order("Description",3,Currency.getInstance());
		assertEquals(order.currency.hashCode(),order2.currency.hashCode());
	}
	
	@Test
	void productSingletonTest() {
		Order order = new Order("Description",3,Currency.getInstance());
		Order order2 = new Order("Description",3,Currency.getInstance());
		order.setProduct(Product.getInstance());
		order2.setProduct(Product.getInstance());
		assertEquals(order.product.hashCode(),order2.product.hashCode());
	}

}
