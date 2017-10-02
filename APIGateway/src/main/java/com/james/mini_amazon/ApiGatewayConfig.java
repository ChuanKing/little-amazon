package com.james.mini_amazon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.james.mini_amazon.filters.SimpleFilter;

@Configuration
public class ApiGatewayConfig {

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
