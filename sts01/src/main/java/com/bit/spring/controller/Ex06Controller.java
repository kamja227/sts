package com.bit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex06Controller {

	@RequestMapping("/ex06/*")
	// "/views/ex06/아무거나가능"
	public String ex06() {
		System.out.println("/ex06/*"); // http://localhost:8080/spring/ex06/
		return "ex06";
	}
	
	@RequestMapping("/ex06") 
	public String ex05() {
		System.out.println("/ex06"); // http://localhost:8080/spring/ex06
		return "ex06";
	}
}
