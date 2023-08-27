package com.slokam1.doctor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctorpojo")
public class doctorpojo {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String spec;
	
	@Override
	public String toString() {
		return "doctorpojo [id=" + id + ", name=" + name + ", spec=" + spec + "]";
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
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}

}
