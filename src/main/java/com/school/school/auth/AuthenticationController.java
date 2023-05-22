package com.school.school.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.school.repos.UserRepo;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value="/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
	private final AuthenticationService authService;	
	@PostMapping(value="register")
	public ResponseEntity<AuthenticationResponse> register(
			@RequestBody RegisterRequest request){
				System.out.println("We are in man");
				return ResponseEntity.ok(authService.register(request)); 
	}
	
	@PostMapping(value="authenticate")
	public ResponseEntity<AuthenticationResponse> authenticate(
			@RequestBody AuthenticationRequest request){
				return ResponseEntity.ok(authService.authenticate(request));
		
		 
	}

}
