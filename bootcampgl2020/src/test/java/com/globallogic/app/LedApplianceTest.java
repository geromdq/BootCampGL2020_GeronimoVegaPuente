package com.globallogic.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import patronDelegation.LedAppliance;

public class LedApplianceTest {
	
	
	 LedAppliance LA = new LedAppliance ();
		
	 @Test
	 void turnOnTest (){
		 int initialValue = LA.getPower();
		 LA.turnOn();
		 assertEquals((initialValue-100),LA.getPower());
	 }
	

}
