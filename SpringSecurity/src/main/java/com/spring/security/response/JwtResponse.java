package com.spring.security.response;

import java.util.List;

public class JwtResponse {

	private String jwt;
	private Long id;
	private String email;
	private String username;
	private List<String> roles;

	public JwtResponse(String jwt, Long id, String username, String email, List<String> roles) {
		this.jwt=jwt;
		this.id=id;
		this.username=username;
		this.email=email;
		this.roles=roles;
		// TODO Auto-generated constructor stub
	}
	
	

}
