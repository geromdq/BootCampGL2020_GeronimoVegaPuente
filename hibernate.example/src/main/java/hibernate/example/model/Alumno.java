package hibernate.example.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;



@Entity
@Table (name = "alumno")
public class Alumno {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "nombre2")
	private String apellido;
	
	public Alumno () {
		
	}
	
	public Alumno(int id, String name, String apellido) {
		super();
		this.id = id;
		this.nombre = name;
		this.apellido = apellido;		
	}
	
	public String toString() {
		return nombre + " " +apellido;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return nombre;
	}
	public void setName(String name) {
		this.nombre = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
