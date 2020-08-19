package com.globallogic.bootcampgl.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CustomerApplication implements CommandLineRunner{
	


	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}	

	@Autowired
	Customer customer;

	@Override
	public void run(String... args) throws Exception {		
		System.out.println(customer);		
	}

}
