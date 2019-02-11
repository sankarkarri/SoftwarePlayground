package com.d3op.mavenspringrun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MavenSpringRunController {
	
	@GetMapping(value = "/")
	public String checkApplication() {
	return "Hello, <br><br> The Maven Application with Spring boot is working! <br><br> Happy Learning,<br> D3OP";
	}

}
