package com.service.servicemanagement.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.servicemanagement.Repo.patientRepo;
import com.service.servicemanagement.entity.Patient;
import com.service.servicemanagement.myexception.SaiException;
import com.service.servicemanagement.service.patientservice;

@Service
public class serviceimpl implements patientservice{
	private Logger LOGGER=LoggerFactory.getLogger(serviceimpl.class);
	@Autowired
	private patientRepo repo;

	
	 @Override 
	 public void savepatient(Patient patient) throws SaiException {
		 LOGGER.info("enters savepatient method for service impl");
		Patient p= repo.findByNameAndPnumber(patient.getName(), patient.getPnumber());
		if(p==null) {
			repo.save(patient);
			LOGGER.debug("patient has",patient);
			
		}
		else {
			LOGGER.warn("correct your name and pnumber");
			throw new SaiException("this name&pnumber already exists");
		}
		LOGGER.info("exists savepatient method for service impl");
	 }
	 
	
	

}
