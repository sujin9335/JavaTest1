package com.test.java.obj.inheritance;

public class Ex58_Generic {

	public static void main(String[] args) {
		
		//Item item=new Item();
		Item<String> item=new Item<String>();
		item.c="문자열";
		
		Item<Integer> item2=new Item<Integer>();
		//Item<Int> item2=new Item<Int>(); //값형은 못넣음
		item2.c=100;
		
		Pen2<Boolean> pen=new Pen2<Boolean>();
		pen.a=true;
		pen.b=false;
		pen.c=true;
		
		
		Note<String,Integer> note=new Note<String,Integer>("홍길동",20);
		
		System.out.println(note.getA());
		System.out.println(note.getB());
		
		
		
		
	}
}

//제너릭 클래스
//- T: 타입 변수(메소드의 매개변수 역할)
//- <>: 인자 리스트(메소드의 () 역할0

class Item<T>{
	public int a;
	public int b;
	public T c;//클래스 선언가찌는 결정(x) > 객체를 생성할 때 결정(o);
	
	
}

class Pen2<T>{
	
	public T a;
	public T b;
	public T c;
	
	
}


class Desk<T>{
	
	public T a;//멤버 변수의 자료형
	
	public void set(T a) { //메소드 매개변수의 자료형
		this.a=a;
		
		T b;//지역변수의 자료형 > 비권장..
	
	}
	
	
	public T get() {//메소드 반환타입
		return this.a;
		
	}
	
	
}

class Note<T,U>{
	
	public T a;
	public U b;
	
	public Note(T a, U b) {
		this.a=a;
		this.b=b;
	}
	
	public T getA() {
		return this.a;
	}
	
	public U getB() {
		return this.b;
	}
	
}


class Wrapper<T>{
	
	private T data;
	
	public Wrapper(T data) {
		this.data=data;
		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
	
	
	
}











