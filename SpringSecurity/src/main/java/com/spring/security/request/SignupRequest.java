package com.spring.security.request;

import java.util.Set;

public class SignupRequest {

	private String userName;
	private String email;
	private String password;
	private Set<String> role;
	
	

	public SignupRequest(String userName, String email, String password, Set<String> role) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public Set<String> getRole() {
		// TODO Auto-generated method stub
		return role;
	}

}
