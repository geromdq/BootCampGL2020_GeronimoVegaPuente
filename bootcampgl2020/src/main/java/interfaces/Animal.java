package interfaces;

public interface Animal {
	
	
	default void come(String s) {
		System.out.println("El " + s + " se alimenta");
	}
	
	public static void camina(String s) {
		System.out.println("El " + s + " camina");
	}
	
	public void dormir();	
	public void sonidoAnimal();

}
