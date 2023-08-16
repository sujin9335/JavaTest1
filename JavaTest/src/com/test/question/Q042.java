package com.test.question;

import java.util.Calendar;

public class Q042 {

	
public static void main(String[] args) {
		
		int sumDay=0;
		Calendar now=Calendar.getInstance();
		
		int month=0;
		int day=0;
		int year=0;
		
		month=now.get(Calendar.MONTH)+1; // 해당달 -1 > 7
		day=now.get(Calendar.DATE);
		year=now.get(Calendar.YEAR);
		
		for(int i=1; i<year; i++) {
			if(0 != i%4 || (0 == i%100 && 0 != i%400) ) { //평년
				sumDay+=365;
			}else if(0 != i%100 || 0 == i%400) { //윤년
				sumDay+=366;
			}
		}
		
//		System.out.println(sumDay);
//		System.out.println(month);
//		System.out.println(day);
		
		for(int i=1; i<month; i++) {
		
			if(0 != year%4 || (0 == year%100 && 0 != year%400) ) {
				switch(i) { //평년 해당 월까지의 일자 값 
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						sumDay+=31;
						break;
					case 2:
						sumDay+=28;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						sumDay+=30;
						break;
				}
				
			}else if(0 != year%100 || 0 == year%400) {
				switch(i) { //윤년 해당 월까지의 일자 값
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						sumDay+=31;
						break;
					case 2:
						sumDay+=29;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						sumDay+=30;
						break;
			}
			}
		}
//		System.out.println(sumDay);
		sumDay+=day;
		
//		System.out.println(sumDay);
		
		String week=chek(now.get(Calendar.DAY_OF_WEEK));
		
		System.out.printf("%d년 %d월 %d일은 %d일쨰 되는 날이고 %s입니다",year,month,day,sumDay,week);
		
		
		
	}

	private static String chek(int i) {
		String result="";
		switch(i) {
		
			case 1 : result="일요일"; break;
			case 2 : result="월요일"; break;
			case 3 : result="화요일"; break;
			case 4 : result="수요일"; break;
			case 5 : result="목요일"; break;
			case 6 : result="금요일"; break;
			case 7 : result="토요일"; break;
		
		
		}
		
		
		
		return result;
	}
	
	
}








