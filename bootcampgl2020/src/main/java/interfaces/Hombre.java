package interfaces;

public class Hombre implements Animal,Persona {

	@Override
	public void hablar() {
		System.out.println("Las personas hablan mucho");
		
	}

	@Override
	public void dormir() {
		System.out.println("El hombre duerme muchas horas");
		
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonido animal");
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Hombre hombre = new Hombre();
		hombre.dormir();
		hombre.hablar();
		hombre.sonidoAnimal();
		hombre.come();
		
	}
	

}
