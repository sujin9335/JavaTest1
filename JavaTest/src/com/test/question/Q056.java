package com.test.question;

import java.util.Scanner;

public class Q056 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		
		String num1Y="";
		String num2Y="";
		
		String numY="";
		
		System.out.print("첫번째 숫자: ");
		num1=scan.nextInt();
		num1Y=yak(num1);
		System.out.print("두번째 숫자: ");
		num2=scan.nextInt();
		num2Y=yak(num2);
		
		
		
		for(int i=1; i<=num1; i++) {
			if(num1%i == 0) {
				for(int j=1; j<=num2; j++) {
					if(num2%j == 0) {
						if(i == j) numY+=i+", ";
					}
				}
				
			}
		}
		
		
		System.out.printf("%d의 약수: %s\n",num1,num1Y);
		System.out.printf("%d의 약수: %s\n",num2,num2Y);
		System.out.printf("%d와 %d의 공약수: %s\n",num1,num2,numY);
		
		
	}
	
	public static String yak(int num) {
		String result="";
		for(int i=1; i<=num; i++) {
			if(num%i == 0) result+=i+", ";
		}
		return result;
		
		
	}
}





