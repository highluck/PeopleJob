package com.peoplejob.dto.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.peoplejob.dto.board.Board;

public class Account {
	
	private int id;
	private String email;
	private String nickname;
	private String password;
	private String company;
	private int emailConfirm;
	private int jobConfirm;
	private Date joinDate;
	private ArrayList<Board> board;
	
	public ArrayList<Board> getBoard() {
		return board;
	}
	public void setBoard(ArrayList<Board> board) {
		this.board = board;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getEmailConfirm() {
		return emailConfirm;
	}
	public void setEmailConfirm(int emailConfirm) {
		this.emailConfirm = emailConfirm;
	}
	public int getJobConfirm() {
		return jobConfirm;
	}
	public void setJobConfirm(int jobConfirm) {
		this.jobConfirm = jobConfirm;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	

}
