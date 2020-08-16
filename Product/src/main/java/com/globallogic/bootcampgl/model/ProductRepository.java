package com.globallogic.bootcampgl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;



@Repository
public class ProductRepository {
	
	@Autowired 
	Product product;
	
	public ProductRepository() {
		
	}
	
	public Product getById(String id) {
		
		product.setId(id);
		product.setName("Clavos");
		return product;
	}
}