package com.james.mini_amazon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonHubController {
	@RequestMapping("/health-check")
	public String health() {
		return "I am healthy";
	}
}
