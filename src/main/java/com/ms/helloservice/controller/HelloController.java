package com.ms.helloservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.helloservice.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@GetMapping("/hello")
	public String getHelloMessage() {
		return helloService.sayHello();
	}
}
