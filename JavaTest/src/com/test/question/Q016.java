package com.test.question;

public class Q016 {

	public static void main(String[] args) {
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
		
		
		
		
	}

	private static void sum(int a) {
		System.out.printf("%d=%d\n",a,a);
	}
	private static void sum(int a, int b) {
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
	private static void sum(int a, int b, int c) {
		System.out.printf("%d+%d+%d=%d\n",a,b,c,a+b+c);
	}
	private static void sum(int a, int b, int c, int d) {
		System.out.printf("%d+%d+%d+%d=%d\n",a,b,c,d,a+b+c+d);
	}
	private static void sum(int a, int b, int c, int d, int e) {
		System.out.printf("%d+%d+%d+%d+%d=%d\n",a,b,c,d,e,a+b+c+d+e);
	}
	
}










