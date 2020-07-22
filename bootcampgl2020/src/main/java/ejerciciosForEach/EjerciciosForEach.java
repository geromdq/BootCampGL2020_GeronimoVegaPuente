package ejerciciosForEach;

public class EjerciciosForEach {

	public static void main(String[] args) {
		/*Ejercicio 4.9*/
		{
			Integer[] Array = {1,2,3,4,5,6,7,8,9,10};
			for(Integer num : Array) {
				System.out.println("Valor iterado: " + num);
			}
		}
		
		/*Ejercicio 4.10*/
		
		String [] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo" 
		};
		
		for(String dia:dias) {
			System.out.println("Dia de la semana: " + dia);
		}

	}

}
