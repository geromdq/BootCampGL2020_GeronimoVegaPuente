package com.globallogic.bootcampgl.springData2.springData2.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.bootcampgl.springData2.springData2.models.Carrera;
import com.globallogic.bootcampgl.springData2.springData2.repository.CarreraRepository;
import com.globallogic.bootcampgl.springData2.springData2.exception.RepeatIdException;

@Component
public class CarreraServiceImpl implements CarreraService{
	
	 @Autowired
	 CarreraRepository carreraRepository;
	 
	 private static List<Carrera> LCarreras = new ArrayList<Carrera>();

	
	@Override
	public Collection<Carrera> getCarreras() {
		LCarreras.clear();
		carreraRepository.findAll().forEach(LCarreras::add);	
	return LCarreras;
	}

	@Override
	public void createCarrera(Carrera carrera) {
		
		try {
			for (int i = 0; i <= LCarreras.size(); i++) {
				if (carrera.getId() == LCarreras.get(i).getId()) {
					throw new RepeatIdException();
				}
			}
		} catch (Exception repeatIdException) {
			System.out.println(repeatIdException.getMessage());
		}
		carreraRepository.save(carrera);
	}


	@Override
	public void updateCarrera(int  id, Carrera carrera) {
		carreraRepository.deleteById(id);
		carrera.setId(id);
		carreraRepository.save(carrera);
		
	}

	@Override
	public void deleteCarrera(int id) {
		carreraRepository.deleteById(id);
		
	}




	

}
