package encapsulamiento;

public class MainEncapsulamiento {

	public static void main(String[] args) {
		
		Gato miGato = new Gato();
		miGato.setNombre("Juancito");
		miGato.setPatas(4);
		System.out.println("El gato " + miGato.getNombre() + " tiene " + miGato.getPatas() + " patas");


	}

}
