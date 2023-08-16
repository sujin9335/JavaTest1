package com.test.question;

public class Q060 {

	public static void main(String[] args) {
		
		String result="1 + 1 + ";
		int num1=1;
		int num2=1;
		int sum=0;
		
		int total=2;
		
		for(int i=1; ; i++) {
			sum=num1+num2;
			if(sum > 100) break;
			num1=num2;
			num2=sum;
			total+=sum;
			result+=sum+" + ";
		}
		System.out.printf("%s= %d",result,total);
		
		
	}
}
