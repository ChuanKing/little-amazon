package com.james.mini_amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.mini_amazon.model.Book;
import com.james.mini_amazon.service.BookStoreService;

@RestController
@RefreshScope
public class BookStoreController {
	
	@Value("${health.check.word}")
	private String healthCheckWord;
	
	@Autowired
	private BookStoreService bookStoreService;
	
	@RequestMapping("/")
	public List<Book> getAllBooks() {
		return bookStoreService.getAllBooks();
	}
	
	@RequestMapping("/{id}")
	public Book getBookById(@PathVariable("id") Long id) {
		return bookStoreService.getBookById(id);
	}
	
	@RequestMapping("/health-check")
	public String health() {
		return this.healthCheckWord;
	}
}
