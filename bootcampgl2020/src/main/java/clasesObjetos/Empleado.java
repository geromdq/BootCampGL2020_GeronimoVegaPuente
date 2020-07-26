package clasesObjetos;

public class Empleado extends Persona implements Comparable<Empleado>{
	
	private int ID;	
    private static int IDCounter = 0;
	private double baseSalary;
	private int extraHours;
	private double IRPFtype;
	private static double valueExtraHour = 10;
	
	public Empleado() {
		this.ID = IDCounter++;
	}	
	
	public Empleado(String name, boolean civilStatus,  int childsNumber, double baseSalary, int extraHours,double iRPFtype) {
		super(name, civilStatus, childsNumber);
		this.ID = IDCounter++;
		this.baseSalary = baseSalary;
		this.extraHours = extraHours;
		IRPFtype = iRPFtype;
	}
	
	

	public double calculateAdditionalextraHours() {
		return (valueExtraHour * (double)extraHours);
	}
	
	public double calculateGrossSalary() {
		double grossSalary = (baseSalary + calculateAdditionalextraHours());
		return grossSalary;
	}
	
	public double calculateTaxes() {
		double IRPF = IRPFtype;
		if(civilStatus==true) {
			IRPF -=2;
		}
		IRPF-=childsNumber;
		return (calculateGrossSalary()*(IRPF/100));		
	}
	
	public double calculateNetSalary() {
		return (calculateGrossSalary()-calculateTaxes());
	}
	
	public String toString() {
		return (this.ID + " " + this.name + "\n Sueldo Base: " + this.baseSalary + "\n Horas extras: " +
				this.extraHours + "\n tipo IRPF: " + this.IRPFtype + "\n civilStatus: " + this.civilStatus + 
				"\n Numero de hijos: " + this.childsNumber); 
	}
	

	public int getID() {
		return ID;
	}

	public double getbaseSalary() {
		return baseSalary;
	}

	public void setbaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getextraHours() {
		return extraHours;
	}

	public void setextraHours(int extraHours) {
		this.extraHours = extraHours;
	}

	public double getIRPFtype() {
		return IRPFtype;
	}

	public void setIRPFtype(double IRPFtype) {
		this.IRPFtype = IRPFtype;
	}

	public static double getValueExtraHour() {
		return valueExtraHour;
	}

	public static void setValueExtraHour(double importeHoraExtra) {
		Empleado.valueExtraHour = importeHoraExtra;
	}

	@Override
	public int compareTo(Empleado o) {
		if (this.calculateNetSalary() < o.calculateNetSalary()) {
			return 1;
		}
		else return -1;
	}
	
	
	
}
