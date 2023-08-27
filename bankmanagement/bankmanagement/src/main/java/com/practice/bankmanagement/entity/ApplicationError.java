package com.practice.bankmanagement.entity;

public class ApplicationError {
	
	private Integer Errorcode;
	private String Errordescription;
	private Throwable ExactError;
	
	
	public Integer getErrorcode() {
		return Errorcode;
	}
	public void setErrorcode(Integer errorcode) {
		Errorcode = errorcode;
	}
	public String getErrordescription() {
		return Errordescription;
	}
	public void setErrordescription(String errordescription) {
		Errordescription = errordescription;
	}
	public Throwable getExactError() {
		return ExactError;
	}
	public void setExactError(Throwable exactError) {
		ExactError = exactError;
	}

}
