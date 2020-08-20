package com.globallogic.bootcampgl.springdata.springdata.service;

import java.util.Collection;

import com.globallogic.bootcampgl.springdata.springdata.models.Vehiculo;

public interface VehiculoService {
	

	public abstract Collection<Vehiculo> getVehiculos();
	
	public abstract void createVehiculo(Vehiculo vehiculo);
	
	public abstract void updateVehiculo (int codigo, Vehiculo vehiculo);
	
	public abstract void deleteVehiculo (int codigo);

}
