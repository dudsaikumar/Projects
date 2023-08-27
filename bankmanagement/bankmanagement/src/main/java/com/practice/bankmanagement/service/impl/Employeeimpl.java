package com.practice.bankmanagement.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.bankmanagement.entity.Employee;
import com.practice.bankmanagement.myexception.validException;
import com.practice.bankmanagement.repo.Employeerepo;
import com.practice.bankmanagement.service.Employeeservice;
@Service
public class Employeeimpl implements Employeeservice {
	private Logger logger=LoggerFactory.getLogger(Employeeimpl.class);
	@Autowired
	private Employeerepo repo;
     
	public void saveemployee(Employee employee) throws validException {
    	 
    	logger.info("starts saveemployee method in employee impl claas");
		
		Employee e=repo.findByNameAndAge(employee.getName(), employee.getAge());
		
		if(e==null) {
			repo.save(employee);

			
		}else {
			logger.warn("yours employee name and age is not valid");
			throw new validException("employee name and age already exists");
		}
		
		logger.info("starts saveemployee method in employee impl claas");

		
	}
	
	

}
