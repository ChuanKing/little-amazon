package com.james.mini_amazon.dao;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookDao extends CommonDao {

	@SuppressWarnings("unchecked")
	public List<Object> getInventory() {
		return restTemplate.getForObject("http://" + "book-store", List.class);
	}

}
