package com.erp.controller;

import com.erp.model.dao.LoginDao;
import com.erp.model.vo.LoginMember;
import com.erp.view.ErpView;

public class ErpController {

	public static void startVeiw() {
		ErpView.startManu();
	}

	public static void loginMenu() {
		ErpView.longinMenu();
	}

	public static void loginCheck(LoginMember lm) {

		LoginDao.loginCheck(lm);
		
		
	}

	
	
	
}
