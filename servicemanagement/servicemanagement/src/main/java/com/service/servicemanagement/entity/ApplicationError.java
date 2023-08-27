package com.service.servicemanagement.entity;

public class ApplicationError {
	private Integer errorcode;
	private String errordescription;
	private Throwable exacterror;
	
	public Integer getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(Integer errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrordescription() {
		return errordescription;
	}
	public void setErrordescription(String errordescription) {
		this.errordescription = errordescription;
	}
	public Throwable getExacterror() {
		return exacterror;
	}
	public void setExacterror(Throwable exacterror) {
		this.exacterror = exacterror;
	}

}
