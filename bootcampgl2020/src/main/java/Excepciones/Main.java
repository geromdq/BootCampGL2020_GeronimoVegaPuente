package Excepciones;

public class Main {
	
	

	public static void main(String[] args) {
		try{			
			Exception ex = new Exception("Se produjo una excepción: Esto es una Excepción");		
			   throw ex;
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}

	}

}
