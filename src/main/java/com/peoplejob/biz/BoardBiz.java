package com.peoplejob.biz;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.peoplejob.common.DaoContainer;
import com.peoplejob.dao.AccountDAO;
import com.peoplejob.dao.BoardDAO;
import com.peoplejob.dto.account.AccountFilter;
import com.peoplejob.dto.board.Board;
import com.peoplejob.dto.board.BoardComment;
import com.peoplejob.dto.board.BoardFilter;
import com.peoplejob.dto.board.BoardPagingFilter;
import com.peoplejob.dto.board.SingleBoard;
import com.peoplejob.dto.response.LoginResponse;

public class BoardBiz {

	@Autowired
	private DaoContainer dao;
	
	public ArrayList<Board> SelectBoardList(BoardPagingFilter filter) throws Exception{	
		return dao.getBoardDao().SelectBoardList(filter);
	}
	
	public int GetPageCount(BoardPagingFilter filter){
		return dao.getBoardDao().GetPageCount(filter);
	}
	
	public SingleBoard GetBoard(BoardFilter filter) throws Exception{
		SingleBoard board = dao.getBoardDao().GetBoard(filter);
		AccountFilter accountFilter = new AccountFilter();
	    accountFilter.setId(board.getCreateId());
		
	    board.setAccount(dao.getAccountDao().GetAccount(accountFilter));
		board.setComment(dao.getBoardCommentDao().SelectBoardCommentList(filter));
		
		return board;
	}
	
	public LoginResponse SetBoard(Board board){
		return dao.getBoardDao().SetBoard(board);
	}
	
	public LoginResponse SetBoardComment(BoardComment board){
		return dao.getBoardCommentDao().SetBoardComment(board);
	}
}
