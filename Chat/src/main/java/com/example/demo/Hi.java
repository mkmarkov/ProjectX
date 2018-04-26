package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {
	
	@RequestMapping("/Hello")
	public String SayHi() {
		return "Hi";
	}

}
