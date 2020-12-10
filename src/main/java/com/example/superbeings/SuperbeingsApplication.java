package com.example.superbeings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SuperbeingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperbeingsApplication.class, args);
	}

	
	@Value("${mapBoxApiUrl}")
	private String mapBoxApiUrl;
	
	@Bean(name="mapBoxApiUrl")
	public String mapBoxApiUrl() {
		return mapBoxApiUrl;
	}
}
