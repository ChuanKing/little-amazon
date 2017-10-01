package com.james.mini_amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.mini_amazon.service.AmazonHubService;

@RestController
public class AmazonHubController {
	
	@Autowired
	private AmazonHubService amazonHubService;
	
	@RequestMapping("/inventory")
	public List<Object> getInventory() {
		return amazonHubService.getInventory();
	}
	
	@RequestMapping("/health-check")
	public String health() {
		return "I am healthy";
	}
	
}
