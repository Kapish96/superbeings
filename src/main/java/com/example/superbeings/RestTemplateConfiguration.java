package com.example.superbeings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
	
	@Bean(name="mapBoxApiRestTemplate")
	public RestTemplate mapBoxApiRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

}
