package com.service.servicemanagement.service;

import com.service.servicemanagement.entity.Patient;
import com.service.servicemanagement.myexception.SaiException;

public interface patientservice {
	
	public void savepatient(Patient patient) throws SaiException;
		
	
	
	

}
