package PilaresPOO;

public class Heladera extends Electrodomestico {
	
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	public Heladera(String marca, double peso, char consumo, String color, double capacidad, boolean tieneFreezer,
			double capacidadFreezer) {
		super(marca, peso, consumo, color);
		this.capacidad = capacidad;
		this.tieneFreezer = tieneFreezer;
		this.capacidadFreezer = capacidadFreezer;
	}
	
	public void guardarElemento(String elemento) {
		System.out.println("Guardando" + elemento);
	}
	
	public void extraerElemento(String elemento) {
		System.out.println("Extrayendo" + elemento);
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo heladera");
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isTieneFreezer() {
		return tieneFreezer;
	}

	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}

	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}

	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}

}
