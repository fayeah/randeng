package com.randeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableScheduling
public class RDApplication {

	public class RDMvcConfigurer implements WebMvcConfigurer {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**").allowedOrigins("*");//.allowedMethods("PUT", "POST", "DELETE", "GET");
		}
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new RDMvcConfigurer();
	}

	public static void main(String[] args) {
		SpringApplication.run(RDApplication.class, args);
	}
}
