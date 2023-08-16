package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input="";
		
		System.out.print("숫자: ");
		input=scan.nextLine();
		String[] result=new String[input.length()];
		
		int sum=0;
		
		for(int i=0; i<input.length(); i++) {
			sum+=input.charAt(i)-48;
			result[i]=input.substring(i,i+1);
		}
		
		
		
		System.out.printf("결과: %s + %s + %s = %d"
				,result[0],result[1],result[2],sum);
		
		
		
	}
}





