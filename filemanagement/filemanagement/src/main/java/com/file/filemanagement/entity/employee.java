package com.file.filemanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
public class employee {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Integer age;
	private String department;
	
	@Pattern(regexp = "^[A-Z]{3}[0-9]{5}$")
	private String rationcard;
	
	public Long getId() {
		return id;
	}
	public void setId(Long i) {
		this.id = i;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRationcard() {
		return rationcard;
	}
	public void setRationcard(String rationcard) {
		this.rationcard = rationcard;
	}

}
