package com.james.mini_amazon.modal;

import java.util.List;

public class Electronic {

	private Long id;
	private String department;
	private String name;
	private Integer number;
	private Double price;
	private Boolean wifi;
	private String system;
	private String color;
	private List<CusterReview> reviews;

	public Electronic() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<CusterReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<CusterReview> reviews) {
		this.reviews = reviews;
	}

}
