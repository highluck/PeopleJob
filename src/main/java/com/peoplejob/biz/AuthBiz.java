package com.peoplejob.biz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

import com.peoplejob.common.DaoContainer;
import com.peoplejob.common.LibraryContainer;
import com.peoplejob.dao.AuthDAO;
import com.peoplejob.dto.account.AccountFilter;
import com.peoplejob.dto.auth.AuthFilter;
import com.peoplejob.dto.auth.Email;
import com.peoplejob.dto.response.CommonResponse;
import com.peoplejob.dto.response.LoginResponse;
import com.peoplejob.library.AuthCode;
import com.peoplejob.library.EmailSender;



public class AuthBiz {
	
	@Autowired
	private DaoContainer dao;
	@Autowired
	private LibraryContainer library;
	
	//true 면 중복되는 이메일이 없다  그러므로 메일을 보냄 reason으로 이메일 보낸 결과를 알려쥼
	//false 이면 중복되는 이메일이 있다. 
	public CommonResponse OverlabEmail(AccountFilter filter) throws Exception{
		CommonResponse response = new CommonResponse();
		int result = dao.getAuthDao().OverlabEmail(filter);
	
		if(result > 0){
			response.setResult("false");
		}
		else{			
			int authCode = AuthCode.getAuthCode().RandomCode();
			response.setResult("true");
			Email email = new Email();
			AuthFilter authFilter = new AuthFilter();
			
			email.setContent("인증코드는" + authCode+ "입니다");
			email.setReceiver(filter.getEmail());
			email.setSubject("이메일 인증 안내");
			
			library.getEmailSender().setEmail(email);
			library.getTaskExecutor().execute(library.getEmailSender());
		
			authFilter.setEmail(filter.getEmail());
			authFilter.setAuthCode(authCode);
			dao.getAuthDao().SetAuthCode(authFilter);
		}			
		return response;
	}
	
	public CommonResponse OverlabNickname(AccountFilter filter){
		CommonResponse response = new CommonResponse();
		int result = dao.getAuthDao().OverlabNickname(filter);
		if(result > 0){
			response.setResult("false");
		}
		else{			
			response.setResult("true");
		}		
		return response;
	}	
	
	public CommonResponse EmailAuth(AuthFilter filter){
		CommonResponse response = new CommonResponse();
		String result = dao.getAuthDao().EmailAuth(filter);
		
		if(result.equals("FAIL")){
			response.setReason("인증코드가 틀렸습니다.");
			response.setResult("false");
		}
		else{
			response.setResult("true");
		}	
		
		return response;
	}
	

}
