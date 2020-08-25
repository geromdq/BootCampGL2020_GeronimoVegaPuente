package com.globallogic.bootcampgl.springData2.springData2.models;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="competidor")
public class Competidor {
	
	@Id	
	private int numero;
	private String nombre;

}
