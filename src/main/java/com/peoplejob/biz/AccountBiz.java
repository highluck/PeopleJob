package com.peoplejob.biz;



import org.springframework.beans.factory.annotation.Autowired;

import com.peoplejob.common.DaoContainer;
import com.peoplejob.dao.AccountDAO;
import com.peoplejob.dto.account.Account;
import com.peoplejob.dto.account.AccountFilter;
import com.peoplejob.dto.response.CommonResponse;
import com.peoplejob.dto.response.LoginResponse;

public class AccountBiz {
	
	@Autowired
	private DaoContainer dao;
	
	public LoginResponse Login(AccountFilter filter){
		LoginResponse response = new LoginResponse();
		String result = dao.getAccountDao().Login(filter);
		
		if(result.equals("FAIL")){
			response.setReason("비밀번호가 틀렸습니다.");
			response.setResult("false");
		}
		else{
			response.setResult("true");
			response.setToken(filter.getEmail());
			response.setAccount(dao.getAccountDao().GetAccount(filter));
		}	
		
		return response;
	}
	
	public LoginResponse SetAccount(Account account){
		return dao.getAccountDao().SetAccount(account);
	}
	
	public Account GetAccount(AccountFilter filter){
		return dao.getAccountDao().GetAccount(filter);
	}
}
