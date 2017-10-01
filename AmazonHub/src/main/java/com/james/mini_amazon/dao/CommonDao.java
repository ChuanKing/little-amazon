package com.james.mini_amazon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public abstract class CommonDao {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	public List<Object> getInventory;
}
