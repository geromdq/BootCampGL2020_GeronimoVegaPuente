package patronDelegation;

public class Main {

	public static void main(String[] args) {
		
		ElectricalOven oven = new ElectricalOven();
		System.out.println(oven.getPower());
		oven.turnOn();
		System.out.println(oven.getPower());
		oven.turnLed();
		System.out.println(oven.getPower());
	}

}
