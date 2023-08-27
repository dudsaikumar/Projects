package com.slokamstudent.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="adhar")
public class adhar {
	@Id
	@GeneratedValue
	private Integer id;
	private String number;
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkaid")
	private person person;
	
	public person getPerson() {
		return person;
	}
	public void setPerson(person person) {
		this.person = person;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

	

}
