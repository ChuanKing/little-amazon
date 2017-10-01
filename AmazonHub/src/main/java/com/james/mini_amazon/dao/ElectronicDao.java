package com.james.mini_amazon.dao;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class ElectronicDao extends CommonDao {

	@Autowired
	private DiscoveryClient client;
	
	@SuppressWarnings("unchecked")
	public List<Object> getInventory() {
		
//		List<ServiceInstance> list = client.getInstances("electronic-store");
//        if (list != null && list.size() > 0 ) {
//      	URI uri = list.get(0).getUri();
//	      	if (uri !=null ) {
//	      		return restTemplate.getForObject(uri, List.class);
//	      	}
//        }
//        return null;
		return new ArrayList<>();
	}

}
