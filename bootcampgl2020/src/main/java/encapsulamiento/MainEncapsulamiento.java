package encapsulamiento;

public class MainEncapsulamiento {

	public static void main(String[] args) {
		
		Gato miGato = new Gato();
		miGato.setname("Juancito");
		miGato.setPatas(4);
		System.out.println("El gato " + miGato.getname() + " tiene " + miGato.getPatas() + " patas");


	}

}
