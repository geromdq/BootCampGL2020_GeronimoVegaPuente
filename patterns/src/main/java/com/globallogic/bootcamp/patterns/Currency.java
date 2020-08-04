package com.globallogic.bootcamp.patterns;

public class Currency {
	

	private static Currency instance = new Currency();
	private String name;
	
	private Currency() {
		name = "ARS";
	}
	
	public static Currency getInstance() {
		return instance;
	}
	
	
	
	
	
}
