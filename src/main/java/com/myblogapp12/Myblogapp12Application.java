package com.myblogapp12;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Myblogapp12Application {

	public static void main(String[] args) {

		SpringApplication.run(Myblogapp12Application.class, args);
	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
