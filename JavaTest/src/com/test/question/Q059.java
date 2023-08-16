package com.test.question;

public class Q059 {

	public static void main(String[] args) {
		
		String result="";
		
		int sum=1;
		int total=0;
		
		for(int i=1; i<100; i++) {
			if(sum > 100) break;
			result+=sum+" + ";
			total+=sum;
			sum+=i;
			
		}
		System.out.printf("%s= %d",result,total);

		
	}
}
