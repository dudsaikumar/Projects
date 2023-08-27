package com.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.test.entity.ClientStudent;
import com.example.test.entity.outer;

public class Main {
	
public static void main1(String[] args) {
	RestTemplate resttemplate=new RestTemplate();
	ResponseEntity<ClientStudent>cs=resttemplate.getForEntity("http://localhost:8080/getstudentbyid/1", ClientStudent.class);
	ClientStudent std=cs.getBody();
	System.out.println(std);
	System.out.println(cs.getStatusCode());
	//https://gorest.co.in/public/v1/users/11
	
}
public static void main2(String[] args) {
	RestTemplate resttemplate=new RestTemplate();
	ResponseEntity<outer>out=resttemplate.getForEntity("https://gorest.co.in/public/v1/users/55", outer.class);
	outer std=out.getBody();
	System.out.println(std);
	System.out.println(out.getStatusCode());
	
}
public static void main3(String[] args) {

	RestTemplate resttemplate=new RestTemplate();
	ClientStudent std=new ClientStudent();
	std.setName("jafar");

	std.setAge(24);
	std.setMarks(95);
	std.setQual("mca");
	ResponseEntity<Main> t=resttemplate.postForEntity("http://localhost:8080/savestudent",std, Main.class);
	

    System.out.println(t.getStatusCodeValue());
	
}
public static void main4(String[] args) {

	RestTemplate resttemplate=new RestTemplate();
	ClientStudent std=new ClientStudent();
	std.setId(2);
	std.setName("noor");

	std.setAge(17);
	std.setMarks(100);
	std.setQual("inter");
	ResponseEntity<Main> t=resttemplate.postForEntity("http://localhost:8080/savestudent",std, Main.class);
	

    System.out.println(t.getStatusCodeValue());
	
}
public static void main(String[] args) {

	RestTemplate resttemplate=new RestTemplate();
	ClientStudent std=new ClientStudent();
	std.setId(2);
	std.setName("noor");

	std.setAge(17);
	std.setMarks(100);
	std.setQual("inter");
	//ResponseEntity<Main> t=resttemplate.("http://localhost:8080/savestudent",std, Main.class);
	

   // System.out.println(t.getStatusCodeValue());
	
}
}
