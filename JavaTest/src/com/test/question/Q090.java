package com.test.question;

import java.util.Scanner;

public class Q090 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input="";
		
		int sum=0;
		
		System.out.print("입력: ");
		input=scan.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			if('0' <= input.charAt(i) && input.charAt(i) <= '9') sum+=input.charAt(i)-48;
		}
		
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다",sum);
		
		
	}
}



