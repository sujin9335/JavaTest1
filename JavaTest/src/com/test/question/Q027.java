package com.test.question;

import java.util.Scanner;

public class Q027 {

	public static void main(String[] args) {
		
//		요구사항
//		문자 1개를 입력받아 아래와 같이 출력하시오.
//
//		조건..
//		f, F → Father
//		m, M → Mother
//		s, S → Sister
//		b, B → Brother
//		유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		char input;
		
		System.out.print("문자: ");
		input=scan.nextLine().charAt(0);
		
		
		if(input == 102|| input == 70 || input == 109 || input == 77 ||
			input == 115|| input == 83 || input == 98 || input == 66) {
			if(input == 102 || input == 70) {
				System.out.println("Father");
			}else if(input == 109 || input == 77) {
				System.out.println("Mother");
			}else if(input == 115 || input == 83) {
				System.out.println("Sister");
			}else if(input == 98 || input == 66) {
				System.out.println("Brother");
			}
			
			
			
		}else {
			System.out.println("입력한 문자가 올바르지 않습니다");
		}
		
		
	}
	
	
}







