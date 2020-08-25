package com.globallogic.bootcampgl.springdata.springdata.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


@Table(name="vehiculo")
public class Vehiculo {
	
	@Id
	private int codigo;
	private String identificacion;
	private String fechaProduccion;
	
	@JoinColumn(name = "tipo_id", unique = true)
	 @OneToOne(cascade = CascadeType.ALL)
	private Tipo tipo;
	 
	 @JoinColumn(name = "modelo_id", unique = true)
	 @OneToOne(cascade = CascadeType.ALL)
	private Modelo modelo;
	

}
