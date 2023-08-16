package com.test.question;

import java.util.Scanner;

public class Q091 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input="";
		String oper="";
		int count=0;
		String before="";
		String after="";
		int beforeS=0;
		int afterS=0;
		int result=0;
		
		
		System.out.print("입력: ");
		input=scan.nextLine();
		
		
		input=input.replace(" ", ""); //공백제거
		
//		System.out.println(input);
		
		for(int i=0; i<input.length(); i++) { //연산자 확인
			if(input.charAt(i) == '+' || input.charAt(i) == '-' ||
					input.charAt(i) == '*' || input.charAt(i) == '/' || input.charAt(i) == '%') {
				oper+=input.charAt(i);
				count++;
			}
		}
//		before=input.substring(0, input.indexOf(oper));
//		after=input.substring(input.indexOf(oper)+1);
		
		
		
		if(count == 1) { //1일경우는 연산자가 있는경우임
			before=input.substring(0, input.indexOf(oper));
			after=input.substring(input.indexOf(oper)+1);
			if(before.equals("") || after.equals("")) { //연산자 기준 전후로 나누어서 공백이면 피연산자 부족
				System.out.println("피연산자가 부족합니다");
			}else {
				beforeS=Integer.parseInt(input.substring(0, input.indexOf(oper)));
				afterS=Integer.parseInt(input.substring(input.indexOf(oper)+1));
				
				switch(oper) {
					case "+" : System.out.printf("%d %s %d = %d",beforeS,oper,afterS,beforeS+afterS);break;
					case "-" : System.out.printf("%d %s %d = %d",beforeS,oper,afterS,beforeS-afterS);break;
					case "*" : System.out.printf("%d %s %d = %d",beforeS,oper,afterS,beforeS*afterS);break;
					case "/" : System.out.printf("%d %s %d = %d",beforeS,oper,afterS,beforeS/afterS);break;
					case "%" : System.out.printf("%d %s %d = %.1f",beforeS,oper,afterS,beforeS%(double)afterS);break;
				}
			}
		}else {
			System.out.println("연산자가 올바르지 않습니다");
		}
		
//		System.out.println(before);
//		System.out.println(after);
		
	}
	
	
}
