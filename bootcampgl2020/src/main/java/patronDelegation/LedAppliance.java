package patronDelegation;

public class LedAppliance {
	
	ElectricalAppliance EA;

	
	public LedAppliance() {		
			EA = new ElectricalAppliance();
		}

	public void turnOn() {
		EA.usePower(100);
	}
	
	public int getPower() {
		return EA.getPower();
	}
}
