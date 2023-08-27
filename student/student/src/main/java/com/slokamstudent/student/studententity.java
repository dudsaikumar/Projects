package com.slokamstudent.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studententity")
public class studententity {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer age;
	private String qual;
	private Integer marks;
	@Override
	public String toString() {
		return "studententity [id=" + id + ", name=" + name + ", age=" + age + ", qual=" + qual + ", marks=" + marks
				+ "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}
