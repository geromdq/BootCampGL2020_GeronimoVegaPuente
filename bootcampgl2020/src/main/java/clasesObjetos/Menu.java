package clasesObjetos;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	private Manager manager;
	private Scanner sc = new Scanner(System.in);
	private int cantidad;
	
	public Menu() {
		this.manager = new Manager();
	}
	
	public void requestAmountEmployees(){
		
		do{
			System.out.println("Ingrese la cantidad de empleados a guardar. Debe elegir entre 1 y 20.");				
			while(!sc.hasNextInt()) {
				String input = sc.next();
				 System.out.printf("\"%s\" no es un número valido.\n", input);
			}
			cantidad = sc.nextInt();			
		}while(cantidad < 1 || cantidad > 20);	
		manager.setEmployeesQuantity(cantidad);
	}
	
	public void askData() {
		for(int i = 0 ; i < cantidad ; i++) {
			manager.setEmployeesData(askName(),
					askCivilStatus(),
					askChildsNumber(),
					askBaseSalary(),	
					askExtraHours(),
					askIRPFtype());
		}
	}
	
	private String askName() {
		System.out.println("ingrese el name del empleado");
		sc.nextLine();
		return sc.nextLine();
	}
	
	private boolean askCivilStatus() {
		System.out.println("ingrese 'true' si es casado o 'false' si no lo es");
		return sc.nextBoolean();
	}

	private double askBaseSalary() {
		System.out.println("ingrese el sueldo del empleado");
		int value = sc.nextInt();
		double returnValue = (double) value;
		return returnValue;
	}
	
	private int askChildsNumber() {
		System.out.println("ingrese el numero de hijos del empleado");
		return sc.nextInt();
	}
	
	private int askExtraHours() {
		System.out.println("ingrese las horas extras del empleado");
		return sc.nextInt();
	}
	
	private double askIRPFtype() {
		System.out.println("ingrese el valor de IRPF del empleado");
		int value = sc.nextInt();
		double returnValue = (double) value;
		return returnValue;
		 
	}
	
	public void setValueExtraHour() {
		System.out.println("Ingrese el valor de la hora extra de los empleados:");
		Empleado.setValueExtraHour(sc.nextInt());
	}
	
	public void sortAndPrintEmployees() {
		manager.sortAndPrintEmployees();
	}
	
}
	
