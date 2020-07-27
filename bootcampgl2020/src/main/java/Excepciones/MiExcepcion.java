package Excepciones;

public class MiExcepcion extends Exception {
	
	String miString = "Hola";
	
	
	public void mostrarString() {
		System.out.println(miString);
	}
}
