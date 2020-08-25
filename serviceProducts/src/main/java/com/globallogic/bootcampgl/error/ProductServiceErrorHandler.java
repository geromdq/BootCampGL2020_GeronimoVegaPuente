package com.globallogic.bootcampgl.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import com.globallogic.bootcampgl.error.*;

@ControllerAdvice
public class ProductServiceErrorHandler {
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<JsonProperties> HttpMessageNotReadableException(HttpServletRequest request) {
		return ResponseEntity.badRequest().body(JsonProperties.builder()
				.status_code(400)
				.message("ERROR EN DATOS ESPERADOS")
				.uri(request.getRequestURI())
				.build());
		//return new ResponseEntity<String>("Error, mensaje mal Formado", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<JsonProperties> errorHandler(HttpServletRequest request){
		return ResponseEntity.badRequest().body(JsonProperties.builder()
				.status_code(HttpStatus.BAD_REQUEST.value())
				.message("ERROR MENSAJE MAL FORMADO")
				.uri(request.getRequestURI())
				.build());
	}
}
