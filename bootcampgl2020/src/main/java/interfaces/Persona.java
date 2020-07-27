package interfaces;

public interface Persona {

	default void come () {
		System.out.println("Se ejecuta método de la clase Hombre");
	}
	public void hablar();
	public void dormir();
	
}
