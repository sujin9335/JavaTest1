package com.test.question;

public class Q052 {

	public static void main(String[] args) {
		
		int input=5;
		
		
		for(int i=1; i<=input; i++) {
			char eng='a';
			
			
			for(int k=i; k<input; k++) {
				System.out.printf(" ");
			}
			
			
			for(int j=0; j<i; j++) {
				System.out.printf("%c",eng);
				eng++;
			}
			
			for(int j=0; j<i; j++) {
				eng--;
				System.out.printf("%c",eng);
			}
			
			
			
			System.out.println();
		}
		
		
		
	}
}





