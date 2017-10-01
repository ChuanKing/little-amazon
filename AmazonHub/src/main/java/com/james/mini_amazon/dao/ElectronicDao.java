package com.james.mini_amazon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

@Service
public class ElectronicDao extends CommonDao {

	private final static String SERVICE_NAME = "electronic-store";

	@Autowired
	private LoadBalancerClient loadBalancer;

	@SuppressWarnings("unchecked")
	public List<Object> getInventory() {
		ServiceInstance instance = loadBalancer.choose(SERVICE_NAME);
		return restTemplate.getForObject(instance.getUri(), List.class);
	}

}
