package com.test.question;

public class Q057 {

	public static void main(String[] args) {
		
		for(int i=10; i<=100; i+=10) {
			sum(i);
			
		}
		
	}
	
	public static void sum(int num) {
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.printf("1 ~ %3d: %4d\n",num,sum);
	}
	
}




