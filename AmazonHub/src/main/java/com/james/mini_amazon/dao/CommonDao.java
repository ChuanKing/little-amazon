package com.james.mini_amazon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommonDao {
	
	public final static String BOOK_STORE_SERVICE = "book-store";
	public final static String ELECTRONIC_STORE_SERVICE = "electronic-store";
	public final static String HOMEKITCHEN_STORE_SERVICE_NAME = "home-kitchen-store";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired 
	private LoadBalancerClient loadBalancer;
	
	@SuppressWarnings("unchecked")
	public List<Object> getInventory(String serviceName) {
		ServiceInstance instance = loadBalancer.choose(serviceName);
   		return restTemplate.getForObject(instance.getUri(), List.class);
	}
}
