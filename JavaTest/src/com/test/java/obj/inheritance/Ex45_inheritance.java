package com.test.java.obj.inheritance;


public class Ex45_inheritance {

	public static void main(String[] args) {
		/*
		
		상속, Inheritance
		- 부모가 가지는 재상을 자식에게 물려주는 행동
		- 부모 클래스가 가지는 재산을 자식 클래스에게 물려주는 행동
		- 자식 클래스가 코드를 구현하지 않아도, 부모 클래스로부터 구현된 코드를 물려받는 행동
		
		왜?
		- 비용 절감
		- 코드 재사용(***************)
		
		상속 관계에 있는 클래스 호칭
		- 부모 클래스 <- 자식 클래스
		- 슈퍼 클래스 <- 서브 클래스
		- 기본 클래스 <- 확장 클래스
		- 기본 크래스 <- 파상 클래스
		
		
	
	*/
	
	Parent p=new Parent();
	p.a=10;
	p.b=20;
	
	Child c=new Child();
	
	c.a=10;
	c.b=20;
	c.aaa();
	
	
	c.c=30;
	c.d=40;
	c.ccc();
	
	
	
	
	
	
	}
	
	
}

//부모 클래스
class Parent{
	public int a;
	public int b;
	
	public void aaa() {
		System.out.println("aaa");
		
	}
	
}

//자식 클래스 -(자식이 부모클래스 선언하는이유는 부모에 선언하면 자식이 존재하지도않는데 먼저 선언될수있음)
class Child extends Parent{
	
	public int c;
	public int d;
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}



//회원
//1. 일반 회원
// - 이름
// - 아이디
// - 암호
// - 이메일

//2. 관리자 회원
//- 이름
//- 아이디
//- 암호
//- 등급


//부모 클래스
class Member{
	public String name;
	public String id;
	public String pw;
	
}

//일반회원
class User  extends Member{
	public String email;

}

//관리자 회원
class Administrator extends Member{
	public String lv;
	
}





class AAA{
	public int a=10;
}

class BBB extends AAA{
	public int b=20;
}

class CCC extends BBB{
	public int c=30;
}

class DDD extends CCC{
	public int c=40;
}





