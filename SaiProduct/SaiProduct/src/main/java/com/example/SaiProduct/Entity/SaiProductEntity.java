package com.example.SaiProduct.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SaiProductEntity {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double price;
	private String quality;
	@Override
	public String toString() {
		return "SaiProductEntity [id=" + id + ", name=" + name + ", price=" + price + ", quality=" + quality + "]";
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}

}
