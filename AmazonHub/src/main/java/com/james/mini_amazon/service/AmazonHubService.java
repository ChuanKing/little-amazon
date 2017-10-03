package com.james.mini_amazon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.mini_amazon.dao.CommonClient;
import com.james.mini_amazon.dao.CommonDao;

@Service
public class AmazonHubService {
	
	@Autowired
	private CommonDao dao;
	
	@Autowired
	private CommonClient client;
	
	public List<Object> getInventory() {
		List<Object> result = new ArrayList<>();
		
		result.addAll(client.getInventory());
		result.addAll(dao.getInventory(CommonDao.ELECTRONIC_STORE_SERVICE));
		result.addAll(dao.getInventory(CommonDao.HOMEKITCHEN_STORE_SERVICE_NAME));
		
		return result;
	}
}
