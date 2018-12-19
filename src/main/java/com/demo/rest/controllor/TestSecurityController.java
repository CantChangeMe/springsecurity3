package com.demo.rest.controllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurityController {

	@RequestMapping("/")
	public String sayhello() {
		return "Hello World";
	}
	
	@RequestMapping("/nonprotected")
	public String sayHelloNonProtected() {
		return "Hello World from nonprotected";
	}
	
	@RequestMapping("/protectedByUserRole")
	public String sayHelloProtectedByUserRole() {
		return "Hello World from protectedByUserRole";
	}
	
	@RequestMapping("/protectedByAdminRole")
	public String sayHelloProtectedByAdminRole() {
		return "Hello World from protectedByAdminRole";
	}
}
