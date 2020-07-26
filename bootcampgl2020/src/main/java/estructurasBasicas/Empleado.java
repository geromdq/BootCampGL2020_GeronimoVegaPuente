package estructurasBasicas;

public class Empleado {
	
	private static double salario;
	private static String name = "Alex";
	public static double getSalario() {
		return salario;
	}
	public static void setSalario(double salario) {
		Empleado.salario = salario;
	}
	public static String getname() {
		return name;
	}
	public static void setname(String name) {
		Empleado.name = name;
	}

}
