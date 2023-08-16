package com.project.erpsystem.dao;

import java.util.ArrayList;

import com.project.erpsystem.vo.LoginMember;

public class LoginMemberDao {

	public static ArrayList<LoginMember> lm;
	
	static {
		new ArrayList<LoginMember>();
	}
	
	
	public static void savaLoginMember() {
		
		lm.add(new LoginMember("1", "add", "pw", "1111", "1"));
		lm.add(new LoginMember("1", "id", "pw", "1111", "2"));
		
		
	}


	public static boolean loginCheck(String id, String pw) {
		boolean ch=false;
		
		for(LoginMember list : lm) {
			if(list.getId().equals(id) && list.getPw().equals(pw)) {
				ch=true;
			}
		}
		
		
		
		return ch;
	}
	
	
	
	
	
}
