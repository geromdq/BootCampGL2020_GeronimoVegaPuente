package herenciaPolimorfismo;

public class Cafetera extends Electrodomestico{
	
	private double litros;
	
	
	
	public Cafetera(String marca, double peso, char consumo, String color, double litros) {
		super(marca, peso, consumo, color);
		this.litros = litros;
	}

	public void elegirSabor(String sabor) {
		System.out.println("Eligiendo sabor");
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo Cafetera");
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

}
