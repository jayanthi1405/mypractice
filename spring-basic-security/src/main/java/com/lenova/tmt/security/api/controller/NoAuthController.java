package com.lenova.tmt.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//for url based security
@RestController
public class NoAuthController {

	@GetMapping("/hello")
	public String hello() {
		return "hi";
	}

}
