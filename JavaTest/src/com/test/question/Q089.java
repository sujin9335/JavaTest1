package com.test.question;

import java.util.Scanner;

public class Q089 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액(원): ");
		String input=scan.nextLine();

		String result="";
		
		
		for(int i=0; i<input.length(); i++) { //숫자 한글로 변환
			
			switch(input.charAt(i)) {
				case '0' : result+=" ";break;
				case '1' : result+="일";break;
				case '2' : result+="이";break;
				case '3' : result+="삼";break;
				case '4' : result+="사";break;
				case '5' : result+="오";break;
				case '6' : result+="육";break;
				case '7' : result+="칠";break;
				case '8' : result+="팔";break;
				case '9' : result+="구";break;
			
			}
		}
//		System.out.println(result);
		
		String rever="";
		
		
		
//		예시)삼백 사십 오만 육천 칠백 팔십 구원
//		원구 십팔 백칠 천육     /  만오 십사 백삼
//		이런순으로 역순 접근 
		
		
		String[] a= {"","십","백","천"};
		String[] b= {"원","만"};
		
		for(int i=result.length()-1; i>=0; i--) { //숫자 역순
			rever+=result.charAt(i);
		}
		
//		System.out.println(rever);

		result="";
		
		for(int i=0; i<rever.length(); i++) { 
			
			if(i/4 == 0 && i%4 == 0) { //만 단위 +=
				result+=b[0];
			}else if(i/4 == 1 && i%4 == 0) {
				result+=b[1];
			}
			
			
			if(rever.charAt(i) != ' ') result+=a[i%4]+rever.charAt(i); //역순으로 누적
			
			
			
		}
		
		rever="";
		
		System.out.println(result);
		
		for(int i=result.length()-1; i>=0; i--) { //숫자 역순
			rever+=result.charAt(i);
		}
		
		System.out.println("일금 "+rever);
		
		
		
	}

}
