package com.erp.view;

import java.util.Scanner;

import com.erp.controller.ErpController;
import com.erp.model.vo.LoginMember;

public class ErpView {

	public static void startManu() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop=true;
		
		while(loop) {
			System.out.println("======================");
			System.out.println("안녕하세요, ㈜쌍용아이티 인사관리 ERP 입니다.");
			System.out.println("======================");
			System.out.println("1. 로그인");
			System.out.println("2. 프로그램 종료");
			System.out.print("입력: ");
			String input=scan.nextLine();
			if(input.equals("1")) {
				ErpController.loginMenu();
			}else if(input.equals("2")) {
				loop=false;
			}
		}
	}

	public static void longinMenu() {
		LoginMember lm=new LoginMember();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id=scan.nextLine();
		
		System.out.print("비번: ");
		String ps=scan.nextLine();
		
		lm.setId(id);
		lm.setPs(ps);
		
		ErpController.loginCheck(lm);
		
	}
	
	
	
	
	
}
