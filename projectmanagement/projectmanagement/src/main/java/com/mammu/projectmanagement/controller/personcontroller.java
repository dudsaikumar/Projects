package com.mammu.projectmanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mammu.projectmanagement.Repo.perosnRepo;
import com.mammu.projectmanagement.entity.person;
@RestController
@RequestMapping("per")
public class personcontroller {
	@Autowired
	private perosnRepo prepo;
	
     @PostMapping()
	public ResponseEntity<person> saveinfo(@Valid@RequestBody person per) {
    	 //per.getAdh().setPerson(per);
    	 
		prepo.save(per);
		
		ResponseEntity<person>p=new ResponseEntity<person>(HttpStatus.CREATED);
		return p;
		
	}
	@GetMapping("/{number}")
	public ResponseEntity<person>getbyanumber(@Valid@PathVariable Integer number){
		person pn=prepo.getbyanumber(number);
		ResponseEntity<person>person=new ResponseEntity<>(pn,HttpStatus.OK);
		return person;
		
	}
}
