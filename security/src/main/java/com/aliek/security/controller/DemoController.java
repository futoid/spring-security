package com.aliek.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "This is the welcome page!";
	}
	
	
}
