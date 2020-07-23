package clasesObjetos;

public class MainClasesObjetos {

	public static void main(String[] args) {


		Empleado Employee = new Empleado();
		Employee.setSueldoBase(100);
		Employee.setTipoIRPF(15);
		Employee.setHorasExtrasRealizadasEnElMEs(4);
		Employee.setCasado(true);
		Employee.setNumeroHijos(2);
		
		System.out.println(Employee.calcularRetenciones());

	}

}
