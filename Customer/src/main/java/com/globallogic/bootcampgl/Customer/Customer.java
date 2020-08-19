package com.globallogic.bootcampgl.Customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("${in.name}")
	private String name;
	@Value("${in.dni}")
	private int dni;
	@Value("${in.id}")
	private int id;
	
	public Customer () {
		toString();
	}
	
	public String toString() {
		return "Nombre: " + name + " DNI: " + dni + " ID: " + id;
	}
	
}
