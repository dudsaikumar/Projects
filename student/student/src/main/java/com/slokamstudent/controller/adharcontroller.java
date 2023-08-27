package com.slokamstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokamstudent.entity.adhar;
import com.slokamstudent.repo.adharRepo;
@RestController
@RequestMapping("adhar")
public class adharcontroller {
	@Autowired
	private adharRepo repo;
	
	@PostMapping()
	public void saveadhar(@RequestBody adhar adhar) {
		repo.save(adhar);
		
	}
	
	

}
