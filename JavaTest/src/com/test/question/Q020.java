package com.test.question;

import java.util.Calendar;

public class Q020 {

	public static void main(String[] args) {
//		요구사항
//		오늘 태어난 아이의 백일과 첫돌을 출력하시오.
//
//		출력..
//		백일: 2023-10-29
//		첫돌: 2024-07-21
		
		Calendar backTime=Calendar.getInstance();
		
		backTime.add(Calendar.DATE, 100);
		
		System.out.printf("백일 : %tF\n", backTime);
		
		
		Calendar firstBirthday=Calendar.getInstance();
		
		firstBirthday.add(Calendar.DATE, 365+1);
		
		System.out.printf("백일 : %tF\n", firstBirthday);
		
		
	}
	
	
}







