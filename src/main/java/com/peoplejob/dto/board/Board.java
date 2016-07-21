package com.peoplejob.dto.board;

import java.io.Serializable;
import java.util.Date;

import com.peoplejob.dto.account.Account;

public class Board implements Serializable{

	private int boardId;
	private int parentId;
	private String title;
	private String contents;
	private int count;
	private Date createDate;
	private Account account;
	
	private String createId;
	private String nickName;
	private String company;
	private int jobStatus;
	
	public int getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(int jobStatus) {
		this.jobStatus = jobStatus;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
}
