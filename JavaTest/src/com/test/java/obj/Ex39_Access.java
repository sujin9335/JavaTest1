package com.test.java.obj;

import java.util.Calendar;

public class Ex39_Access {

	public static void main(String[] args) {
		
		/*
		
			접근 지정자(제어자), Access Modifier
			- 클래스 멤버에 붙여서 사용한다. > 멤버 변수, 멤버 메소드
			- 클래스 자체에 붙어서 사용한다.
			- 지역 변수에는 사용이 불가능하다.
			- 클래스(객체)의 영역을 기준으로, 외부에 해당 멤버를 어떻게 노출할지
				통제하는 역할 > 보안 수준 제어
			
			1. public
			2. private
			-----------
			3. protected > 상속
			4. default > 패키지
		
			
			public
			
			
			private
			
			
			
		*/
		
		Box box=new Box();
		
		box.color="갈색"; //public
		//box.size=100; //private
		
		box.aaa();
		//box.bbb();
		
		
		//book 객체
		Book book=new Book();
		
//		book.title="자바의 정석";
//		book.auther="홍길동";
//		book.publisher="도우출판";
//		book.price=30000;
//		book.page=1000;
		
//		int temp=30000; //책 가격
//		
//		if(temp >= 0 && temp <= 100000) {
//			book.price=temp;
//		}else {
//			
//		}
		
//		System.out.println(book.price);
		
		
		
		
		book.aaa("자바의 정석");
		book.bbb(30000); // 쓰기 > Setter
//		System.out.println("책가격: "+book.ccc()); //읽기 > Getter
		
		book.setTitle("자바의 정석");
		System.out.println(book.getTitle());
		
		
		Mouse m1=new Mouse();
		
		m1.setModel("M904");
		System.out.println(m1.getModel());
		
		//쓰기전용
		m1.setPrice(50000);
//		System.out.println(m1.price);
		
		//읽기전용
		System.out.println(m1.getColor());
		
		//Getter/Setter 역할
		//1. private 멤버 > 인터페이스 역할
		//2. 읽기 전용 멤버, 쓰기 전용 멤버
		
//		Calendar date = Calendar.getInstance();
//		date.add(Calendar.YEAR, -3);
//		
//		m1.setDate(date);
//		System.out.printf("마우스 제조년월일: %tF\n",m1.getDate());
		
		
		//m1.getState() > private String state
		
		//(객체) 사용자 편의성 향상
		m1.setDate(2020, 7, 31);
		
		System.out.println(m1.getDate());
		
		
		System.out.println(m1.getState());
		
		
		
		//m1의 현재 모든 상태확인?
		
//		System.out.println(m1.getModel());
		
		//개발자가 객체의 상태를 확인하고 싶을 때 사용하는 메소드
		System.out.println(m1.info());
		
		
		
	}//main
}//class








