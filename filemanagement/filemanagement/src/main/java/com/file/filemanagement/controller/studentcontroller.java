package com.file.filemanagement.controller;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.file.filemanagement.Repo.studentRepo;
import com.file.filemanagement.entity.Student;
@RestController
@RequestMapping("Student")
public class studentcontroller {
	@Autowired
	private studentRepo repo;
	
	/*@PostMapping("file")
	public ResponseEntity<String>responseentity(@RequestParam("filedata")MultipartFile student){
		
		System.out.println();
		
		
		
		
		return null;
		
	}*/
	
	
	
	
	
	
	//[map is a functional interface it calls only one method,it has two parametres they are string and return]
	//[map takes string and gives anyone like integer,double,objectetc....]
	
	         
	   
	@PostMapping("/upload")
	public ResponseEntity<String>uploadsstudentdata( MultipartFile studentfile)  {
		try {
		String filepath="D:\\"+studentfile.getOriginalFilename();
		studentfile.transferTo(new File(filepath));
		
		List<Student>students=Files.lines(Paths.get(filepath)).map((st)->{
			
			Student std=new  Student();
			String[]values=st.split(",");
			
			std.setId(Long.parseLong(values[0]));
			std.setName(values[1]);
			std.setAge(Integer.parseInt(values[2]));
			std.setQual(values[3]);
			std.setPancard(values[4]);
			return std;

			
			
		}).filter((s)->{
			if(s.getName()==null||s.getName().trim().length()<2) {
				return false;
			}
			if(s.getAge()<20||s.getAge()>50) {
				return false;

				
			}
			if(!Pattern.matches("^[A-Z]{5}[1-9]{4}[a-z]{2}$", s.getPancard())) {
				return false;
				
			}
			return true;

			
		}
				
				
				
				
				).collect(Collectors.toList());
		repo.saveAll(students);
				
				
	
				
				
				
				
				
		
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		return ResponseEntity.ok("done");

		
	}


}

