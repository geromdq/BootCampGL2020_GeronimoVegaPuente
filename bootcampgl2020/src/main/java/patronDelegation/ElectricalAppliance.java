package patronDelegation;

public class ElectricalAppliance {
	
	private int power = 500;
	
	public void turnOn() {
		this.power -= 50;
	}
	
	public void usePower(int power) {
		this.power -= power;
	}
	
	public int getPower() {
		return power;
	}
}
