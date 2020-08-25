package com.globallogic.bootcampgl.springData2.springData2.service;

import java.util.Collection;

import com.globallogic.bootcampgl.springData2.springData2.models.Carrera;


public interface CarreraService {
	

	public abstract Collection<Carrera> getCarreras();
	
	public abstract void createCarrera(Carrera carrera);
	
	public abstract void updateCarrera (int codigo, Carrera carrera);
	
	public abstract void deleteCarrera (int codigo);

}