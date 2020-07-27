package clasesObjetos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {
	
	
	private List<Empleado> employees;
	
	
	
				
	public void setEmployeesQuantity(int employeesQuantity) {
		this.employees = new ArrayList<Empleado>(employeesQuantity);
	}

	public int getEmployeesQuantity(){
		return employees.size();
	}
	public void setEmployeesData(String name,boolean civilStatus,int childsNumber, double baseSalary, int extraHours , double IRPF ) {
		Empleado a = new Empleado(name, civilStatus, childsNumber, baseSalary, extraHours, IRPF);
		employees.add(a);		
	}
	
	public void sortAndPrintEmployees() {
	 	Collections.sort(employees);
	 	for(Empleado baseSalary:employees ) {
	 		System.out.println(baseSalary);	 	
	 	}
		
 		System.out.println("El empleado de mayor sueldo es: \n" );
 		System.out.println(employees.get(0));
 		System.out.println("El empleado de menor  sueldo es: \n");
 		System.out.println(employees.get(employees.size()-1));
 		System.out.println("El empleado con mayores ingresos por horas extras es:  \n");
 		Empleado higherAdditionalExtraHours = Collections.max(employees, Comparator.comparingDouble(Empleado::calculateAdditionalextraHours));
 		System.out.println(higherAdditionalExtraHours);

 		System.out.println("El empleado con menores ingresos por horas extras es:  \n");
 		Empleado lowerAdditionalExtraHours = Collections.min(employees, Comparator.comparingDouble(Empleado::calculateAdditionalextraHours));
 		System.out.println(lowerAdditionalExtraHours);
	}

}
