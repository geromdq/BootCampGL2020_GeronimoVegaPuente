package clasesObjetos;

public class Persona {
	
	protected String name;
	protected boolean civilStatus;
	protected int childsNumber;
	
	public Persona () {
		
	}
	
	public Persona(String name , boolean civilStatus, int childsNumber) {
		this.name = name;
		this.civilStatus = civilStatus;
		this.childsNumber = childsNumber;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public boolean iscivilStatus() {
		return civilStatus;
	}
	public void setcivilStatus(boolean civilStatus) {
		this.civilStatus = civilStatus;
	}
	public int getchildsNumber() {
		return childsNumber;
	}
	public void setchildsNumber(int childsNumber) {
		this.childsNumber = childsNumber;
	}

}
