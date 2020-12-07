package com.jlib.via.ams.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmsApiApplication.class, args);
	}
	

}
