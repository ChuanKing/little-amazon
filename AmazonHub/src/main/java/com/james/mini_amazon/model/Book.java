package com.james.mini_amazon.model;

import java.util.List;

public class Book {

	private Long id;
	private String department;
	private String name;
	private Integer number;
	private Double price;
	private String publisher;
	private String publishYear;
	private String isbn;
	private List<CusterReview> reviews;

	public Book() {
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public List<CusterReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<CusterReview> reviews) {
		this.reviews = reviews;
	}

}
