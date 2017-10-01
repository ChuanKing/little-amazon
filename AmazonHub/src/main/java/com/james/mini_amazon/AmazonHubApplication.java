package com.james.mini_amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AmazonHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonHubApplication.class, args);
	}
}
