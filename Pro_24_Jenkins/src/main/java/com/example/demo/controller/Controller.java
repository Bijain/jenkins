package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public String hola() {
		return "Hola Mundo desde Jenkins + Docker!";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "Hola otra vez";
	}
}
