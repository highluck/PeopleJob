package com.peoplejob.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.peoplejob.biz.AuthBiz;
import com.peoplejob.dto.account.AccountFilter;
import com.peoplejob.dto.auth.AuthFilter;
import com.peoplejob.dto.response.CommonResponse;
import com.peoplejob.library.Json;

@Controller
public class AuthController {
	
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private AuthBiz authBiz;
	  
	  @RequestMapping(value="/auth/nickname/{nickname}/overlab.do", method = RequestMethod.GET)
	  public void OverlabNickname(@ModelAttribute AccountFilter filter, HttpServletResponse response) throws Exception{
		
		  Json.getJson().ReturnJSON(response, authBiz.OverlabNickname(filter));		  
	  }
	  
	  @RequestMapping(value="/auth/email/{email}/overlab.do", method = RequestMethod.GET)
	  public void OverlabEmail(@ModelAttribute AccountFilter filter, HttpServletResponse response) throws Exception{
		  
		  Json.getJson().ReturnJSON(response, authBiz.OverlabEmail(filter));		  
	  }
	  
	  @RequestMapping(value="/email/{email}/authcode.do", method = RequestMethod.GET)
	  public void SendEmail(@ModelAttribute AccountFilter filter, HttpServletResponse response) throws Exception{
		  
		  Json.getJson().ReturnJSON(response, authBiz.OverlabEmail(filter));		  
	  }
	  
	  @RequestMapping(value="/auth/authCode.do", method = RequestMethod.GET)
	  public void SetAuthCode(@ModelAttribute AuthFilter filter, HttpServletResponse response) throws Exception{
		 
		  Json.getJson().ReturnJSON(response, authBiz.EmailAuth(filter));		  
	  }
}
