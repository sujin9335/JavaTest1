package com.test.question;

public class Q041 {

	public static void main(String[] args) {
		
		int sum=0;
		
		
		for(int i=1; ;i++) {
			sum+=i;
			System.out.printf("%d + ",i);
			if(sum > 1000) {
				System.out.printf("\b\b= %d",sum);
				break;
			}
				
		}
			
			
		
		
		
		
		
	}
}






