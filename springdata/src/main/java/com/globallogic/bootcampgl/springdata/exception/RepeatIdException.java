package com.globallogic.bootcampgl.springdata.exception;

public class RepeatIdException extends Exception{		
	

	public RepeatIdException() {
		super("Prueba con otro ID este ya existe");
	}
}

