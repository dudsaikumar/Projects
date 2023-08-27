package com.mammu.projectmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class adhar {
	@Id
	@GeneratedValue
	private Long aid;
	private Integer anumber;
	private String alocation;
	private String atype;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private person person;

	
	
	public person getPerson() {
		return person;
	}
	public void setPerson(person person) {
		this.person = person;
	}
	
	public Long getAid() {
		return aid;
	}
	public void setAid(Long aid) {
		this.aid = aid;
	}
	public Integer getAnumber() {
		return anumber;
	}
	public void setAnumber(Integer anumber) {
		this.anumber = anumber;
	}
	public String getAlocation() {
		return alocation;
	}
	public void setAlocation(String alocation) {
		this.alocation = alocation;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}

}
