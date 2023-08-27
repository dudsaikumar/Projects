package com.mammu.projectmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

@Entity
public class person {
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	private String name;
	@Range(min = 20,max = 30)
	private Integer age;
	private String nativeplace;
	
	public String getVotercard() {
		return votercard;
	}
	public void setVotercard(String votercard) {
		this.votercard = votercard;
	}
	@Pattern(regexp = "^[A-Z]{5}[1-9]{4}[A-Z]{2}$")
	private String votercard;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkaid")
	private adhar adh;

	
	public adhar getAdh() {
		return adh;
	}
	public void setAdh(adhar adh) {
		this.adh = adh;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getNativeplace() {
		return nativeplace;
	}
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

}
