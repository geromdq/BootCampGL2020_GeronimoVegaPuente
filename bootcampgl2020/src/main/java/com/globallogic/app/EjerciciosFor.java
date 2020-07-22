package com.globallogic.app;

public class EjerciciosFor {

	public static void main(String[] args) {
		
		/*Ejercicio 4.4*/
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Valor iterado: " + i);
		}
		
		
		/*Ejercicio 4.5*/
		
		int cont = 0;
		for(int i = 0 ; i <= 10000 ; i++) {
			if(i % 20==0) {
				cont++;
			}
		}
		System.out.println("El contador final es: " + cont);
		
		
		
		/*Ejercicio 4.6*/
		
		String [] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo" 
		};
		
		for(int i = 0 ; i < dias.length ; i++) {
			System.out.println("Dia de la semana: " + dias[i] + "\n");
		}
	}
	

}
