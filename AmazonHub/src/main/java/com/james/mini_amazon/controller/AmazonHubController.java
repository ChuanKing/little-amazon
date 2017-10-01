package com.james.mini_amazon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.james.mini_amazon.model.Book;
import com.james.mini_amazon.model.Electronic;
import com.james.mini_amazon.model.HomeKitchen;

@RestController
public class AmazonHubController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/inventory")
	public List<Object> getInventory() {
		List<Object> result = new ArrayList<>();
		
		List<Book> books = restTemplate.getForObject("http://localhost:58521/", List.class);
		List<Electronic> electronics = restTemplate.getForObject("http://localhost:58521/", List.class);
		List<HomeKitchen> homeKitchens = restTemplate.getForObject("http://localhost:58521/", List.class);		
		
		result.addAll(books);
		result.addAll(electronics);
		result.addAll(homeKitchens);
		
		return result;
	}
	
	@RequestMapping("/health-check")
	public String health() {
		return "I am healthy";
	}
	
}
