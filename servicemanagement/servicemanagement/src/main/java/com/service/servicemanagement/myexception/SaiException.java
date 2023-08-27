package com.service.servicemanagement.myexception;

public class SaiException extends Exception{
	public SaiException() {
		
	}
	public SaiException(String messege) {
		super(messege);
	}
	public SaiException(String messege,Throwable thro) {
		super(messege,thro);
	}

}
