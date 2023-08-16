package com.test.question;

import java.util.Scanner;

public class Q031 {
	public static void main(String[] args) {
		
//		요구사항
//		숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
//
//		입력..
//		숫자 입력: 3 
//
//		숫자 입력: 2 
//
//		숫자 입력: 7 
//
//		숫자 입력: 1 
//
//		숫자 입력: 8 
		
		Scanner scan = new Scanner(System.in);
		
		int even=0; //짝수
		int odd=0; //홀수
		
		int num1;
		int result;
//		int num2;
//		int num3;
//		int num4;
//		int num5;
		
//		System.out.print("숫자 입력: ");
//		num1=scan.nextInt();
//		System.out.print("숫자 입력: ");
//		num2=scan.nextInt();
//		System.out.print("숫자 입력: ");
//		num3=scan.nextInt();
//		System.out.print("숫자 입력: ");
//		num4=scan.nextInt();
//		System.out.print("숫자 입력: ");
//		num5=scan.nextInt();
		
		for(int i=1; i<6; i++) {
			System.out.print("숫자 입력: ");
			num1=scan.nextInt();
			if((num1%2) == 0) {
				++even;
			}else if((num1%2) == 1){
				++odd;
			}
			
		}
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다\n",even,odd);
		if(0<even-odd) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다",even-odd);
		}else if(even-odd<0) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다",odd-even);
		}
		
		
		
		
//		if((num1%2) == 0) {
//			++even;
//		}else if((num1%2) == 1){
//			++odd;
//		}
		
		
		
		
	}
	
}







