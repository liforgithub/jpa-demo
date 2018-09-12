package com.example.jpa.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
		@PropertySource(value = "classpath:environment.properties", ignoreResourceNotFound = true)
})
@SpringBootApplication
@ComponentScan("com.example.jpa.jpademo.repository")
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}
}
