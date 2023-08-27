package com.practice.bankmanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bankmanagement.entity.Employee;
import com.practice.bankmanagement.myexception.validException;
import com.practice.bankmanagement.repo.Employeerepo;
import com.practice.bankmanagement.service.Employeeservice;
@RestController
@RequestMapping("Employee")
public class Employeecontroller {
	
	private Logger logger=LoggerFactory.getLogger(Employeecontroller.class);
	@Autowired
	private Employeerepo repo;
	@Autowired
	private Employeeservice ser;
	
	@PostMapping()
	public ResponseEntity<Employee>saveemployee(@RequestBody Employee employee) throws validException{
		logger.info("starts saveemployee method from employeecontroller class");
		
		ser.saveemployee(employee);
		logger.debug("employee :",employee);
		
		ResponseEntity<Employee>re=ResponseEntity.ok().body(employee);
		
		logger.info("exists saveemployee method from employeecontroller class");
		
		
		return re;
             		
	}

}
