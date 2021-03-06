package com.spring.boot.crud.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

	@GetMapping("/welcome/{name}")
	public String getWelcomeMsg(@PathVariable String name) {
		return "Hi " + name + " , welcome to springbootcrudapp ............!!!!!!!!!!!!!!!!!!!!";

	}
}
