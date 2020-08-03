package com.globallogic.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import patronDelegation.ElectricalOven;

public class ElectricalOvenTest {
	
	ElectricalOven EO = new ElectricalOven ();
	
	@Test
	void turnLedTest() {
		 int initialValue = EO.getPower();
		 EO.turnLed();
		assertEquals(initialValue-100,EO.getPower());
	}
	
	@Test
	void turnOnTest() {
		 int initialValue = EO.getPower();
		 EO.turnOn();
		 assertEquals(initialValue-75,EO.getPower());
	}

}
