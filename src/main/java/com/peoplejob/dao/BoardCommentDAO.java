package com.peoplejob.dao;

import java.util.ArrayList;

import com.peoplejob.common.AbstractDAO;
import com.peoplejob.dto.board.Board;
import com.peoplejob.dto.board.BoardComment;
import com.peoplejob.dto.board.BoardFilter;
import com.peoplejob.dto.response.LoginResponse;

public class BoardCommentDAO extends AbstractDAO {

	public ArrayList<BoardComment> SelectBoardCommentList(BoardFilter filter)throws Exception{
		return (ArrayList<BoardComment>)selectList("BoardComment.getCommentList",filter);
    }
	
	public LoginResponse SetBoardComment(BoardComment comment) {
		// TODO Auto-generated method stub
		LoginResponse response = new LoginResponse();
		try{
			insert("BoardComment.setBoardComment",comment);
			response.setResult("Success");

		}catch(Exception e){		
			response.setReason(e.toString());
			response.setResult("Fail");
		}
		return response;
	}
}
