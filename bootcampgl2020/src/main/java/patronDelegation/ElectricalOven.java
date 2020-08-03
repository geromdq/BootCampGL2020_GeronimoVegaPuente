package patronDelegation;

public class ElectricalOven extends ElectricalAppliance{
	
			
	public void turnLed() {
	super.usePower(100);
}
		
		
	public void turnOn() {
		super.usePower(75);
	}
}
