package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

	@RequestMapping(value="/test")
	public String test(){
		return "Hello world!!!!!!!!!!!!!!";
 }
}
