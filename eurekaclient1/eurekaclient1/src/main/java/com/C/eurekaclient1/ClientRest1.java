package com.C.eurekaclient1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRest1 {
	
	@GetMapping("test2")
	public String test2() {
		System.out.println("hii hello how are you");
		return "hello";
		
	}
	
	
	

}
