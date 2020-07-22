package com.globallogic.app;

public class EjerciciosFor {

	public static void main(String[] args) {
		
		/*Ejercicio 4.4*/
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Valor iterado: " + i);
		}
		
		
		/*Ejercicio 4.5*/
		int cont = 0;
		for(int j = 0 ; j <= 10000 ; j++) {
			if(j % 20==0) {
				cont++;
			}
		}
		System.out.println(cont);
	}

}
