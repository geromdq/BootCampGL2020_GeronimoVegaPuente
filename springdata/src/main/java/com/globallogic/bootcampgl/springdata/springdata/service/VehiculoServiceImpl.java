package com.globallogic.bootcampgl.springdata.springdata.service;
import java.util.ArrayList;
import org.springframework.ui.Model;
import java.util.Collection;
import java.util.List;
import java.util.Map;


import javax.swing.event.ListSelectionEvent;
import com.globallogic.bootcampgl.springdata.exception.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.bootcampgl.springdata.springdata.models.Vehiculo;
import com.globallogic.bootcampgl.springdata.springdata.repository.VehiculoRepository;


@Component
public class VehiculoServiceImpl implements VehiculoService{
	
	 private static List<Vehiculo> LVehiculos = new ArrayList<Vehiculo>();
	 
	 @Autowired
	 VehiculoRepository vehiculoRepository;

	@Override
	public Collection<Vehiculo> getVehiculos() {
		LVehiculos.clear();
		 vehiculoRepository.findAll().forEach(LVehiculos::add);	
	return LVehiculos;
	}

	@Override
	public void createVehiculo(Vehiculo vehiculo) {		
		try {
			for (int i = 0; i <= LVehiculos.size(); i++) {
				if (vehiculo.getCodigo() == LVehiculos.get(i).getCodigo()) {
					throw new RepeatIdException();
				}
			}
		} catch (Exception repeatIdException) {
			System.out.println(repeatIdException.getMessage());
		}
		vehiculoRepository.save(vehiculo);	
	}
	
	@Override
	public void updateVehiculo(int codigo, Vehiculo vehiculo) {
		vehiculoRepository.deleteById(codigo);
		vehiculo.setCodigo(codigo);
		vehiculoRepository.save(vehiculo);		
	}

	@Override
	public void deleteVehiculo(int codigo) {
		vehiculoRepository.deleteById(codigo);
	}

}
