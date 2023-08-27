package com.practice.bankmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.bankmanagement.entity.Employee;
@Repository
public interface Employeerepo extends JpaRepository<Employee, Long>{
	
	public  Employee findByNameAndAge(String name,Integer age); 

}
