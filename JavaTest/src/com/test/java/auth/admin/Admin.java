package com.test.java.auth.admin;

import java.util.Scanner;

import com.test.java.auth.auth.Auth;

public class Admin {

	public static void somthing() {

		if(Auth.auth == null || Auth.auth.getLv().equals("1")) {
			System.out.println();
			System.out.println("관리자만 접근가능합니다");
			System.out.println();
			return;
		}
		
		System.out.println("관리자 전용 기능입니다.");
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		
	}

}
