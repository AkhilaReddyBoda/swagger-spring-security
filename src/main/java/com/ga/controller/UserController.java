package com.ga.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "greenapex")
public class UserController {

	@RequestMapping(value = "/welcome")
	public String welcome() {
		return "hello";
	}

}
