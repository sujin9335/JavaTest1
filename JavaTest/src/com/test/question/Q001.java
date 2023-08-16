package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		
//		요구사항
//		태어난 년도를 입력받아 나이를 출력하시오
		
		//1.스캐너 만들기
		//2.입력 문구
		//3.년도를 나이로 변환
		//4.출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("태어난 년도 입력: ");
		int age=scan.nextInt();
		int year=2023+1;
		int result;
		
		result=year-age;
		System.out.printf("나이: %d세\n",result);
		
		
		
		
	}
}
