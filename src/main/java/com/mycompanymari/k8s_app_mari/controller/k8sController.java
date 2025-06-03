package com.mycompanymari.k8s_app_mari.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class k8sController {
	
//	http://localhost:8080/api/v1/greet
	@GetMapping("/greet")
	public String greetings() {
		return "Welcome to the world of kubernetes!";
	}

}
