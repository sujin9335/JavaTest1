package com.test.java.obj;

public class Ex42_Constructor {

	public static void main(String[] args) {
		
		//Cup
		
		/*
		
			생성자, Constructor
			- (특수한 목적을 가지고) 메소드
			- 멤버를 초기화 하는 역할
		
		
		*/
		
		//자료명 변수명 = new 생성자();
		Box box=new Box();
		
		
		//모든 참조형(배열 포함)은 객체 생성 직후 자동으로 멤버가 초기화가 된다
		
		//실행순서
		//1. new > 객체 생성 연산자 > 객체를 생성한다
		//2. cup()
		
		//단계
		//new > yellow, 300 - 기본생성자를 설정해줄때
		//new > null, 0 > yellow, 300 - 기본생성자를 설정안해줄때
		
		Cup c1=new Cup();
		
		//c1.setColor("yellow");
		//c1.setSize(300);
		System.out.println(c1.info());

		
		//new > yellow,300 > green, 500
		Cup c2=new Cup();
		c2.setColor("green");
		c2.setSize(500);
		System.out.println(c2.info());
		
		
		//new > pink, 300
		Cup c3=new Cup("pink");
		System.out.println(c3.info());
		
		
		Cup c4=new Cup(350);
		System.out.println(c4.info());
		
		
		Cup c5=new Cup("orange", 600);
		System.out.println(c5.info());
		
		
		//The method Cup() is undefined > Cup()을 일반메소드취급
		//** 생성자는 반드시 new와 함께 사용이 가능하다 > 생성자는 평생 딱 1번만 호출이 가능하다
		//Cup(); 
		
		
		
	}//main
	
	
}










