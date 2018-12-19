package com.demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.demo.rest.config.SecurityConfig;

@EnableAutoConfiguration
@ComponentScan({"com.demo.rest.config","com.demo.rest.controllor"})
@Configuration
@Import({SecurityConfig.class})
public class Springsecurity3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecurity3Application.class, args);
	}

}

