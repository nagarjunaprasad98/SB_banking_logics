package com.relationalMapper.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/message")
	public String message() {
		return "Welcome to SB Application";
	}

}
