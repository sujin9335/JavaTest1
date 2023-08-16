package com.project.erpsystem.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.erpsystem.dao.LoginMemberDao;
import com.project.erpsystem.dao.MemberDao;
import com.project.erpsystem.dao.PayDao;
import com.project.erpsystem.vo.Member;
import com.project.erpsystem.vo.PayVo;

public class ErpView {

	public static void startView() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop=true;
		while(true) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("안녕하세요, ㈜쌍용아이티 인사관리 ERP 입니다.");
			System.out.println("----------------------------------------------------------------------");
			
			System.out.println("1. 로그인");
			System.out.println("2. 프로그램 종료");
			System.out.print("입력(1,2): ");
			String input=scan.nextLine();
			
			if(input.equals("1")) { // 로그인 선택시 로그인 화면 
				loginView();
			}else if(input.equals("2")) { // 2번선택시 종료
				loop=false;
			}
		}
		
	}

	private static void loginView() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========================================");
		System.out.print("아이디: ");
		String id=scan.nextLine();
		System.out.print("비밀번호: ");
		String pw=scan.nextLine();
		
		LoginMemberDao.savaLoginMember(); // login list가 비어있어 멤버추가 메소드, 나중에 프로그램 실행시 로그인정보데이터 불러오게만들어야됨
		
		if(LoginMemberDao.loginCheck(id,pw)) {
			memberView();
		}else {
			System.out.println("아이디 또는 비밀번호가 틀립니다");
			loginView();
		}
		
		
	}


	private static void memberView() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("3. 급여 명세서 확인");
		System.out.println("4. 조직도, 부서별 현황 조회");
		
		System.out.print("입력: ");
		String input=scan.nextLine();
		
		if(input.equals("3")) {
			payStupView();
		}else if(input.equals("4")) {
			organizationView();
		}
		
	}

	private static void organizationView() {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("1. 조직도 조회");
		System.out.print("2. 부서별 현황 조회");
		System.out.print("3. 메인화면으로 돌아가기");
		String input=scan.nextLine();
		
		
		if(input.equals("1")) {
			System.out.println("조직도 촤락");
			scan.nextLine();
			organizationView();
		}else if(input.equals("2")) {
			System.out.println("부서명선택");
			System.out.println("1~6");
			System.out.print("입력: ");
			String inputDepartment=scan.nextLine();
			ArrayList<Member> dp=MemberDao.getDepartment(inputDepartment);
			
			scan.nextLine();
			organizationView();
			
		}
		
		
		
		
		
		
	}

	private static void payStupView() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회년도: ");
		String inputYear=scan.nextLine();
		
		System.out.print("조회월: ");
		String inputMonth=scan.nextLine();
		
		PayVo pay=PayDao.getPay(inputYear, inputMonth);
		
		String result="김수진님의 급여명세서";
		
		result=String.format("%,d %,d %,d", pay.getBasicPay(), 1, 1);
		
		System.out.println("계속하시려면 엔터");
		scan.nextLine();

		System.out.println("===========================");
		System.out.println("1. 재조회");
		System.out.println("2. 메인화면");
		
		System.out.print("입력: ");
		String input=scan.nextLine();
		
		if(input.equals("1")) {
			payStupView();
		}else if(input.equals("2")) {
			memberView();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
}
