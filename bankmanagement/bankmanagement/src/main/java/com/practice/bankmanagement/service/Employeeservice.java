package com.practice.bankmanagement.service;

import com.practice.bankmanagement.entity.Employee;
import com.practice.bankmanagement.myexception.validException;

public interface Employeeservice {
	
	public void saveemployee(Employee employee) throws validException;

}
