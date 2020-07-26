package interfaces;

public class MainAnimal {

	public static void main(String[] args) {
		Perro dog = new Perro();
		dog.dormir();
		dog.sonidoAnimal();
		Animal.camina("Perro");
		dog.come("Perro");
		
	}

}
