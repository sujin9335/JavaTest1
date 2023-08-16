package com.test.question;

import java.util.Scanner;

public class Q024 {

	public static void main(String[] args) {
//		여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
//
//		조건..
//		전화를 걸면 짜장면은 10분 뒤에 도착합니다.
//		전화를 걸면 치킨은 18분 뒤 도착합니다.
//		전화를 걸면 피자는 25분 뒤 도착합니다.
//		음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
		
		Scanner scan = new Scanner(System.in);
		
		int jaMin=10;
		int chMin=18;
		int piMin=25;
		int hour;
		int min;
		
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.println("시: ");
		hour=scan.nextInt();
		
		System.out.println("분: ");
		min=scan.nextInt();
		
		
		
		System.out.printf("짜장면: %d시 %d분\n"
					,(min-jaMin < 0) ? hour-1 : hour
					,(min-jaMin < 0) ? 60+(min-jaMin) : min-jaMin);
		System.out.printf("치킨: %d시 %d분\n"
					,(min-chMin < 0) ? hour-1 : hour
					,(min-chMin < 0) ? 60+(min-chMin) : min-chMin);
		System.out.printf("피자: %d시 %d분\n"
					,(min-piMin < 0) ? hour-1 : hour
					,(min-piMin < 0) ? 60+(min-piMin) : min-piMin);
		
		
		
		
	}
	
	
	
}





