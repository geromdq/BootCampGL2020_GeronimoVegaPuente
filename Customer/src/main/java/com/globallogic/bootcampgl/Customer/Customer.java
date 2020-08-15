package com.globallogic.bootcampgl.Customer;

public class Customer {

	private String name = "Jose Perez";
	private int dni = 234567890;
	private int id = 12342;
	
	public Customer () {
		toString();
	}
	
	public String toString() {
		return "Nombre: " + name + " DNI: " + dni + " ID: " + id;
	}
	
}
