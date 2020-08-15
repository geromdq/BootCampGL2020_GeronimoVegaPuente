package com.globallogic.bootcampgl.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderFactory {
	
	@Autowired
	Order order;

	public void getNewOrder() {			
		order.toString();
	}

}
