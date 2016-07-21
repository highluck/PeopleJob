package com.peoplejob.dto.board;

import java.util.ArrayList;
import java.util.Date;

import com.peoplejob.dto.account.Account;

public class SingleBoard {
	
	private int boardId;
	private int parentId;
	private String title;
	private String contents;
	private int count;
	private Date createDate;
	private int jobStatus;

	private String createId;
	private Account account;	
	private ArrayList<BoardComment> comment;

	public String getCreateId() {
		return createId;
	}
	
	public void setCreateId(String createId) {
		this.createId = createId;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(int jobStatus) {
		this.jobStatus = jobStatus;
	}

	public ArrayList<BoardComment> getComment() {
		return comment;
	}

	public void setComment(ArrayList<BoardComment> comment) {
		this.comment = comment;
	}
	
}
