package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input="";
		String result="";
		
		
		System.out.print("문장 입력: ");
		input=scan.nextLine();
		
		for(int i=input.length()-1; i>=0; i--) {
			result+=input.charAt(i);
		}
		
		System.out.printf("역순 결과: \"%s\"",result);
		
	}
}




