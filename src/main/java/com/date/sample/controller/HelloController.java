package com.date.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/admin")
	public String helloAdmin(String name) {
		return "Hello Admin Jagan" + name;
	}
	
}
