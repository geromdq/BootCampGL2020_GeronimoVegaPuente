package com.globallogic.app;

public class EjerciciosIF {

	public static void main(String[] args) {
	
		/*Ejercicio 4.1*/
		
		int value = 3;
		int value2 = 10;
		int result = value + value2;
		if(result <= 10) {
			System.out.println("La suma de los numeros es: " + result);
		}
		else {
			System.out.println("La suma de los numeros es Mayor a 10");
		}
		/*Ejercicio 4.2*/
		
		char valor = 'A';
		char valor2 = 'b';
		
		if(Character.isLowerCase(valor)) {
			System.out.println("No es una letra mayúscula");
		}
		else
		{
			System.out.println("Es una letra mayuscula");
		}
		
		if(Character.isLowerCase(valor2)) {
			System.out.println("No es una letra mayúscula");
		}
		else
		{
			System.out.println("Es una letra mayuscula");
		}
		
	}
}




