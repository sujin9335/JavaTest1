package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String mail="";
		
		
		System.out.printf("이메일: ");
		mail=scan.nextLine();
		
		String id=mail.substring(0, mail.indexOf('@'));
		String domain=mail.substring(mail.indexOf('@')+1);
		
		
		System.out.println("아이디: "+id);
		System.out.println("도메인: "+domain);
		
		
		
	}
}




