package com.slokam.studentmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

//import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="student")
public class student {
	
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	private String name;
	@Range(min = 20,max = 30)
	private Integer age;
	private String qual;
	@Pattern(regexp = "^[A-Z]{4}[1-9]{4}[a-z]{4}$")
	private String pancard;
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "std")
	private passport pass;
	
	
	public passport getPass() {
		return pass;
	}
	public void setPass(passport pass) {
		this.pass = pass;
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
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}

}
