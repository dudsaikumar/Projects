package com.practice.bankmanagement.Exceptionhandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.practice.bankmanagement.entity.ApplicationError;
import com.practice.bankmanagement.myexception.validException;

@RestControllerAdvice
public class Exceptionhandler {
	
	private Logger logger=LoggerFactory.getLogger(Exceptionhandler.class);

	public ResponseEntity<ApplicationError>finding(validException vexc){
		
		logger.info("starts finding method in application error class");
		
		ApplicationError ap=new ApplicationError();
		ap.setErrorcode(1234);
		ap.setErrordescription(vexc.getMessage());
		ap.setExactError(vexc);
		
		ResponseEntity<ApplicationError>g=ResponseEntity.ok().body(ap);
		logger.info("exists finding method in application error class");

		
		
		return g;
		
	}
	public void husenbee() {
		
		
	}

	
}
