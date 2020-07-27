package Excepciones;

public class SegundoEjercicio {

	public static void main(String[] args) {	
			
			Auto auto = null;
			try{
				auto.getInfo();
			}catch(Exception e) {
				System.out.println("Se produjo una excepcion null");
			}
		}
	

	}

