package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		
//		요구사항
//		사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
//
//		조건..
//		사각형 넓이 = 너비 * 높이
//		사각형 둘레 = 너비 * 2 + 높이 * 2
		
//		1.스캐너 생성
//		2.너비 높이 입력
//		3.넓이 계산, 둘레 계산
//		4.출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("너비(cm): ");
		int ver=scan.nextInt();
		System.out.println("높이(cm): ");
		int hor=scan.nextInt();
		
		int result1=ver*hor;
		int result2=ver*2+hor*2;
		
		System.out.printf("사각형의 넓이는 %dcm^2입니다", result1);
		System.out.printf("사각형의 둘레는 %dcm입니다", result2);
		
		
		
		
		
	}
}
