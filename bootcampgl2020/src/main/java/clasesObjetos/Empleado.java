package clasesObjetos;

public class Empleado extends Persona{
	
	private int ID;	
	private double sueldoBase;
	private int horasExtrasEnElMEs;
	private double tipoIRPF;
	private static double importeHoraExtra = 10;
	
	public Empleado() {
		
	}
	
	public Empleado (int identificador) {
		ID = identificador;
	}
	
	public double calcularAdicionalHorasExtras() {
		return (importeHoraExtra * (double)horasExtrasEnElMEs);
	}
	
	public double calcularSueldoBruto() {
		return (sueldoBase += calcularAdicionalHorasExtras());
	}
	
	public double calcularRetenciones() {
		if(casado==true) {
			tipoIRPF -=2;
		}
		tipoIRPF-=numeroHijos;
		return (calcularSueldoBruto()*(tipoIRPF/100));
		
	}
	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtrasRealizadasEnElMEs() {
		return horasExtrasEnElMEs;
	}

	public void setHorasExtrasRealizadasEnElMEs(int horasExtrasRealizadasEnElMEs) {
		this.horasExtrasEnElMEs = horasExtrasRealizadasEnElMEs;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(float importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}
	
	
	
}
