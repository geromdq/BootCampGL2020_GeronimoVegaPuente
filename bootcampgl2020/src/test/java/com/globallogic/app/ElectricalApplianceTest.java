package com.globallogic.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import patronDelegation.ElectricalAppliance;

public class ElectricalApplianceTest {
	
	 ElectricalAppliance EA = new ElectricalAppliance ();
	
	 @Test
	 void turnOnTest (){
		 int initialValue = EA.getPower();
		 EA.turnOn();
		 assertEquals((initialValue-50),EA.getPower());
	 }
	 
	 @Test
	 void usePowerTest (){
		 int initialValue = EA.getPower();
		 EA.usePower(50);
		 assertEquals((initialValue-50),EA.getPower());
	 }

}
