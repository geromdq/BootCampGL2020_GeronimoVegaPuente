package com.globallogic.bootcampgl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(ProductApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(productRepository.getById("C-0021").toString());
		
	}

}
