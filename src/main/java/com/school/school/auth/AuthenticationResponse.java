package com.school.school.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public  class AuthenticationResponse {
	private String token;

	public String getToken(String jwt) {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
