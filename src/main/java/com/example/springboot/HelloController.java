package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String str = "Greetings from Spring Boot + Tanzu! I'm writing in GitHub.";
		return str;
	}

}
