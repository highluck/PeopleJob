package com.peoplejob.dao;

import com.peoplejob.common.AbstractDAO;
import com.peoplejob.dto.account.AccountFilter;
import com.peoplejob.dto.auth.AuthFilter;


public class AuthDAO extends AbstractDAO{
	
	public int OverlabEmail(AccountFilter filter){
		
		return (int)selectOne("Auth.overlabEmail",filter);
	}
	
	public int OverlabNickname(AccountFilter filter){
		
		return (int)selectOne("Auth.overlabNickname",filter);
	}
	
	public void SetAuthCode(AuthFilter filter){
		
		insert("Auth.setAuthCode",filter);
	}
	
	public String EmailAuth(AuthFilter filter){
		System.out.println(filter.getEmail());
		System.out.println(filter.getAuthCode());
		return (String)selectOne("Auth.getEmailAuth",filter);
	}
}
