package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		
//		요구사항
//		아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
//
//		입력..
//		아빠 생일(년): 1970 
//
//		아빠 생일(월): 5 
//
//		아빠 생일(일): 10 
//
//		딸 생일(년): 1998 
//
//		딸 생일(월): 7 
//
//		딸 생일(일): 22 
		
		
		int fYear;
		int fMonth;
		int fDay;
		int dYear;
		int dMonth;
		int dDay;
		long result;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아빠 생일(년): ");
		fYear=scan.nextInt();
		System.out.print("아빠 생일(월): ");
		fMonth=scan.nextInt();
		System.out.print("아빠 생일(일): ");
		fDay=scan.nextInt();
		
		System.out.print("딸 생일(년): ");
		dYear=scan.nextInt();
		System.out.print("딸 생일(월): ");
		dMonth=scan.nextInt();
		System.out.print("딸 생일(일): ");
		dDay=scan.nextInt();
		
	
		Calendar father=Calendar.getInstance();
		father.set(fYear, fMonth, fDay);
		long fTick=father.getTimeInMillis();		
		
		Calendar daughter=Calendar.getInstance();
		daughter.set(dYear, dMonth, dDay);
		long dTick=daughter.getTimeInMillis();
		
		result=dTick-fTick;
	
		System.out.printf("아빠는 딸보다 총 %d일을 더 살았습니다", result/1000/60/60/24);
		
		
	}
	
	
	
}




