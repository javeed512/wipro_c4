package com.wipro.restcrud.restcontroller;

import javax.xml.ws.soap.Addressing;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	/*
	 * @ResponseStatus(reason = "Some error occur at global level",code =
	 * HttpStatus.BAD_REQUEST)
	 * 
	 * @ExceptionHandler(ArithmeticException.class) public void handler() {
	 * 
	 * 
	 * System.out.println("Handler executed..");
	 * 
	 * }
	 */
	
	
	@ExceptionHandler(Exception.class)
	public  ResponseEntity<String>   handler() {
		
		
		System.out.println("Handler executed..");
		
		return new ResponseEntity<String>("Arithmetic Exp Occur",HttpStatus.BAD_REQUEST);
		
		
		
	}
	
	

}
