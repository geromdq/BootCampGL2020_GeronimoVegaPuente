package com.globallogic.bootcamp.patterns;

public class Product {
	
	String name;
	private static Product instance = new Product();
	
	private Product() {
		name = "Clavos";
	}
	
	public static Product getInstance() {
		return instance;
	}

}
