package com.wipro.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StudentRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestApiApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate  getRestTemplate() {
		
		return new RestTemplate();
		
	}

}
