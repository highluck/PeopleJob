package com.peoplejob.dao;

import java.util.ArrayList;

import com.peoplejob.common.AbstractDAO;
import com.peoplejob.dto.board.Board;
import com.peoplejob.dto.board.BoardPagingFilter;

public class RecommendDAO extends AbstractDAO{

	public ArrayList<Board> GetHighCountBoardList() throws Exception{
        return (ArrayList<Board>)selectList("Recommend.getHighCountBoard");
    }
	
	public ArrayList<Board> GetRecentlyBoardList() throws Exception{
		return (ArrayList<Board>)selectList("Recommend.getRecentlyBoard");
	}
}
