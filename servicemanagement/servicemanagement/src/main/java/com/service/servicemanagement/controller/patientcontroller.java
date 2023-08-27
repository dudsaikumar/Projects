package com.service.servicemanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.servicemanagement.entity.Patient;
import com.service.servicemanagement.myexception.SaiException;
import com.service.servicemanagement.service.patientservice;
@RestController
//@Tag(value="patientcontroller",description="patientdata curdoperation")
@RequestMapping("Patient")
public class patientcontroller {
	private Logger LOGGER=LoggerFactory.getLogger(patientcontroller.class);
	@Autowired
	private MailSender mailsender;
	

	@Autowired
	private patientservice service;
	
	
	
	
	
	@PostMapping
	public ResponseEntity<Patient>savepatient(@RequestBody Patient patient) throws SaiException {
		LOGGER.info("enters into savepatient method of patient controller ");
		service.savepatient(patient);
		
		SimpleMailMessage mailmessege=new SimpleMailMessage();
		mailmessege.setTo("perlapavan1998@gmail.com");
		mailmessege.setSubject("fun");

		mailmessege.setText("hii pavan this is sai");
		mailsender.send(mailmessege);
		
		
		
		LOGGER.debug("Patient:",patient);
		ResponseEntity<Patient>n=	ResponseEntity.ok().body(patient);
		LOGGER.info("exists into savepatient method of patient controller ");
		return n;
		
		
		
		
		/*service.savepatient(patient);

		return ResponseEntity.ok().body(patient);*/
		
	}

}
