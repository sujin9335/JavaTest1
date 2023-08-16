package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		
//		요구사항
//		숫자 2개를 입력받아 아래의 연산식을 출력하시오.
//		
//		조건..
//		출력 숫자에 천단위 표기 하시오.
//		결과값은 소수 이하 1자리까지 표기 하시오.
		
//		1.스캐너 생성
//		2.입력 문구 생성
//		3.입력받은 숫자 2개를 계산
//		4.출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		int num1=scan.nextInt();
		System.out.println("두번째 숫자: ");
		int num2=scan.nextInt();
		
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %.1f\n",num1,num2,num1/(double)num2);
		System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
		
		
		
		
		
		
		
		
		
	}
}
