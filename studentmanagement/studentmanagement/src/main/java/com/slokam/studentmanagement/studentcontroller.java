package com.slokam.studentmanagement;

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

import com.slokam.studentmanagement.entity.student;

@RestController
@RequestMapping("slokam")
public class studentcontroller{
	
	@Autowired
	private studentRepo repo;
	
	@PostMapping()
	public ResponseEntity<student> savestudent(@Valid@RequestBody student std1) {
		
		//std1.getPass().setStd(std1);
		repo.save(std1);
		ResponseEntity<student>s=new ResponseEntity<student>(HttpStatus.CREATED);
		return s;
	}
	
	/* @GetMapping("/{pptno}") 
	 public ResponseEntity<student> getstudentbypass(@Valid@PathVariable String pptno) {
		 
	  student student=repo.ggetStudentBypptno(pptno);
	  student.getPass().setStd(null);
	  ResponseEntity<student>re=new ResponseEntity<>(student,HttpStatus.OK);
	  
	  
	  
	  return re;
	  
	  }*/
	public ResponseEntity<String>uploaddata(){
		
		
		return null;
		
	}
	 
	 
}
