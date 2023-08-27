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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.file.filemanagement.Repo.employeeRepo;
import com.file.filemanagement.entity.employee;
@RestController
@RequestMapping("employee")
public class employeecontroller {
	@Autowired
	private employeeRepo p;
	
	@PostMapping("/upload")
	public ResponseEntity<String>saveempdata(MultipartFile employeefile){
		try {
			
			String filepath="D://"+employeefile.getOriginalFilename();
			employeefile.transferTo(new File(filepath));
			
			
			List<employee>employee=Files.lines(Paths.get(filepath)).map((d)->{
				employee e=new employee();
			String values[]=	d.split(",");
			
			e.setId(Long.parseLong(values[0]));
			e.setName(values[1]);
			e.setAge(Integer.parseInt(values[2]));
			e.setDepartment(values[3]);
			e.setRationcard(values[4]);
			
			return e;
			
			
			
			
			}
					
					
					
					
					
					
					
					
					
					).filter((f)->{
						if(f.getName()==null||f.getName().trim().length()<1) {
							return false;
						}
						if(f.getAge()<20||f.getAge()>50) {
							return false;
						}
						if(!Pattern.matches("^[A-Z]{3}[0-9]{5}$", f.getRationcard())) {
						return false;
						}
						return true;
					}
							
							
							
							
							).collect(Collectors.toList());
			p.saveAll(employee);
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}catch(IOException h) {
			h.printStackTrace();
		}
		
		
		
		
		return ResponseEntity.ok("done");
		
	}

}
