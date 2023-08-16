package com.test.question;

import java.util.Scanner;

public class Q087 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input="StudentName";
		String result="";
		
		
//		System.out.print("단어: ");
//		input=scan.nextLine();
		
		result+=input.charAt(0);
		for(int i=1; i<input.length(); i++) {
			if('A' <= input.charAt(i) && input.charAt(i) <= 'Z') result+=" ";
			result+=input.charAt(i);
			
		}
		
		System.out.println("결과: "+result);
		
	}
}
