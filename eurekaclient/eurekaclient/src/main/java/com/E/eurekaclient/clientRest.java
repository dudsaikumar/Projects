package com.E.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientRest {
	    @GetMapping("test1")
        public String test1() {
        	System.out.println("hii hello how are you");
			return "hii";
        	
        }

}
