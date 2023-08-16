package com.test.question;

import java.util.Scanner;

public class Q050 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input=0;
		
		
		System.out.print("행: ");
		input=scan.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int k=i+1; k<input; k++) {
				System.out.printf(" ");
			}
			
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}




