package com.peoplejob.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.peoplejob.common.DaoContainer;
import com.peoplejob.dto.board.BoardPagingFilter;
import com.peoplejob.library.Json;

@Controller
public class RecommendController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private DaoContainer dao;
	
	 @RequestMapping(value="/board/highcount.do", method = RequestMethod.GET)
	  public void GetBoardHighcountList(@ModelAttribute BoardPagingFilter filter, HttpServletResponse response) throws Exception{
		 
		  Json.getJson().ReturnJSON(response, dao.getRecommendDao().GetHighCountBoardList());
	  }
	
	 @RequestMapping(value="/board/recently.do", method = RequestMethod.GET)
	 public void GetBoardRecentlyList(@ModelAttribute BoardPagingFilter filter, HttpServletResponse response) throws Exception{
		 
		 Json.getJson().ReturnJSON(response, dao.getRecommendDao().GetRecentlyBoardList());
	 }
	 
}
