package com.example.usermetadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UsermetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermetadataApplication.class, args);
		System.out.println("SERVER STARTED ..................");
	}






	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://vik-amazon-clone-frontend.herokuapp.com","http://localhost:3000");
			}
		};
	}

}
