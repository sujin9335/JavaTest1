package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {

	public static void main(String[] args) {
		
		//대중적인 오버라이드
		
		Time t1=new Time(2, 30);
		
		
		//
		//com.test.java.obj.inheritance.Time@5aaa6d82
		System.out.println(t1);
		
		//String java.lang.Object.toString()
		System.out.println(t1.toString());	//2:30
		System.out.println(t1.info()); 		//2:30 > 나밖에 모르는 이름
		
		
		Date now=new Date();
		
		//Wed Aug 02 11:48:55 KST 2023
		System.out.println(now);
		
		//String java.util.Date.toString()
		System.out.println(now.toString());
		
		
		
		
		
		
	}
}


class Time{
	
	private int hour;
	private int minute;
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	
	//덤프..
	public String info() {
		
		
		return this.hour+":"+this.minute;
	}
	
	@Override //어노테이션(Annotation)
	public String toString() {
		
		return this.hour+":"+this.minute;
	}
	
	
	
	
}













