package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year;
		int month;
		int day;
		
		
		System.out.print("년: ");
		year=scan.nextInt();
		System.out.print("월: ");
		month=scan.nextInt();
		System.out.print("일: ");
		day=scan.nextInt();
		
			
		Calendar input=Calendar.getInstance();
		
		input.set(year, month-1, day);
		
		
		if(2 <= input.get(Calendar.DAY_OF_WEEK) && input.get(Calendar.DAY_OF_WEEK) <= 6) {
			input.set(Calendar.DAY_OF_WEEK, 7);
			System.out.printf("입력하신 날짜는 \'평일\'입니다\n");
			System.out.printf("해당 주의 토요일로 이동합니다\n");
			System.out.printf("이동한 날짜는 \'%tF\'입니다\n", input);
	
		}else if(1 == input.get(Calendar.DAY_OF_WEEK) || 7 == input.get(Calendar.DAY_OF_WEEK)) {
			System.out.println("입력하신 날짜는 \'휴일(토/일)\'입니다.");
			System.out.println("결과가 없습니다");
		}else {
			System.out.println("잘못입력");
		}
		
		
		
	}
}
