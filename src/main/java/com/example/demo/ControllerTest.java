package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
	@RequestMapping("/test")
	public String helloWorld() {
		return "No, no, no hellow world.";
	}

}
