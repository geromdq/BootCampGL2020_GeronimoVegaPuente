package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CurrencyTest {


	
	@Test
	void singletonTest(){		
		Currency currency = Currency.getInstance();
		Currency currency2 = Currency.getInstance();
		assertEquals(currency.hashCode(),currency2.hashCode());
	}

	
}
