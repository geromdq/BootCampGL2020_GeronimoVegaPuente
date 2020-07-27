package Excepciones;

public class TercerEjercicio {

	public static void main(String[] args) {
		int [] arr = new int[2];
		try{
			for(int i = 0; i <4; i++) {
				arr[i] = 2;
				}
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		System.out.println("Excepción: índice de array fuera de limites");

	}

}
