package com.test.question;

import java.util.Scanner;

public class Q028 {

	public static void main(String[] args) {
		
//		요구사항
//		근무 년수를 입력받아 아래와 같이 출력하시오.
//
//		조건..
//		1 ~ 4년차: 초급 개발자
//		5 ~ 9년차: 중급 개발자
//		10년차 이상: 고급 개발자
//		유효성 검사를 하시오.(1 미만 입력 예외 처리)
		
		Scanner scan = new Scanner(System.in);
		
		int input;
		
		System.out.print("근무 년수: ");
		input=scan.nextInt();
		
		if(1<=input) {
			if(input<=4) {
				System.out.printf("%d년차 초급 개발자 입니다 \n",input);
				System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다",5-input);
			}else if(input<=9) {
				System.out.printf("%d년차 중급 개발자 입니다 \n",input);
				System.out.printf("당신은 %d년전까지 초급 개발자였습니다\n",input-4);
				System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다",10-input);
			}else if(10<=input) {
				System.out.printf("%d년차 고급 개발자 입니다 \n",input);
				System.out.printf("당신은 %d년전까지 중급 개발자였습니다\n",input-9);
			}
			
			
			
			
		}else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오");
		}
		
		
		
	}
}






