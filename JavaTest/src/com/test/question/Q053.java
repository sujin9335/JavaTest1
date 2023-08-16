package com.test.question;

public class Q053 {

	public static void main(String[] args) {
		
		
		
		for(int i=1; i<=9; i++) {
			
			for(int j=1; j<5; j++) {
				System.out.printf("%d x %d = %d \t",j+1,i,(j+1)*i);
			}
			
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=9; i++) {
			
			for(int j=5; j<9; j++) {
				System.out.printf("%d x %d = %d \t",j+1,i,(j+1)*i);
			}
			
			System.out.println();
		}
		
	}
	
}






