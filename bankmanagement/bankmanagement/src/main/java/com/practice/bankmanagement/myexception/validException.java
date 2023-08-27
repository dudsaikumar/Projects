package com.practice.bankmanagement.myexception;

public class validException extends Exception {
	
	public validException() {
		
	}
	
	public validException(String messege) {
		super(messege);
		
		
	}
	
	public validException(String messege,Throwable thro) {
		super(messege,thro);
		
	}

}
