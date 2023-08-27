package com.service.servicemanagement.Exchandle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.service.servicemanagement.entity.ApplicationError;
import com.service.servicemanagement.myexception.SaiException;
@RestControllerAdvice
public class ExceptionHandlers {
	private Logger LOGGER=LoggerFactory.getLogger(ExceptionHandlers.class);
	
	
	
	
	
	
	
	
	
	@ExceptionHandler(SaiException.class)
	public ResponseEntity<ApplicationError>sendexception(SaiException exception){
		LOGGER.info("enter into send exception method of exception handler calss");
	
		ApplicationError ae=new ApplicationError();
		ae.setErrorcode(2453);
		ae.setErrordescription(exception.getMessage());
		ae.setExacterror(exception);
		
		ResponseEntity<ApplicationError>h=	ResponseEntity.badRequest().body(ae);
		
		LOGGER.info("exists into send exception method of exception handler calss");

		return h;
		
	}

}
