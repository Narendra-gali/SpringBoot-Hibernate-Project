package com.springboot.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int laptopId;
	private String laptopName;
	private String laptopRam;

	public Laptop() {
		super();
	}

	public Laptop(String laptopName, String laptopRam) {
		super();
		this.laptopName = laptopName;
		this.laptopRam = laptopRam;

	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public String getLaptopRam() {
		return laptopRam;
	}

	public void setLaptopRam(String laptopRam) {
		this.laptopRam = laptopRam;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopRam=" + laptopRam + "]";
	}

}
