package estructurasBasicas;

public class Empleado {
	
	private static double salario;
	private static String nombre = "Alex";
	public static double getSalario() {
		return salario;
	}
	public static void setSalario(double salario) {
		Empleado.salario = salario;
	}
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Empleado.nombre = nombre;
	}

}
