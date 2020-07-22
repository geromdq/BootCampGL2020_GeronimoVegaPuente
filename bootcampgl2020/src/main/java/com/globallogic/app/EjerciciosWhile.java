package com.globallogic.app;

public class EjerciciosWhile {

	public static void main(String[] args) {
		
		/*Ejercicio 4.7*/
		
		int i = 0;
		while(i <= 10) {
			System.out.println("Valor iterado: " + i);
			i++;
		}
		
		
		
		/*Ejercicio 4.8*/
		
		i=0;
		while(i<=50) {
			if(i % 2 == 0) {
				System.out.println("Valor iterado " + i + " par");
			}
			else
			{
				System.out.println("Valor iterado " + i + " impar");
			}
			i++;
		}
	}
}


