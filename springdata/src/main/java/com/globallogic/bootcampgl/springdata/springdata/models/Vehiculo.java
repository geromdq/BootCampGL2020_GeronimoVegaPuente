package com.globallogic.bootcampgl.springdata.springdata.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

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
	private int codigo =12345;
	private String identificacion = "AB-123-CD";
	private String fechaProduccion = "2020-08-17";
	
	@JoinColumn(name = "tipo_id", unique = true)
	 @OneToOne(cascade = CascadeType.ALL)
	private Tipo tipo = new Tipo();
	 
	 @JoinColumn(name = "modelo_id", unique = true)
	 @OneToOne(cascade = CascadeType.ALL)
	private Modelo modelo = new Modelo();
	

}
