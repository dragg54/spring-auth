package com.school.school.auth;
import com.school.school.config.JWTAuthentication.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.school.school.models.User;
import com.school.school.models.Data.Role;
import com.school.school.repos.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	private final UserRepo repo;
	private final PasswordEncoder passwordEncoder;
	private final JWTService jwtService = new JWTService();
	private final AuthenticationManager authManager;

	public AuthenticationResponse register(RegisterRequest request) {
		User user = User.builder().firstName(request.getFirstName()).lastName(request.getLastName())
				.email(request.getEmail()).password(request.getPassword(passwordEncoder.encode(request.getPassword())))
				.role(Role.USER).build();
		repo.save(user);
		var jwt = jwtService.generateToken(user);
		AuthenticationResponse response = new AuthenticationResponse();
		response.setToken(jwt);
	
		return response;

	}

	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		authManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						request.getEmail(),
						request.getPassword()
						));
		return null;
	}
}
