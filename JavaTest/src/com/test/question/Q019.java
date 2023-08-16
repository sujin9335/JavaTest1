package com.test.question;

import java.util.Calendar;

public class Q019 {

	public static void main(String[] args) {
		
//		요구사항
//		현재 시간을 출력하는 메소드 선언하시오.
//
//		조건..
//		void nowTime()
//		현재 시간을 24시간으로 출력하시오.
//		현재 시간을 오전/오후로 출력하시오.
		
		nowTime();
		
		
	}
	
	public static void nowTime() {
		
		Calendar time=Calendar.getInstance();
		
		System.out.printf("현재 시간 : %d시 %d분 %d초\n"
						,time.get(Calendar.HOUR_OF_DAY)
						,time.get(Calendar.MINUTE)
						,time.get(Calendar.SECOND));
		
		System.out.printf("현재 시간 : %s %d시 %d분 %d초\n"
						,time.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
						,time.get(Calendar.HOUR)
						,time.get(Calendar.MINUTE)
						,time.get(Calendar.SECOND));
		
		
	}
	
	
	
}






