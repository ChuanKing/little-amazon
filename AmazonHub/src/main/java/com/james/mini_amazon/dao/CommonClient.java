package com.james.mini_amazon.dao;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("BOOK-STORE")
public interface CommonClient {
	
	@GetMapping("/")
	public List<Object> getInventory();
}
