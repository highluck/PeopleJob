package com.peoplejob.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.peoplejob.dao.AccountDAO;
import com.peoplejob.dao.AuthDAO;
import com.peoplejob.dao.BoardDAO;



public class DaoContainer {

	private BoardDAO boardDao;
	private AccountDAO accountDao;
	private AuthDAO authDao;
	
	public AccountDAO getAccountDao() {
		return accountDao;
	}
	public void setAccountDao(AccountDAO accountDao) {
		this.accountDao = accountDao;
	}
	public AuthDAO getAuthDao() {
		return authDao;
	}
	public void setAuthDao(AuthDAO authDao) {
		this.authDao = authDao;
	}
	public BoardDAO getBoardDao() {
		return boardDao;
	}
	public void setBoardDao(BoardDAO boardDao) {
		this.boardDao = boardDao;
	}	
}
