package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input="";
		String result="";
		
		System.out.print("숫자: ");
		input=scan.nextLine();
		
		
		String rever="";
		
		
		int count=1;
		
		for(int i=input.length()-1; i>=0; i--) { //입력 숫자 뒤집기
			rever+=input.charAt(i);
			if(count%3 == 0) rever+=",";
			count++;
		}
		
		if(rever.lastIndexOf(',') == rever.length()-1) {
			rever=rever.substring(0,rever.length()-1);
		}
		
//		System.out.println(rever); //숫자 확인용
			
		for(int i=rever.length()-1; i>=0; i--) { //입력 숫자 뒤집기
			result+=rever.charAt(i);
			
		}
		
		System.out.println("결과: "+result);
			
		
		
		
	}
}




