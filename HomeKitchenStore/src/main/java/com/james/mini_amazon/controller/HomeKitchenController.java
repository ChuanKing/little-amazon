package com.james.mini_amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.mini_amazon.modal.HomeKitchen;
import com.james.mini_amazon.service.HomeKitchenService;

@RestController
public class HomeKitchenController {
	
	@Value("${health.check.word}")
	private String healthCheckWord;
	
	@Autowired
	private HomeKitchenService homeKitchenService;
	
	@RequestMapping("/")
	public List<HomeKitchen> getAllBooks() {
		return homeKitchenService.getAllHomeKitchens();
	}
	
	@RequestMapping("/{id}")
	public HomeKitchen getBookById(@PathVariable("id") Long id) {
		return homeKitchenService.getHomeKitchenById(id);
	}
	
	@RequestMapping("/health-check")
	public String health() {
		return this.healthCheckWord;
	}
}
