package Excepciones;

public class PropiaClaseExcepcion {

	public static void main(String[] args) {
		try {
			MiExcepcion ex = new MiExcepcion();
			throw ex;
		}catch(MiExcepcion e) {
			e.mostrarString();
		}
	}

}
