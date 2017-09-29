package com.james.mini_amazon.modal;

import java.util.List;

public class HomeKitchen {

	private Long id;
	private String department;
	private String name;
	private Integer number;
	private Double price;
	private String manufacturer;
	private Double weight;
	private String color;
	private List<CusterReview> reviews;
	
	public HomeKitchen() {
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
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
