package com.techcloudmicro.bigbucketdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path = "/")
	public String helloWorld() {
		return "Hello World";
	}
}
