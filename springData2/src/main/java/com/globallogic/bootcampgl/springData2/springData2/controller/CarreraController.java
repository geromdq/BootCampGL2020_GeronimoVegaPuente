package com.globallogic.bootcampgl.springData2.springData2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.springData2.springData2.models.Carrera;
import com.globallogic.bootcampgl.springData2.springData2.service.CarreraServiceImpl;



@RestController
public class CarreraController {
	
	@Autowired
	CarreraServiceImpl CarreraService;
		
	@RequestMapping(value = "/carreras")
	public ResponseEntity<Object> getCarreras() {
		return new ResponseEntity<>(CarreraService.getCarreras(), HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/carreras",method = RequestMethod.POST)
	public ResponseEntity<Object> createCarrera(@RequestBody Carrera carrera) {	
		CarreraService.createCarrera(carrera);
		return  new ResponseEntity<>("Carrera was created successfully", HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/carreras/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Object> updateCarrera(@PathVariable("id") int id, @RequestBody Carrera carrera) {	
		CarreraService.updateCarrera(id,carrera);
		return  new ResponseEntity<>("Carrera was updated successfully", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/carreras/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteCarrera(@PathVariable("id") int id) {	
		CarreraService.deleteCarrera(id);
		return  new ResponseEntity<>("Carrera was deleted successfully", HttpStatus.OK);
	}

}
