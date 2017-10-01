package com.james.mini_amazon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.mini_amazon.dao.BookDao;
import com.james.mini_amazon.dao.ElectronicDao;
import com.james.mini_amazon.dao.HomeKitchenDao;

@Service
public class AmazonHubService {
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private ElectronicDao electronicDao;
	
	@Autowired
	private HomeKitchenDao homeKitchenDao;
	
	public List<Object> getInventory() {
		List<Object> result = new ArrayList<>();
		
		result.addAll(bookDao.getInventory());
		result.addAll(electronicDao.getInventory());
		result.addAll(homeKitchenDao.getInventory());
		
		return result;
	}
}
