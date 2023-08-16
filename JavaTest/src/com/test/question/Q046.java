package com.test.question;

import java.util.Scanner;

public class Q046 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input=0;
		String sum="";
		
		
		for(int i=0; i<10; i++) {
			System.out.print("숫자: ");
			input=scan.nextInt();
		
			switch(input) {
				case 1 : sum+="일";break;
				case 2 : sum+="이";break;
				case 3 : sum+="삼";break;
				case 4 : sum+="사";break;
				case 5 : sum+="오";break;
				case 6 : sum+="육";break;
				case 7 : sum+="칠";break;
				case 8 : sum+="팔";break;
				case 9 : sum+="구";break;
			
			}
		}
		System.out.println(sum);
		
		
	
	}
}
