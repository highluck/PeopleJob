package com.peoplejob.dto.account;

public class AccountFilter {
	
	private String id;
	private String email;
	private String nickname; 
	private String securityCode;
	
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
