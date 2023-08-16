package com.test.question;

import java.util.Scanner;

public class Q049 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input=0;
		System.out.print("행: ");
		input=scan.nextInt();
		
		
		for(int i=0; i<input; i++) {
			for(int k=0; k<i; k++) {
				System.out.printf(" ");
			}
			
			
			for(int j=i; j<input; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
