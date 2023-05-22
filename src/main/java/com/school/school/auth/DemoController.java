package com.school.school.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/controller")
public class DemoController {
	private AuthenticationService authService;
	
	@GetMapping
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("hello");
		
	}
}
