package com.test.question;

import java.util.Scanner;

public class Q037 {

	public static void main(String[] args) {
//		요구사항
//		숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.
//
//		입력..
//		숫자: 5 
//
//		출력..
//		1 ~ 5 = 15
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		int sum=0;
		
		System.out.print("입력: ");
		num=scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum++;
		}
		System.out.printf("1 ~ %d = %d",num,sum);
		
	}
}







