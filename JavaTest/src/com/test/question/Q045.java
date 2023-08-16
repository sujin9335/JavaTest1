package com.test.question;

import java.util.Scanner;

public class Q045 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int input=0;
		String result="";
		int count=0;
		int num=0;
		
		System.out.print("최대 숫자: ");
		input=scan.nextInt();
		
		for(int i=1; i<=input; i++) {
			
			
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) { //1의자리 숫자
				count++;
				num=i/10;
			}else {
				num=i/10;
			}
			
			if(num%10 == 3 || num%10 == 6 || num%10 == 9) {
				count++;
				num=num/10;
			}else {
				num=num/10;
			}
			
			if(num%10 == 3 || num%10 == 6 || num%10 == 9) {
				count++;
				num=num/10;
			}else {
				num=num/10;
			}
			
			
			
			if(count == 0) {
				result+=i+" ";
				count=0;
			}else if(count == 1) {
				result+="짝 ";
				count=0;
			}else if(count == 2) {
				result+="짝짝 ";
				count=0;
			}else if(count == 3) {
				result+="짝짝짝 ";
				count=0;
			}
			
			
			
			
		}
		
		System.out.println(result);

		
	}
}




