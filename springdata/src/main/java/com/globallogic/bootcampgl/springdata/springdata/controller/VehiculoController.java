package com.globallogic.bootcampgl.springdata.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.springdata.springdata.models.Modelo;
import com.globallogic.bootcampgl.springdata.springdata.models.Tipo;
import com.globallogic.bootcampgl.springdata.springdata.models.Vehiculo;
import com.globallogic.bootcampgl.springdata.springdata.service.VehiculoService;
import com.globallogic.bootcampgl.springdata.springdata.service.VehiculoServiceImpl;

/**
 * Product Service Controller
 */
@RestController
public class VehiculoController {
	
	@Autowired
	VehiculoServiceImpl vehiculoService;
		
	@RequestMapping(value = "/vehicles")
	public ResponseEntity<Object> getVehicles() {
		return new ResponseEntity<>(vehiculoService.getVehiculos(), HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/vehicles",method = RequestMethod.POST)
	public ResponseEntity<Object> createVehiculo(@RequestBody Vehiculo vehiculo) {	
		vehiculoService.createVehiculo(vehiculo);
		return  new ResponseEntity<>("Vehiculo was created successfully", HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/vehicles/{codigo}",method = RequestMethod.PUT)
	public ResponseEntity<Object> updateVehiculo(@PathVariable("codigo") int codigo, @RequestBody Vehiculo vehiculo) {	
		vehiculoService.updateVehiculo(codigo,vehiculo);
		return  new ResponseEntity<>("Vehiculo was updated successfully", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/vehicles/{codigo}",method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteVehiculo(@PathVariable("codigo") int codigo) {	
		vehiculoService.deleteVehiculo(codigo);
		return  new ResponseEntity<>("Vehiculo was deleted successfully", HttpStatus.OK);
	}

}
