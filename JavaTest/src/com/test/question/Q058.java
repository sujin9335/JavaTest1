package com.test.question;

public class Q058 {

	public static void main(String[] args) {
		int a=1;
		
		for(int i=10; i<=100; i+=10) {
			sum(a,i);
			a+=10;
		}
		
	}
	
	public static void sum(int num1, int num2) {
		int sum=0;
		
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		System.out.printf("%2d ~ %3d: %4d\n",num1,num2,sum);
	}
		
	
}




