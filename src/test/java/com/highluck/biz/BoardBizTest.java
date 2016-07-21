package com.highluck.biz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.peoplejob.dao.AccountDAO;
import com.peoplejob.dao.BoardDAO;
import com.peoplejob.dto.account.Account;
import com.peoplejob.dto.account.AccountFilter;
import com.peoplejob.dto.board.Board;
import com.peoplejob.dto.board.BoardFilter;
import com.peoplejob.dto.board.BoardPagingFilter;
import com.peoplejob.dto.board.SingleBoard;

import junit.framework.Assert;

public class BoardBizTest {

	private BoardDAO boardDao;
	private AccountDAO accountDao;
	
	@Before
	public void setUp(){
		ApplicationContext context =  new GenericXmlApplicationContext("context-IocContainer.xml");
		      this.boardDao = (BoardDAO) context.getBean("boardDAO");	
		      this.accountDao = (AccountDAO) context.getBean("accountDAO");	
	}
	@Test
	public void GetBoard() {
	
		BoardFilter filter = new BoardFilter();
		AccountFilter accountFilter = new AccountFilter();
		filter.setBoardId(1);
		SingleBoard board = boardDao.GetBoard(filter);
		accountFilter.setId(board.getCreateId());
		Account account = accountDao.GetAccount(accountFilter);
		
		Assert.assertNotNull(1); 
		
	}

}
