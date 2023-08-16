package com.test.question;

public class Q055 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<100; i++) {
			int sum=0;
			String sSum="";
			
			for(int j=1; j<i; j++) {
				if(i%j == 0) {
					sSum+=j+", ";
					sum+=j;
				}
			}
			if(sum == i) {
				System.out.printf("%d = [%s]\n",i,sSum);
			}
			
			
		}
		
		
		
	}
}




