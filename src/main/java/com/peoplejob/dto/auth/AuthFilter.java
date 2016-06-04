package com.peoplejob.dto.auth;

public class AuthFilter {

	private String email;
	private int authCode;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAuthCode() {
		return authCode;
	}
	public void setAuthCode(int authCode) {
		this.authCode = authCode;
	}
}
