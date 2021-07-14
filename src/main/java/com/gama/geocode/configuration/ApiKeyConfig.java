package com.gama.geocode.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class ApiKeyConfig {
	
	@Value("${apiKey}")
	//@PropertySource("classpath:apikey.properties")
	private String apiKey;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertyConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}	
}