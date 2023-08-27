package com.slokam1.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doctorcontroller {
	@Autowired
	private doctorRepo doctorrepo;
	@PostMapping("savedoctor")
	public void savedoctor(@RequestBody doctorpojo d) {
		System.out.println(d);
		doctorrepo.save(d);
		
	}

}
