package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {
		
		int input=0;
		Scanner scan = new Scanner(System.in);
		input=scan.nextInt();
		
		for(int i=1; i<=input; i++) {
			for(int k=i; k<input; k++) {
				System.out.printf(" ");
			}
			
			
			for(int j=0; j<i*2-1; j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
	}
}




