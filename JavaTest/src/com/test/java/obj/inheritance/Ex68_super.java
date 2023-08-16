package com.test.java.obj.inheritance;

public class Ex68_super {

	public static void main(String[] args) {
		
		//this vs super
		//- 객체 지점 연산자
		//- this: 자기 자신
		//- super: 부모
		
//		CupParent p1=new CupParent();
//		p1.check();
		
		CupChild c1=new CupChild();
		c1.check();
		
		
	}
	
	
}

class CupParent{
	
	private int a=10;
	public int b=20;
	
	public void check() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
}

class CupChild extends CupParent{
	
	private int c=30;
	public int d=40;
	
	public void check() {
		System.out.println(this.c);
		System.out.println(this.d);
		
		//System.out.println(this.a);
		//System.out.println(this.b);
		super.check();
	}

	public CupChild(int c, int d) {
		super();
		this.c = c;
		this.d = d;
	}

	public CupChild() {
		
	}
}






