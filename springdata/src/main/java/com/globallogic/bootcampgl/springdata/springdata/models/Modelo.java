package com.globallogic.bootcampgl.springdata.springdata.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="modelo")
public class Modelo {	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo = 12345678;
	private String marca = "Global Motors";	
	private String nombre = "911 Programador";

}
