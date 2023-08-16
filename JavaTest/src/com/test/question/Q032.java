package com.test.question;

import java.util.Scanner;

public class Q032 {

	public static void main(String[] args) {
		
//		요구사항
//		주차 요금을 계산하시오.
//
//		조건..
//		무료 주차: 30분
//		초과 10분당: 2,000원
		
		Scanner scan = new Scanner(System.in);
		
		int inHour;
		int inMin;
		int outHour;
		int outMin;
		int totalHour;
		int totalMin;
		
		int freeMin=30;
		int price=2000;
		
		System.out.println("[들어온시간]");
		System.out.print("시: ");
		inHour=scan.nextInt();
		System.out.print("분: ");
		inMin=scan.nextInt();
		
		System.out.println("[들어온시간]");
		System.out.print("시: ");
		outHour=scan.nextInt();
		System.out.print("분: ");
		outMin=scan.nextInt();
		
		totalHour=outHour-inHour;
		totalMin=outMin-inMin;
		
		int result=((totalHour*60)+totalMin)-30;
		
		
		System.out.printf("주차 요금은 %,d원입니다",result/10*2000);
		
		
		
		
	}
}







