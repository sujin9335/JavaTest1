package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		
//		요구사항
//		섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
//
//		조건..
//		℉ = ℃ × 1.8 + 32
//		소수 입력 가능
//		소수 이하 1자리까지 출력하시오.
		
//		1.스캐너생성
//		2.안내메시지 출력
//		3.섭씨 입력
//		4.섭씨 화씨 변환
//		5.결과 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("섭씨('C): ");
		double tempC=scan.nextDouble();
		double tempF=tempC*1.8+32;
		
		System.out.printf("섭씨 %.1f\'C는 화씨 %.1f\'F입니다",tempC,tempF);
		
	}
}












