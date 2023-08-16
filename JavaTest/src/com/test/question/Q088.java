package com.test.question;

import java.util.Scanner;

public class Q088 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] words= {"바보", "멍청이"};
		String input="";
		
		System.out.print("입력: ");
		input=scan.nextLine();
		
		
		int count=0;
		
		for(int i=0; i<words.length; i++) {// 금칙어 순서 변경for문
			int index=-1;

			while(true) { //긍칙어 확인시 count 증가
				
				index=input.indexOf(words[i], index);
				if(index == -1) break;
				count++;
				
				index+=words[i].length();
			}
		}
		
		
		
		
		for(int i=0; i<words.length; i++) {// 금칙어 *넣기
			input=input.replace(words[i], ch(words[i]));
		}
		
		System.out.println(input);
		if(0 < count) System.out.printf("금지어를 %d회 마스킹했습니다", count);
		
		
	}

	private static String ch(String words) {
		String result="";
		for(int i=0; i<words.length(); i++) {
			result+="*";
		}
		return result;
		 
		
	}

	
	
	
	
	
}



