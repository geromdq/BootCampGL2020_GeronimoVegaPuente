package PilaresPOO;

import java.util.ArrayList;
import java.util.List;

public class MainHerenciaPolimorfismo {

	public static void main(String[] args) {
		
		Electrodomestico miElectro = new Electrodomestico("Philips",20.2,'A',"Verde");
		Heladera miHeladera = new Heladera("LG",40.2,'B',"Gris",30.5,true,10.2);
		Cafetera miCafetera = new Cafetera("Atma",3.2,'C',"Negro",1);
		Televisor miTelevisor = new Televisor("Sony",10.1,'A',"Negro",40.0,"Full HD");
		
		miElectro.apagar();
		miElectro.encender();		
		System.out.println("La marca de miElectro es: " + miElectro.getMarca());
		System.out.println("El peso de miElectro es: " + miElectro.getPeso());
		System.out.println("El color de miElectro es: " + miElectro.getColor());
		System.out.println("El consumo de miElectro es: " + miElectro.getConsumo());
		
		System.out.println("\n");
		
		miHeladera.apagar();
		miHeladera.encender();
		miHeladera.extraerElemento("Agua");
		miHeladera.guardarElemento("Comida");
		System.out.println("La marca de miHeladera es: " + miHeladera.getMarca());
		System.out.println("El peso de miHeladera es: " + miHeladera.getPeso());
		System.out.println("El color de miHeladera es: " + miHeladera.getColor());
		System.out.println("El consumo de miHeladera es: " + miHeladera.getConsumo());
		System.out.println("La capacidad de miHeladera es " + miHeladera.getCapacidad());
		System.out.println("Mi heladera tiene freezer? " + miHeladera.isTieneFreezer());
		System.out.println("La capacidad del freezer de miHeladera es " + miHeladera.getCapacidadFreezer());
		
		System.out.println("\n");
		
		List<Electrodomestico> misElectros = new ArrayList<Electrodomestico>();
		misElectros.add(miElectro);
		misElectros.add(miHeladera);
		misElectros.add(miCafetera);
		misElectros.add(miTelevisor);
		
		for(Electrodomestico electro:misElectros) {
			electro.encender();
		}

		
	}

}
