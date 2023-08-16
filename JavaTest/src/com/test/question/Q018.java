package com.test.question;

public class Q018 {

	public static void main(String[] args) {
		
//		인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
//
//		조건..
//		int positive(int)
//		int positive(int, int)
//		int positive(int, int, int)
//		int positive(int, int, int, int)
//		int positive(int, int, int, int, int)
		
		int count;
		count = positive(10);
		System.out.printf("양수 : %d\n",count);
		count = positive(10, 20);
		System.out.printf("양수 : %d\n",count);
		count = positive(10, 20, -30);
		System.out.printf("양수 : %d\n",count);
		count = positive(10, 20, -30, 40);
		System.out.printf("양수 : %d\n",count);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d\n",count);
		
	}

	private static int positive(int a) {
		int result=0; 
		result= 0 < a ? ++result : result;
		return result;
	}
	
	private static int positive(int a, int b) {
		int result=0; 
		
		result= 0 < a ? ++result : result;
		result= 0 < b ? ++result : result;
		
		return result;
	}
	
	private static int positive(int a, int b, int c) {
		int result=0; 
		
		result= 0 < a ? ++result : result;
		result= 0 < b ? ++result : result;
		result= 0 < c ? ++result : result;
		
		return result;
	}
	
	private static int positive(int a, int b, int c, int d) {
		int result=0; 
		
		result= 0 < a ? ++result : result;
		result= 0 < b ? ++result : result;
		result= 0 < c ? ++result : result;
		result= 0 < d ? ++result : result;
		
		return result;
	}
	
	private static int positive(int a, int b, int c, int d, int e) {
		int result=0; 
		
		result= 0 < a ? ++result : result;
		result= 0 < b ? ++result : result;
		result= 0 < c ? ++result : result;
		result= 0 < d ? ++result : result;
		result= 0 < e ? ++result : result;
		
		return result;
	}
	
	
	
	
}








